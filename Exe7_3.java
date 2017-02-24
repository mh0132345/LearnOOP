package exercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exe7_3 {

	public static void main(String[] args) {
		HashMap<String, room> collection = new HashMap<String, room>();
		//new room
//		room A1078 = new room();
//		A1078.setInfoRoom();
//		System.out.println(A1078.toString());

//		office A0000 = new office();
//		A0000.setInfoOffice();
//		System.out.println(A0000.toString());
		
//		classroom A2034 = new classroom();
//		A2034.setInfoClass();
//		System.out.println(A2034.toString());
		Scanner in = new Scanner(System.in);
		int input = 0;
		while(input!=-1){
			System.out.println("Please enter number of the function. Enter -1 to exit");
			System.out.println("1. Insert a room");
			System.out.println("2. Print out all rooms");
			System.out.println("3. Print out offices");
			System.out.println("4. Print out class rooms");
			System.out.println("5. Print out other rooms (not office, not class room)");
			System.out.println("6. Search a room");
			System.out.println("7. Search a staff member");
			input = in.nextInt();
			switch(input){
			case 1: 
				System.out.println("Please input type of room you want in number(1.room/2.office/3.classroom)?");
				switch(in.nextInt()){
				case 1:
					room normalRoom = new room();
					normalRoom.setInfoRoom();
					collection.put(normalRoom.getRoomNumber(), normalRoom);
					break;
				case 2: 
					office anOffice = new office();
					anOffice.setInfoOffice();
					collection.put(anOffice.getRoomNumber(), anOffice);
					break;
				case 3: 
					classroom newClass = new classroom();
					newClass.setInfoClass();
					collection.put(newClass.getRoomNumber(), newClass);
					break;
				default:
					System.out.println("Invalid choice");
				}
				break;
			case 2: 
				for (Map.Entry list : collection.entrySet()) 
					System.out.println(list.getValue().toString());
				break;
			case 3: 
				for (Map.Entry list : collection.entrySet()) 
					if(list.getValue().getClass() == office.class)
						System.out.println(list.getValue().toString());
				break;
			case 4: 
				for (Map.Entry list : collection.entrySet()) 
					if(list.getValue().getClass() == classroom.class)
						System.out.println(list.getValue().toString());
				break;
			case 5: 
				for (Map.Entry list : collection.entrySet()) 
					if(list.getValue().getClass()!=classroom.class&&list.getValue().getClass()!= office.class)
						System.out.println(list.getValue().toString());
				break;
			case 6:
				in.nextLine();
				System.out.println("Please enter number of the room");
				if(collection.get(in.nextLine())!=null)
					System.out.println(collection.get(in.nextLine()).toString());
				else System.out.println("Invalid room");
				break;
			case 7:
				in.nextLine();
				System.out.println("Input the name of the staff");
				String staff = in.nextLine();
				for (Map.Entry list : collection.entrySet()) 
					if(list.getValue().getClass() == classroom.class)
						if(((office)list.getValue()).workHere(staff)) 
							System.out.println(list.getValue().toString());
				break;
			default:
				System.out.println("Invalid choice");
			}
		}
	}
}

class room{
	private String description, room;
	//Input info of room
	public void setInfoRoom(){
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the room number");
		this.room = in.nextLine();
		System.out.println("Please input the description");
		this.description = in.nextLine();
	}
	public String getRoomNumber(){
		return this.room;
	}
	public String toString(){
		return this.room + ": "+ this.description;
	}
}

class office extends room{
	// Store the staffs
	private ArrayList<String> staffs = new ArrayList<String>();
	//Input the data of office
	public void setInfoOffice(){
		super.setInfoRoom();
		String staff;
		Scanner in = new Scanner(System.in);
		do{
			System.out.println("Input the staffs. Input exit to finish");
			staff = in.nextLine();
			if (!staff.equals("exit")) staffs.add(staff);
		}
		while (!staff.equals("exit"));
	}
	//Check if the staff work here
	public boolean workHere(String name){
		if (staffs.contains(name)) return true;
		return false;
	}
	
	public String toString(){
		String listStaff = "";
		for(int i=0; i<staffs.size(); i++){
			listStaff += staffs.get(i);
			if ( (staffs.size()-i) != 1) listStaff +=", "; 
		}
		return super.toString() + "staff members " + listStaff;
	}
	
}

class classroom extends room{
	private int seats, computers;
	private boolean dataProjector;
	//Input data of classroom
	public void setInfoClass(){
		super.setInfoRoom();
		Scanner in = new Scanner(System.in);
		System.out.println("Input the seats");
		this.seats = in.nextInt();
		System.out.println("Input the computers");
		this.computers = in.nextInt();
		in.nextLine();
		System.out.println("Is there a data projector? Y/N");
		if(in.nextLine().toUpperCase().equals("Y")) this.dataProjector = true;
		else this.dataProjector = false;	
		
	}
	
	public String toString(){
		String info = super.toString() +", seats " + this.seats + ", computers " + this.computers;
		if (this.dataProjector) info +=", data projector";
		return info;
	}
}

