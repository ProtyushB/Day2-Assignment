
public class JAVA_SWITCH_CASE {
	public static void main(String[] args) {
		check("Bangalore");
	}
	
	static void check(String data) {
		switch(data) {
		case "Mumbai":	System.out.println("Financial City");
						break;
		case "Kolkata":	System.out.println("City Of Joy");
						break;
		case "Delhi":	System.out.println("Capital Of The Country");
						break;
		case "Bangalore":	System.out.println("Cyber City");
							break;
		default:	System.out.println("May be Other Indian City");
						break;
		}
	}
}
