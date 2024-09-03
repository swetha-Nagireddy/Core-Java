package in.basics;

// proving that this==current using object
class Box_1{
	Box_1()
{
		System.out.println("current value if this: "+this.hashCode());
		}
}
public class This_1 {

	public static void main(String[] args) {
		Box_1 b=new Box_1();
		System.out.println("value of b:"+b.hashCode());
		

	}

}
