import static org.junit.Assert.*;
import com.example.AlexTheLion;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexTheLionTest {
    @Mock
    Feline feline;
    
    @Test
    public void checkOnFriends() throws Exception {
        List<String> expected = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
        List<String> actual =  new AlexTheLion(feline, "Самец").getFriends();
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }

    @Test
    public void placeOfLivingShouldBeNewYorkZoo() throws Exception {
        String expected = "Нью-Йорский зоопарк";
        String actual = new AlexTheLion(feline, "Самец").getPlaceOfLiving();
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }

    @Test
    public void maleLionHasNoKittens() throws Exception {
        int expected = 0;
        int actual = new AlexTheLion(feline, "Самец").getKittens();
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }

}

