public enum OperazioneEnum {
    ADDIZIONE ("Addizione"),
    SOTTRAZIONE ("Sottrazione"),
    MOLTIPLICAZIONE ("Moltiplicazione"),
    DIVISIONE ("Divisione"),
    MIN ("Min"),
    MAX ("Max");

    private final String operzione;

    OperazioneEnum(String operzione) {
        this.operzione = operzione;
    }

    public String getOperzione() {
        return operzione;
    }
}
