package hangman.model;

import hangman.model.exceptions.GameScoreException;

public class BonusScore implements GameScore {
    /**
     * @param correctCount   numero de letras correctas
     * @param incorrectCount numero de letras incorrectas
     * @throws GameScoreException PARAMETROS_NEGATIVOS = "Error: Los parametros no pueden ser numeros negativos"
     * @pre correctCount y incorrectCount deben ser numeros positivos
     * @pos Se bonifica con 10 puntos cada correctCount y se penaliza con 5 puntos cada incorrectCount
     */
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException {
        if (correctCount < 0 || incorrectCount < 0) {
            throw new GameScoreException(GameScoreException.PARAMETROS_NEGATIVOS);
        }

        int score = 0;

        if (correctCount >= 0 && incorrectCount == 0) {
                score = correctCount * 10;
        }
        if (correctCount > 0 &&  incorrectCount * 5 < correctCount * 10) {
            score = (correctCount * 10) - (incorrectCount * 5);
        }
        if (correctCount > 0 && incorrectCount * 5 >= correctCount * 10) {
            score = 0;
        }
        return score;
    }
}
