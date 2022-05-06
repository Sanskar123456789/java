package simplilearn.array.tr;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class emailVerifier {
	String email;
	public emailVerifier(String a) {
		this.email = a;
	}
	
	public void checkEmail() {
		String Regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
		        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
		Pattern p = Pattern.compile(Regex);
		Matcher m = p.matcher(this.email);
		if(m.matches()) {
			System.out.println(this.email+"is Valid");
		}else {
			System.out.println(this.email+"is Invalid");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] email = new String[10];
		System.out.println("Enter 10 Email ids");
		for(int i=0;i<10;i++) {
			System.out.println("Enter Email id--> ");
			email[i]= sc.nextLine();
		}
		for(int i=0;i<10;i++) {
			emailVerifier obj = new emailVerifier(email[i]);
			obj.checkEmail();
		}
	}
}
