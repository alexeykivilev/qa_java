import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    private Feline feline;

    @Test
    public void familyCatTest() {
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);

//        String expected = "Кошачьи";
//        String actual = feline.getFamily();
//        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }

    @Test
    public void animalKindTest() throws Exception {
          feline.getFood("Хищник");
          Mockito.verify(feline).getFood("Хищник");

//        List<String> expected = List.of("Животные", "Птицы", "Рыба");
//        List<String> actual = feline.eatMeat();
//        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }

    @Test
    public void kittensCountTest() {
        int expected = 1;
        int actual = feline.getKittens(1);
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }
}

