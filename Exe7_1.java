package exercise;

public class Exe7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solidPrism p = new solidPrism();
		p.setValue(1, 2, 3);
		p.setDensity(4);
		System.out.println(p.mass());
	}

}

class solidPrism extends Prism {
	private double density;
	public double getDensity() {
		return density;
	}
	public void setDensity(double density) {
		this.density = density;
	}
	public double mass(){
		return this.volume() * density;
	}
}
