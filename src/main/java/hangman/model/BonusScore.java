package hangman.model;

import hangman.model.exceptions.GameScoreException;

public class BonusScore implements GameScore {
    /**
     * @pre correctCount y incorrectCount deben ser numeros positivos
     * @pos Se bonifica con 10 puntos cada correctCount y se penaliza con 5 puntos cada incorrectCount
     * @param correctCount numero de letras correctas
     * @param incorrectCount numero de letras incorrectas
     * @throws GameScoreException PARAMETROS_NEGATIVOS = "Error: Los parametros no pueden ser numeros negativos"
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {
        return 0;
    }
}
