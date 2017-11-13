import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CountPositiveTest
{
   // this test fails!
   @Test public void arrayContainsZeroes()
   {
      int arr[] = {-4, 2, 0, 2};
      assertEquals("Array contains zeroes", 2, CountPositive.countPositive(arr));
   }

   @Test public void arrayContainsNegatives()
   {
     int arr[] = {-4, -2, -500, -2};
     assertEquals("Array contains zeroes", 0, CountPositive.countPositive(arr));
   }

   @Test public void arrayContainsPositives()
   {
     int arr[] = {4, 2, 3, 2};
     assertEquals("Array contains zeroes", 4, CountPositive.countPositive(arr));
   }

   @Test public void ArrayOneElement()
   {
     int arr[] = {1};
     assertEquals("Array contains zeroes", 1, CountPositive.countPositive(arr));
   }
}
