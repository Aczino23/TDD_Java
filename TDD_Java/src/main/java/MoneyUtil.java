import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyUtil {

    public static String format(double valor) {
       return format(valor, "$");
    }

    public static String format(double valor, String simbolo) {
        if (simbolo == null) {
            throw new IllegalArgumentException("simbolo is null"); // se lanza una exepcion
        }
        if (valor < 0) {
            simbolo = "-" + simbolo;
            valor = valor * -1;
        }
        BigDecimal valorRedondiado = new BigDecimal(valor).setScale(2, RoundingMode.HALF_UP);
        return simbolo + valorRedondiado;
    }

}
