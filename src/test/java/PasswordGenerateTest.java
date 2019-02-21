import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PasswordGenerateTest {

    private PasswordGenerate unit;
    private StringBuilder passwordUnit;

    @Before
    public void initialization() {
        unit = new PasswordGenerate();
        passwordUnit = unit.generate(10);
    }

    @Test
    public void whenGenerateReturnCorrectSize(){
        Assert.assertEquals( 9 ,unit.generate(9).length());
    }

    @Test
    public void passwordHasLowRegister(){
        Assert.assertTrue(!passwordUnit.toString().equals(passwordUnit.toString().toUpperCase()));
    }

    @Test
    public void passwordHasUpperRegisgter(){
        Assert.assertTrue(!passwordUnit.toString().equals(passwordUnit.toString().toLowerCase()));
    }

    @Test
    public void passwordHasDigitsSymbols(){
        Assert.assertTrue(passwordUnit.toString().chars().anyMatch(Character::isDigit));
    }

}
