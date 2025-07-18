import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RecursiveTest{

    @Test 
    public void count8(){
        assertEquals(1,Main.count8(8));
        assertEquals(4,Main.count8(8818));
        assertEquals(3,Main.count8(80808));
        assertEquals(5,Main.count8(888));
        assertEquals(0,Main.count8(1234567));
    }

    @Test
    public void countHi(){
        assertEquals(1,Main.countHi("hi"));
        assertEquals(2,Main.countHi("xhixhix"));
        assertEquals(1,Main.countHi("xxhixx"));
        assertEquals(4,Main.countHi("hihihihi"));
        assertEquals(0,Main.countHi("l"));

    }

    @Test
    public void countHi2(){
        assertEquals(3,Main.countHi2("hilhithi"));
        assertEquals(1,Main.countHi2("hi"));
        assertEquals(0,Main.countHi2("xh"));
        assertEquals(2,Main.countHi2("hirhir"));
        assertEquals(5,Main.countHi2("hihihiabhi123hixxhi"));

    }
    @Test
     public void strCount(){
        assertEquals(4,Main.strCount("timbobjhonbobtimmybobtonybob","bob"));
        assertEquals(2,Main.strCount("hiholahellohola","hola"));
        assertEquals(0,Main.strCount("bobbilljohn","timmy"));
        assertEquals(3,Main.strCount("dogfooddogfoodfood","food"));
        assertEquals(2,Main.strCount("catcowcat","cat"));

    }


}