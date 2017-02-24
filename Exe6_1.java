package exercise;
import java.util.HashMap;
import java.util.Scanner;
public class Exe6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, Double> product = new HashMap<Integer, Double>();
		 product.put(1, 542.0);
		 product.put(2, 75424.453);
		 product.put(3, 3.56);
		 product.put(4, 4.12);
		 product.put(5, 5.5);
		 product.put(6, 6.34);
		 int input = 0;
		 Scanner in = new Scanner(System.in);
		 while(input != -1){
			 System.out.print("Please enter the product number: ");
			 input = in.nextInt(); 
			 if (input != -1) System.out.println(product.get(input));
			 else System.out.println("See you next time");
		 }
	}

}
