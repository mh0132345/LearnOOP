package exercise;

public class Exe2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prism p = new Prism();
		p.setValue(1, 2, 3);
		p.getValue();
		System.out.println(p.volume());
		p.setValue(4, 5, 6);
		p.getValue();
		System.out.println(p.volume());
	}

}

class Prism{
	public double height;
	public double width;
	public double depth;
	public void setValue(double height, double width, double depth){
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	public void getValue(){
		System.out.println(height);
		System.out.println(width);
		System.out.println(depth);
	}
	double volume(){
		return height*width*depth;
	}
}
