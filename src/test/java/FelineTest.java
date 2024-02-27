import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void familyCatTest() {
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        Assert.assertEquals("Ожидаемый результат не соответствует актуальному", "Кошачьи", feline.getFamily());

    }

    @Test
    public void animalKindTest() throws Exception {
          feline.getFood("Хищник");
          Mockito.verify(feline).getFood("Хищник");

    }

    @Test
    public void kittensCountTest() {
        int expected = 1;
        int actual = feline.getKittens(1);
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }
}

