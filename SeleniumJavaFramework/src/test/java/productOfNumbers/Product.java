package productOfNumbers;

public class Product {
	
	static int GetProduct(int n){
		
	
		int product = 1;
		while(n!=0) {
		
			product  = product * (n % 10); 
		    n = n/10;	
		
		}	
		
		return product;
			
	}
	
	public static void main(String[] args) {
		
		int n= 36;
		System.out.println(GetProduct(n));
	}
	
	
	
	

}
