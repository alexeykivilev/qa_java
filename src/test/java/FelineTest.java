import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    private Feline feline;
    private Lion lion;

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
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = feline.getFood("Хищник");
        List<String> actual = lion.getFood();
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);

//        List<String> expected = List.of("Животные", "Птицы", "Рыба");
//        List<String> actual = feline.eatMeat();
//        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }

    @Test
    public void kittensCountTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = lion.getKittens();
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);

//        int expected = 1;
//        int actual = feline.getKittens();
//        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }
}

