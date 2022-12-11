import java.util.Scanner;

public class Backward {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("input the string");
		String str = key.nextLine();
		display(str);
	}
	public static void display(String str) {
		if(str.length() == 0) {
		    return;
		}
		else {
			System.out.print(str.charAt(str.length()-1));
			String update = str.substring(0,str.length()-1);
			display(update);
		}
		
	}

}
