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
        return 0;
    }
}
