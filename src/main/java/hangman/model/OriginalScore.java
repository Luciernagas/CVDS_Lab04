package hangman.model;

import hangman.model.exceptions.GameScoreException;

public class OriginalScore implements GameScore{
    /**
     * @pre correctCount y incorrectCount deben ser numeros positivos
     * @pos No se bonifica las correctCount pero se penaliza con 10 puntos cada incorrectCount
     * @param correctCount numero de letras correctas
     * @param incorrectCount numero de letras incorrectas
     * @throws GameScoreException PARAMETROS_NEGATIVOS = "Error: Los parametros no pueden ser numeros negativos"
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {
        if(correctCount < 0 || incorrectCount < 0) {
            throw new GameScoreException(GameScoreException.PARAMETROS_NEGATIVOS);
        }

        int score = 100;

        if(incorrectCount > 0 ) {
            score = score - (incorrectCount * 10);
        }
        if(score < 0 ){
            score = 0;
        }
        return score;
    }
}
