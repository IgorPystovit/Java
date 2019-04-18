package growepam.electricaldevices.requesthandlers;

public class WiringOverloadException extends Exception {
    WiringOverloadException(){}
    WiringOverloadException(String msg){
        super(msg);
    }
}
