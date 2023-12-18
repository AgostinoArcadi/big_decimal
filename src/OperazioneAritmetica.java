import java.math.*;

public class OperazioneAritmetica {
    private OperazioneEnum tipoOperzione;

    public OperazioneAritmetica(OperazioneEnum tipoOperzione) {
        this.tipoOperzione = tipoOperzione;
    }

    public OperazioneEnum getTipoOperzione() {
        return tipoOperzione;
    }

    public void setTipoOperzione(OperazioneEnum tipoOperzione) {
        this.tipoOperzione = tipoOperzione;
    }

    public BigDecimal operazione(BigDecimal x, BigDecimal y) {
        BigDecimal result = new BigDecimal(0);

        switch (tipoOperzione) {
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
        }
        return result;
    }
}
