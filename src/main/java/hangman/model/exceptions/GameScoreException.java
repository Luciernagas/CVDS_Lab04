package hangman.model.exceptions;

public class GameScoreException extends Exception{
    public static final String PARAMETROS_NEGATIVOS = "Error: Los parámetros no pueden ser números negativos";

    public GameScoreException(String message){
        super(message);
    }
}
