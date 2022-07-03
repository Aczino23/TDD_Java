import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest {

    private FizzBuzz game;

    @Before
    public void before() { // se ejecuta antes de cada test
        game = new FizzBuzz();
    }

    @Test
    public void devolverUnNumeroSiNoEsMultiploDe3O5() {
        List<String> listaNumeros = game.getNumeros();
        Assert.assertEquals("1", listaNumeros.get(0)); // 1
        Assert.assertEquals("2", listaNumeros.get(1)); // 2
        Assert.assertEquals("7", listaNumeros.get(6)); // 7
        Assert.assertEquals("13", listaNumeros.get(12)); // 13
    }

    @Test
    public void devolverFizzSiEsMultiploDe3() {
        List<String> listaNumeros = game.getNumeros();
        Assert.assertEquals("Fizz", listaNumeros.get(2)); // 3 -> Fizz
        Assert.assertEquals("Fizz", listaNumeros.get(5)); // 6 -> Fizz
        Assert.assertEquals("Fizz", listaNumeros.get(8)); // 9 -> Fizz
        Assert.assertEquals("Fizz", listaNumeros.get(11)); // 12 -> Fizz
    }

    @Test
    public void devolverBuzzSiEsMultiploDe5() {
        List<String> listaNumeros = game.getNumeros();
        Assert.assertEquals("Buzz", listaNumeros.get(4)); // 5 -> Buzz
        Assert.assertEquals("Buzz", listaNumeros.get(9)); // 10 -> Buzz
        Assert.assertEquals("Buzz", listaNumeros.get(19)); // 20 -> Buzz
        Assert.assertEquals("Buzz", listaNumeros.get(24)); // 25 -> Buzz
    }

    @Test
    public void devolverFizzBuzzSiEsMultiploDe3YDe5() {
        List<String> listaNumeros = game.getNumeros();
        Assert.assertEquals("FizzBuzz", listaNumeros.get(14)); // 15 -> FizzBuzz
        Assert.assertEquals("FizzBuzz", listaNumeros.get(29)); // 30 -> FizzBuzz
        Assert.assertEquals("FizzBuzz", listaNumeros.get(59)); // 60 -> FizzBuzz
        Assert.assertEquals("FizzBuzz", listaNumeros.get(89)); // 90 -> FizzBuzz
    }

}
