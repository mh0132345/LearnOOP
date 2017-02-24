package exercise;

import java.util.Scanner;

public class Exe2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the number of order rows : ");
		int row = in.nextInt(); 
		double price[][] = new double[row][2];
		String name[] = new String[row];
		double total =0;
		for (int i=0; i<row;i++){
			System.out.println("Please enter name of order: ");
			name[i] = in.next();
			System.out.println("Please enter price and quantity respectively: ");
			price[i][0] = in.nextDouble();
			price[i][1] = in.nextDouble();
			total += (price[i][0] * price[i][1]);
		}
		for (int i=0; i<row;i++){
			System.out.print(name[i] + "\t");
			System.out.print(price[i][0]+ "\t");
			System.out.println(price[i][1]);
		}
		System.out.println("Total price:" +total);
		
	}

}

class orderRow{
	private String name;
	private double price;
	private int quantity;
	//Constructor
	void setValue(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	void getValue(){
		System.out.println(name);
		System.out.println(price);
		System.out.println(quantity);
	}
	double getOrderPrice(){
		return price*quantity;
	}
}