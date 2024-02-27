import com.example.Feline;
import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void familyCatTest() {
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }

    @Test
    public void animalKindTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void kittensCountTest() {
        int expected = 1;
        int actual = feline.getKittens(1);
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }
}

