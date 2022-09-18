import hangman.model.BonusScore;
import hangman.model.GameScore;
import hangman.model.OriginalScore;
import hangman.model.PowerBonusScore;
import hangman.model.exceptions.GameScoreException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameScoreTest {
    private GameScore original = new OriginalScore();
    private GameScore bonus = new BonusScore();
    private GameScore power = new PowerBonusScore();

    @Test
    public void dadoEnOriginalScore_dosNumeros_Cuando_sonMenosDos_Entonces_retornaExceptionPARAMETROS_NEGATIVOS() {
        try {
            original.calculateScore(-2, -2);
        } catch (GameScoreException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void dadoEnOriginalScore_dosNumeros_Cuando_esCienYCero_Entonces_retornaCien() {
        //Arrange
        int correctCount = 100;
        int incorrectCount = 0;
        int valorEsperado = 100;
        //Action
        int score = original.calculateScore(correctCount, incorrectCount);
        //Assertion
        assertEquals(valorEsperado, score);
    }

    @Test
    public void dadoEnOriginalScore_dosNumeros_Cuando_esDosYCinco_Entonces_retornaCincuenta() {
        //Arrange
        int correctCount = 2;
        int incorrectCount = 5;
        int valorEsperado = 50;
        //Action
        int score = original.calculateScore(correctCount, incorrectCount);
        //Assertion
        assertEquals(valorEsperado, score);
    }

    @Test
    public void dadoEnOriginalScore_dosNumeros_Cuando_esTresYDoce_Entonces_retornaCero() {
        //Arrange
        int correctCount = 3;
        int incorrectCount = 12;
        int valorEsperado = 0;
        //Action
        int score = original.calculateScore(correctCount, incorrectCount);
        //Assertion
        assertEquals(valorEsperado, score);
    }

    @Test
    public void dadoEnBonusScore_dosNumeros_Cuando_sonMenosTres_Entonces_retornaExceptionPARAMETROS_NEGATIVOS() {
        try {
            bonus.calculateScore(-3, -3);
        } catch (GameScoreException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void dadoEnBonusScore_dosNumeros_Cuando_esDosyCero_Entonces_retornaVeinte(){
        //Arrange
        int correctCount = 2;
        int incorrectCount = 0;
        int valorEsperado = 20;
        //Action
        int score = bonus.calculateScore(correctCount, incorrectCount);
        //Assertion
        assertEquals(valorEsperado, score);
    }

    @Test
    public void dadoEnBonusScore_dosNumeros_Cuando_esOchoyCinco_Entonces_retornaCincuentaycinco() {
        //Arrange
        int correctCount = 8;
        int incorrectCount = 5;
        int valorEsperado = 55;
        //Action
        int score = bonus.calculateScore(correctCount, incorrectCount);
        //Assertion
        assertEquals(valorEsperado, score);
    }

    @Test
    public void dadoEnBonusScore_dosNumeros_Cuando_esDosyNueve_Entonces_retornaCero() {
        //Arrange
        int correctCount = 2;
        int incorrectCount = 9;
        int valorEsperado = 0;
        //Action
        int score = bonus.calculateScore(correctCount, incorrectCount);
        //Assertion
        assertEquals(valorEsperado, score);
    }

    @Test
    public void dadoEnPowerBonusScore_dosNumeros_Cuando_sonMenosCuatro_Entonces_retornaExceptionPARAMETROS_NEGATIVOS() {
        try {
            power.calculateScore(-4, -4);
        } catch (GameScoreException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void dadoEnPowerBonusScore_dosNumeros_Cuando_esTresyCero_Entonces_retornaCientocincuentaycinco() {
        //Arrange
        int correctCount = 3;
        int incorrectCount = 0;
        int valorEsperado = 155;
        //Action
        int score = power.calculateScore(correctCount, incorrectCount);
        //Assertion
        assertEquals(valorEsperado, score);
    }

    @Test
    public void dadoEnPowerBonusScore_dosNumeros_Cuando_esCincoyCero_Entonces_retornaQuinientos() {
        //Arrange
        int correctCount = 5;
        int incorrectCount = 0;
        int valorEsperado = 500;
        //Action
        int score = power.calculateScore(correctCount, incorrectCount);
        //Assertion
        assertEquals(valorEsperado, score);
    }

    @Test
    public void dadoEnPowerBonusScore_dosNumeros_Cuando_esCeroyDos_Entonces_retornaCero() {
        //Arrange
        int correctCount = 0;
        int incorrectCount = 2;
        int valorEsperado = 0;
        //Action
        int score = power.calculateScore(correctCount, incorrectCount);
        //Assertion
        assertEquals(valorEsperado, score);
    }

    @Test
    public void dadoEnPowerBonusScore_dosNumeros_Cuando_esTresyUno_Entonces_retornaCientocuarentaysiete() {
        //Arrange
        int correctCount = 3;
        int incorrectCount = 1;
        int valorEsperado = 147;
        //Action
        int score = power.calculateScore(correctCount, incorrectCount);
        //Assertion
        assertEquals(valorEsperado, score);
    }
}
