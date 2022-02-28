import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test1Negyed {

   @Test
   public void test() {
      int x=2;
      int y=5;
      String expected="1. negyed";
      String actual=MyCoordinateSystem.determinePosition(x,y);

      Assertions.assertEquals(expected,actual,"Az 1. negyedben levo pont koordinatait rosszul hatorzata meg.");
   }
}
