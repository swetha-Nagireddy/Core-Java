package in.basics;

public class Method_4 {
		
			public static void m1() {
				System.out.println("m1() executing");
				Method_4.m2();
				System.out.println("m1()completed");
			}
			public static void m2() {
				System.out.println("m2() executing");
				Method_4.m3();
				System.out.println("m2()completed");
			}
			public static void m3() {
				System.out.println("m3() executing");
				System.out.println("m3()completed");
			}

		public static void main(String[] args) {


			System.out.println("main()started");
			Method_4.m1();
			System.out.println("main()completed");
			
			
		}
	}





