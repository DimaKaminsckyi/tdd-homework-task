import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PasswordGenerateTest {

    private PasswordGenerate unit;

    @Before
    public void initialization(){
        unit = new PasswordGenerate();
    }

    @Test
    public void whenGenerateReturnCorrectSize(){
        Assert.assertEquals( 9 ,unit.generate(9).length());
    }
}
