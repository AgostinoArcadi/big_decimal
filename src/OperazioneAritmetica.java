import java.math.*;

public class OperazioneAritmetica {
    private OperazioneEnum operazioneEnum;

    public OperazioneAritmetica(OperazioneEnum tipoOperzione) {
        this.operazioneEnum = tipoOperzione;
    }

    public OperazioneEnum getOperazioneEnum() {
        return operazioneEnum;
    }

    public void setOperazioneEnum(OperazioneEnum operazioneEnum) {
        this.operazioneEnum = operazioneEnum;
    }

    public BigDecimal operazione(BigDecimal x, BigDecimal y) {
        BigDecimal result = new BigDecimal(0);

        switch (operazioneEnum) {
            case ADDIZIONE:
                result = x.add(y);
                System.out.println(x + " + " + y);
                break;
            case SOTTRAZIONE:
                result = x.subtract(y);
                System.out.println(x + " - " + y);
                break;
            case MOLTIPLICAZIONE:
                result = x.multiply(y);
                System.out.println(x + " * " + y);
                break;
            case DIVISIONE:
                result = x.divide(y);
                System.out.println(x + " / " + y);
                break;
            case MIN:
                result = x.min(y);
                System.out.println("Numero minore tra: " + x + " e " + y);
                break;
            case MAX:
                result = x.max(y);
                System.out.println("Numero maggiore tra: " + x + " e " + y);
                break;
        }
        return result;
    }
}
