package June9th;

public class MyProgram12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "PARGOL";
		String name2 = "pargol";
		
		/*if(name == name2) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		*/
		
		if(name1.equalsIgnoreCase(name2)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
