
class Chocolates1 {
		   public void Choco1()
		   {
		      System.out.println("hierarchy of Chocolates");
		   }
		}
		class Kitkat extends Chocolates1
		{
		   public void Choco2()
		   {
		      System.out.println("gift box contain kitkat chocolate");
		   }
		}
		class Perk extends Chocolates1
		{
		  public void Choco3()
		  {
		     System.out.println("gift box contain perk chocolate");
		  }
		}
		class MilkyBar extends Chocolates1
		{
		  public void Choco4()
		  {
		     System.out.println("gift box contains MilkyBar chocolate");
		  }
		}
		class Chocolates
		{
		  public static void main(String args[])
		  {
			 Chocolates1 c = new Chocolates1();
		     Kitkat obj1 = new Kitkat();
		     Perk obj2 = new Perk();
		     MilkyBar obj3 = new MilkyBar();
		     c.Choco1();
		     obj1.Choco2();
		     obj2.Choco3();
		     obj3.Choco4();
		  }
		}

