import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextY {

   @Test
   public void test() {
      int x=0;
      int y=-5;
      String expected="y tengely";
      String actual=MyCoordinateSystem.determinePosition(x,y);

      Assertions.assertEquals(expected,actual,"Az y tengelyen levo pont koordinatait rosszul hatorzata meg.");
   }
}
