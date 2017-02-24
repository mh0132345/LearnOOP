package exercise;

public class Exe2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		d.setDate("11.09.1998");
		Date d1 = new Date(25,9,1998);
		System.out.println(d1.toString());
		System.out.println(d.toString());
		System.out.println(d.longForm());
		System.out.println(Date.convertMonth("May"));
		if(d.equals(d1)) 
			System.out.println("True");
	}

}
class Date{
	private int day, month, year;
	public static final String[] MONTHNAMES = {"January", "February",
			"March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December"};
	public Date(){
		java.time.LocalDate today = java.time.LocalDate.now();
		day = today.getDayOfMonth();
		month = today.getMonthValue();
		year = today.getYear();
	}
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void setDate(String date){
		String arr[] = date.split("\\.");
		this.day = Integer.parseInt(arr[0]);
		this.month = Integer.parseInt(arr[1]);
		this.year = Integer.parseInt(arr[2]);
	}
	public boolean equals(Date d){
		if (d.day == this.day && d.month == this.month && d.year == this.year) return true;
		return false;
	}
	public String longForm(){
		String result;
		switch(this.day%10){
			case 1:
				result = this.day + "st";
				break;
			case 2: 
				result = this.day + "nd";
				break;
			case 3: 
				result = this.day + "rd";
				break;
			default:
				result = this.day + "th";
		}
		result = result + " of "+ MONTHNAMES[this.month-1] +", "+ this.year;
		return result;
	}
	public static int convertMonth(String month){
		month = month.toLowerCase();
		
		for(int i=0;i<11;i++){
			String monthname = MONTHNAMES[i].toLowerCase();
			
			if (monthname.equals(month)) return (i+1);
		}	
		return 0;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toString(){
		return day+"."+month+"."+year;
	}
}
