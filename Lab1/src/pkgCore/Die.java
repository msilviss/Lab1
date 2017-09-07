package pkgCore;

public class Die {
  private int DieValue;
  
  public Die()
  {
    DieValue = ((int)(Math.random() * 6.0D + 1.0D));
  }
  
  public int getDieValue() {
    return DieValue;
  }
}

