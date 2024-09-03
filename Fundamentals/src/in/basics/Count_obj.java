package in.basics;
public class Count_obj{
	static int count=0;
	
	Count_obj(){
		count++;
	}
	public static int getcount() {
		
		return count;
		
	}
	
	
	


	public static void main(String[] args) {
		Count_obj a =new Count_obj();
		Count_obj a1 =new Count_obj();
		Count_obj a2 =new Count_obj();
		Count_obj a3 =new Count_obj();
		Count_obj a4 =new Count_obj();
		
		
		System.out.println(count);

}
}
