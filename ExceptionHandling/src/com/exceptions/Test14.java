package com.exceptions;
//custom exception
class AgeVerificationFailedException extends Exception{
	private String msg;
	public AgeVerificationFailedException(String msg) {
		this.msg=msg;
	}
	public String getErrorMessage() {
		return this.msg;
	}
}

class OnlineVoting{
	public static String ageVerification( int age) {
		if(age<18) {
			try {
			throw new AgeVerificationFailedException("age verification failed");
		}catch(AgeVerificationFailedException ae) {
			return ae.getErrorMessage();
		}
	}
		return "welcome to online coding";
}
public class Test14 {

	
	public static void main(String[] args) {
		
   System.out.println(OnlineVoting.ageVerification(17));
	}

}
}