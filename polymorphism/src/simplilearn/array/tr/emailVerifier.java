package simplilearn.array.tr;

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
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
	}
	
	public static void main(String[] args) {
		emailVerifier obj = new emailVerifier("we123@re.com");
		obj.checkEmail();
	}
}
