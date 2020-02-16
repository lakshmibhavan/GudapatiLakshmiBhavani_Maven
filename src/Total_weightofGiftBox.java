import java.util.*; 
public class Total_weightofGiftBox 
{ 
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
	    int j,t,x;
	     int sum=0;
	    t = sc.nextInt();
	    for(j=0;j<t;j++){
	    String sweetname = sc.next();
	    int sweetweight = sc.nextInt();
		Dictionary geek = new Hashtable(); 

		// put() method 
		geek.put(sweetname,sweetweight); 
		for (Enumeration i = geek.elements(); i.hasMoreElements();) 
		{ 
			x = (Integer) i.nextElement();
			sum = sum+x;
		} 
	        
	    }
		System.out.println("The sweets weight is:"+sum);
		int t1,y,k,total;
		int ssum=0;
		t1 = sc.nextInt();
		for(k=0;k<t1;k++){
	    String Choconame = sc.next();
	    int chocoweight = sc.nextInt();
		Dictionary geek1 = new Hashtable(); 

		// put() method 
		geek1.put(Choconame,chocoweight); 
		for (Enumeration i1 = geek1.elements(); i1.hasMoreElements();) 
		{ 
			y = (Integer) i1.nextElement();
			ssum = ssum+y;
		} 
	        
	    }
		System.out.println("The Chocolates weight is:"+ssum);
		total = sum+ssum;
		System.out.println("Total weight of the GiftBox is:"+total);
		

	} 
} 
