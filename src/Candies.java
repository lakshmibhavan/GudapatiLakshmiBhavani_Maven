
import java.util.*; 

public class Candies { 
	public static void main(String[] args) 
	{ 
	    Scanner sc = new Scanner(System.in);
	    int t= sc.nextInt();
	    int i;
	    int range = sc.nextInt();
	    for(i=0;i<t;i++)
	    {
	    String s1 = sc.next();
	    int n = sc.nextInt();
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>(); 

		hash_map.put(n,s1);

		// Displaying the HashMap 
		System.out.println("Initial Mappings are: " + hash_map);  
		System.out.println("The Value is: " + hash_map.get(range)); 
	    }

	} 
} 
