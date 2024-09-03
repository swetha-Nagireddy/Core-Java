package in.basics;

// constructor chaining, second usage of This keyword
// calling one constructor from another another constructor

class M{
	M(){
		this(10);  //when we are calling a constructor from another constructor the another constructor need to execute first.
		System.out.println("zero-arg");
		//this(10) //when we are calling a constructor from another constructor the another constructor need to execute first.this will give compile error
	}
	
	M(int m){
		System.out.println("one-arg");	}
}

public class This_5 {
	
	public static void main(String[] args) {
		M m = new M();

	}

}
