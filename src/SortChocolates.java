import java.util.*;

public class SortChocolates implements Comparable<SortChocolates> {
	    private int price;
	    private String cname;
	   
	    public SortChocolates(int price, String cname)
	    {
	        this.price= price;
	        this.cname = cname;
	    }

	    public int getprice(){
	        return price;
	    }

	    public void setId(int price){
	        this.price = price;
	    }

	    public String getcname(){
	        return cname;
	    }

	    public void setcname(String cname){
	        this.cname = cname;
	    }
	    
	    public String toString() {
	        return "SortChocolates {" +"price=" + price + ", name='" + cname + '}';
	    }
	    
	    
	    
	    public int compareTo(SortChocolates s){
	        if(this.getprice() < s.getprice())
	        {
	            return -1;
	        } 
	        else if (this.getprice() > s.getprice()) 
	        {
	            return 1;
	        } 
	        else 
	        {
	            return 0;
	        }
	    } 
	   	
	
	public static void main(String[] args) {
		
		        List<SortChocolates> s1 = new ArrayList<>();

		        s1.add(new SortChocolates(10, "Kitkat"));
		        s1.add(new SortChocolates(25, "Perk"));
		        s1.add(new SortChocolates(5, "MilkyBar"));

		        System.out.println("Chocolates (Before Sorting) : " + s1);

		        Collections.sort(s1);

		        System.out.println("\nChocolates(After Sorting) : " + s1);
		    }
		
}