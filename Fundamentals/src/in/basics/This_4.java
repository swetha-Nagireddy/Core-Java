package in.basics;

// to differiantiate between instance variable and local variable
class Dimension{
	int numberOfSides;
	String dimensionName;
	
	Dimension(int numberOfSides, String dimensionName){
		this.numberOfSides = numberOfSides;
		this.dimensionName = dimensionName;
		
		// numberOf
	}
	
	public void show() {
		
		System.out.println(this.numberOfSides+""+this.dimensionName);
	}
}
public class This_4 {

	public static void main(String[] args) {
		Dimension d1 = new Dimension(4, "square");
		d1.show();

	}

}
