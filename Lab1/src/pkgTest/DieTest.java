package pkgTest;

import org.junit.Assert;
import org.junit.Test;
import pkgCore.Die;

public class DieTest {

  public DieTest() {}
  
  @Test
  public void TestDie()
  {
    for (int a = 0; a < 10000; a++) {
      Die d = new Die();
      Assert.assertTrue("Die less than or equal to 6", d.getDieValue() <= 6);
      
      Assert.assertTrue("Die greater than or equal to 1 ", d.getDieValue() >= 1);
      System.out.println("val " + d.getDieValue());
    }
  }
}