import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

   public class TestOrigo {

      @Test
      public void test() {
         int x=0;
         int y=0;
         String expected="origo";
         String actual=MyCoordinateSystem.determinePosition(0,0);

         Assertions.assertEquals(expected,actual,"Az origoban levo pont koordinatait rosszul hatorzata meg.");
      }
   }
