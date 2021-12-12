package tn.isima.formationadd.exception;

public class FormationNotFoundException  extends RuntimeException {
    public FormationNotFoundException (String message) {
        super(message);
    }
}