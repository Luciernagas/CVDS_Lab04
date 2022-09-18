package hangman.model;

import hangman.model.exceptions.GameScoreException;

public class PowerBonusScore implements GameScore{
    /**
     * @pre correctCount y incorrectCount deben ser numeros positivos
     * @pos se bonifica la i-esima de las correctCount con 5^i y se penaliza con 8 puntos cada incorrectCount
     * @param correctCount numero de letras correctas
     * @param incorrectCount numero de letras incorrectas
     * @throws GameScoreException PARAMETROS_NEGATIVOS = "Error: Los parametros no pueden ser numeros negativos"
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {
        if( correctCount < 0 || incorrectCount <0 ) {
            throw new GameScoreException(GameScoreException.PARAMETROS_NEGATIVOS);
        }

        int score = 0;

        for( int i=1 ; i <=correctCount; i++){
            score+= (Math.pow(5,i));
        }

        score = score < incorrectCount * 8 ? 0 : score - (incorrectCount * 8);
        score = score > 500 ? 500 :score;
        return score;
    }
}
