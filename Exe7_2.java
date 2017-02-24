package exercise;

import java.util.ArrayList;

public class Exe7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<customer> list = new ArrayList<customer>();
		customer A = new customer();
		A.setNumber(1);
		A.setName("A");
		A.setAddress("Finland");
		list.add(A);
		preferredCustomer B = new preferredCustomer();
		B.setNumber(2);
		B.setName("B");
		B.setAddress("Finland");
		B.setPurchases(700);
		list.add(B);
		System.out.println("All customer");
		for(int i = 0; i < list.size(); i++) {   
			System.out.println(list.get(i));
		}  
		System.out.println("Preferred Customer:");
		for(int i = 0; i < list.size(); i++) {   
			if (list.get(i).getClass() == preferredCustomer.class)
				System.out.println(list.get(i));
				
		}  
	}

}

class customer{
	private String name, address;
	private int number;
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	public String toString(){
		return "number: " + this.number + " name: " + this.name + " address: " + this.address;
	}
}

class preferredCustomer extends customer{
	private int purchases;
	public int getPurchases() {
		return purchases;
	}
	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}
	public double calculateBonus(){
		if (500<= this.purchases && this.purchases<=1000) return 0.02;
		if (this.purchases>1000) return 0.05;
		return 0;
	}
	public String toString(){
		return "number: " + this.getNumber() + " name: " + this.getName() + " address: " + this.getAddress() + " bonus " + this.calculateBonus();
	}
}
