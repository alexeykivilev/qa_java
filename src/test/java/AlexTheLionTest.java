import static org.junit.Assert.*;
import com.example.AlexTheLion;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class AlexTheLionTest {

    @Spy
    Feline feline;



    @Test
    public void checkOnFriends() {
        List<String> expected = List.of("Зебра Марти", "Бегемотиха Глория", "Жираф Мелман");
        List<String> actual =  alex.getFriends();
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }

    @Test
    public void placeOfLivingShouldBeNewYorkZoo() {
        String expected = "Нью-Йорский зоопарк";
        String actual = alex.getPlaceOfLiving();
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }

    @Test
    public void maleLionHasNoKittens() {
        int expected = 0;
        int actual = alex.getKittens();
        assertEquals("Ожидаемый результат не соответствует актуальному", expected, actual);
    }

}

