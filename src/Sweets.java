class Sweets1
{
	   public void Sweet1()
	   {
	      System.out.println("hierarchy of Sweets");
	   }
	}
	class Laddu extends Sweets1
	{
	   public void Sweet2()
	   {
	      System.out.println("sweet in the box is laddu");
	   }
	}
	class Halwa extends Sweets1
	{
	  public void Sweet3()
	  {
	     System.out.println("sweet in the box is Halwa");
	  }
	}
	class Kaja extends Sweets1
	{
	  public void Sweet4()
	  {
	     System.out.println("sweet in the box is Kaja");
	  }
	}
	class Sweets
	{
	  public static void main(String args[])
	  {
		 Sweets1 s1 = new Sweets1();
	     Laddu obj1 = new Laddu();
	     Halwa obj2 = new Halwa();
	     Kaja obj3 = new Kaja();
	     s1.Sweet1();
	     obj1.Sweet2();
	     obj2.Sweet3();
	     obj3.Sweet4();
	  }
	}
