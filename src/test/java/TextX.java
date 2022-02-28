import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TextX {

   @Test
   public void test() {
      int x=5;
      int y=0;
      String expected="x tengely";
      String actual=MyCoordinateSystem.determinePosition(x,y);

      Assertions.assertEquals(expected,actual,"Az x tengelyen levo pont koordinatait rosszul hatorzata meg.");
   }
}
