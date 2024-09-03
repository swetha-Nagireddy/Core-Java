package in.basics;


class Box{
	//default constructor: defined by the JVM only
	//no-arg constructor :when we explicitly defines constructor with zero parameters
	public Box(){
		System.out.println("calling constructor");
	}
}
public class Constructor_1 {

	public static void main(String[] args) {
		System.out.println("main executed");
		Box obj = new Box();
		System.out.println(obj.hashCode());
		System.out.println("main completed");
		

	}

}
