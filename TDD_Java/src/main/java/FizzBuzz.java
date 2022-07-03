import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {


    public List<String> getNumeros() {
        List<String> numeros = new ArrayList<>();
        for (int num = 1; num <= 100; num++) {
            if (num % 3 == 0 && num % 5 == 0) { // si es multiplo de 3 y de 5
                numeros.add("FizzBuzz");
            } else if (num % 3 == 0) { // si es multiplo de 3
                numeros.add("Fizz");
            } else if (num % 5 == 0) { // si es multiplo de 5
                numeros.add("Buzz");
            } else {
                numeros.add(num + "");
            }
        }
        return numeros;
    }
}
