package ru.mirea.task30;
import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ManTest {

    @Test
    public void testToString(){
        Man w1 = new Man("Oleg", 58, "blue", "black", 22);
        Man w2 = new Man("Max", 49, "green", "brown", 18);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("Man: " + "name=Oleg" + "; " +
                "weight=58" + "; " +
                "eyesColor=blue" + "; " +
                "hairColor=black" + "; " +
                "age=22" +
                '.');
        expected.add("Man: " + "name=Max" + "; " +
                "weight=49" + "; " +
                "eyesColor=green" + "; " +
                "hairColor=brown" + "; " +
                "age=18" +
                '.');

        ArrayList<String> actual = new ArrayList<>();
        actual.add(w1.toString());
        actual.add(w2.toString());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testHashCode(){
        Man w1 = new Man("Oleg", 58, "blue", "black", 22);
        Man w2 = new Man("Max", 49, "green", "brown", 18);
        Man w3 = new Man("Kirill", 55, "blue", "black", 21);
        Man w4 = new Man("Kuzya", 54, "green", "red", 20);

        ArrayList<Boolean> expected = new ArrayList<>();
        expected.add(false);
        expected.add(false);
        expected.add(false);

        ArrayList<Boolean> actual = new ArrayList<>();
        actual.add(w1.hashCode() == w2.hashCode());
        actual.add(w1.hashCode() == w3.hashCode());
        actual.add(w1.hashCode() == w4.hashCode());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void  testAlwaysNotPass(){
        Man w1 = new Man("Oleg", 58, "blue", "black", 22);
        Man w2 = new Man("Max", 49, "green", "brown", 18);

        String expected = "green";
        String actual = w2.getEyesColor();

        Assert.assertEquals(expected, actual);
    }
}
