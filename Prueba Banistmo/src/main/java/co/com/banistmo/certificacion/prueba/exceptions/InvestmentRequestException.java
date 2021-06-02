package co.com.banistmo.certificacion.prueba.exceptions;

public class InvestmentRequestException extends AssertionError {
    public InvestmentRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
