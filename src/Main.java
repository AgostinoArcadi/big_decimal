import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal num1 = BigDecimal.valueOf(10.5);
        BigDecimal num2 = BigDecimal.valueOf(3.1);

        OperazioneAritmetica sottrazione = new OperazioneAritmetica(OperazioneEnum.SOTTRAZIONE);

        System.out.println(sottrazione.getTipoOperzione().getOperzione());
        System.out.println("Risultato: " + sottrazione.operazione(num1, num2));
    }
}
