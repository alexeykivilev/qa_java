import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class ParameterizedLionTest {
    private final String lionSex;

    private final boolean expected;
    public ParameterizedLionTest(String lionSex, boolean expected) {
        this.lionSex = lionSex;
        this.expected = expected;
    }

    @Mock
    Feline feline;

    @Before
    public void MockInit() {
        MockitoAnnotations.initMocks(this);
    }

    @Parameterized.Parameters
    public static Object[][] getLionSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void lionSexTest() throws Exception {
        Lion lion = new Lion(feline, lionSex);
        Assert.assertEquals(expected, lion.doesHaveMane());
    }

}

