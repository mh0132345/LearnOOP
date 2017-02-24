package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exe6_2 {

	public static void main(String[] args) {
		// HashMap as collection of the order
		HashMap<Integer, order> collection = new HashMap<Integer, order>();
		
		//Create new order and add to the collection
		order order1 = new order(2509, "Hoang", "7.2.2017");
		//First order row
		orderRow first = new orderRow();
		first.setValue("Ball", 18, 2);
		order1.addOrder(first);
		//Second order row
		orderRow second = new orderRow();
		second.setValue("Mitt", 23, 3);
		order1.addOrder(first);
		//Put the order into the collection
		collection.put(order1.getNumber(), order1);
		//Print the order 
		Scanner in = new Scanner(System.in);
		int input =0;
		while(input != -1){
			 System.out.print("Please enter the order number: ");
			 input = in.nextInt(); 
			 if (input != -1) System.out.println(collection.get(input).receipt());
			 else System.out.println("See you next time");
		}
	}
}
class order{
	private int number;
	public int getNumber() {
		return number;
	}
	private String name, date;
	ArrayList<orderRow> list = new ArrayList<orderRow>();
	//Constructor 
	public order(int number, String name, String date){
		this.number = number;
		this.name = name;
		this.date = date;
	}
	//Add order rows to order
	public void addOrder(orderRow a){
		list.add(a);
	}
	
	public double calculateTotalPrice(){
		double totalPrice =0;
		for (int i = 0; i < list.size(); i++) {   
			totalPrice += list.get(i).getPrice();
		}
		return totalPrice;
	}
	
	//return data of order
	public String receipt(){
		StringBuilder receipt = new StringBuilder();
		receipt.append("Order number: "+ this.number + ", Customer: "+ this.name + ", Date: "+ this.date+"\nOrder row:\n");
		//Print order rows
		for (int i = 0; i < list.size(); i++) {   
			receipt.append("Product: " + list.get(i).getName() + ", Quantity: " + list.get(i).getQuantity() +", Price: " + list.get(i).getPrice()+"\n");
		}
		receipt.append("Total price: " + this.calculateTotalPrice());
		return receipt.toString();
	}
}

