package exercise;

public class Exe3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle a = new rectangle(0,0,1,1);
		System.out.println(a.width());
		System.out.println(a.height());
		System.out.println(a.area());
	}

}

class rectangle{
	double left_x, left_y, right_x, right_y;
	public rectangle(){
		this.left_x = 0;
		this.left_y = 0;
		this.right_x = 1;
		this.right_y = 1;
	}
	public rectangle(double right_x, double right_y){
		this.left_x = 0;
		this.left_y = 0;
		this.right_x = right_x;
		this.right_y = right_y;
	}
	public rectangle(double left_x, double left_y, double right_x, double right_y){
		this.left_x = left_x;
		this.left_y = left_y;
		this.right_x = right_x;
		this.right_y = right_y;
	}
	public double width(){
		return right_x-left_x;
	}
	public double height(){
		return right_y-left_y;
	}
	public double area(){
		return (right_x-left_x)*(right_y-left_y);
	}
}
