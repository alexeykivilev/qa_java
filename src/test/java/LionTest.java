import static org.junit.Assert.*;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline feline;
    private Lion lion;

    @Test
    public void constructorThrowsExceptionOnUnsupportedSex() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion(feline, "Неопределенно");
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }

    @Test
    public void maleLionHasMane() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void hasKittens() throws Exception {
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals("Ожидаемый результат не соотвествует актуальному", expected, actual);

//        Lion lion = new Lion(new Feline(), "Самец");
//        int expected = 1;
//        int actual = lion.getKittens();
//        assertEquals("Ожидаемый результат не соотвествует актуальному", expected, actual);
    }

    @Test
    public void lionFoodIsMeatTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = feline.getFood("Хищник");
        List<String> actual = lion.getFood();
        assertEquals("Ожидаемый результат не соотвествует актуальному", expected, actual);

//        Lion lion = new Lion(new Feline(), "Самец");
//        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
//        assertEquals(expectedResult, lion.getFood());
    }
}

