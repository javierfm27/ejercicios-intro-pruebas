import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LastZeroTest
{
   // this test fails!
   @Test public void multipleZeroes()
   {
      int arr[] = {0, 1, 0};
      assertEquals("Multiple zeroes: should find last one", 2, LastZero.lastZero(arr));
   }

   @Test public void noZeros()
   {
     int arr[] = {1,2,3};
     assertEquals("..",-1, LastZero.lastZero(arr));
   }

}
