import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Test3Negyed {

   @Test
   public void test() {
      int x=-22;
      int y=-5;
      String expected="3. negyed";
      String actual=MyCoordinateSystem.determinePosition(x,y);

      Assertions.assertEquals(expected,actual,"Az 3. negyedben levo pont koordinatait rosszul hatorzata meg.");
   }
}
