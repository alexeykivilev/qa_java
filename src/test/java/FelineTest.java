import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void familyCatTest() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }

    @Test
    public void animalKindTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = feline.eatMeat();
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }

    @Test
    public void kittensCountTest() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }
}
