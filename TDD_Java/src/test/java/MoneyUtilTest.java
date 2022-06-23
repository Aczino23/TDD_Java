import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void moneyTest() {
        String money = MoneyUtil.format(1000);
        Assert.assertEquals("$1000.00", money);
    }

    @Test
    public void negativeMoneyTest() {
        String negativeMoney = MoneyUtil.format(-1000);
        Assert.assertEquals("-$1000.00", negativeMoney);
    }

    @Test
    public void euroMoneyTest() {
        String euroMoney = MoneyUtil.format(1000, "€");
        Assert.assertEquals("€1000.00", euroMoney);
    }

    @Test
    public void notNullExceptionMoneyTest() {
        String notNullMoney = MoneyUtil.format(1000, null);
        Assert.assertEquals("$1000.00", notNullMoney);
    }

}
