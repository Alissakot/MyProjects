import lesson8.Animal;
import lesson8.Cats;
import org.junit.Assert;
import org.junit.Test;

public class AnimalSounderTest {
    @Test
    public void shouldSound () {
        Animal cat = new Cats("Кот", 7);
        Assert.assertEquals("Кот говорит meow",cat.getSound());
    }
}
