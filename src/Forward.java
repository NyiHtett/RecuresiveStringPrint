import java.util.Scanner;

public class Forward
{
	public static void main(String[] args) {
	    System.out.println("type in some words");
	    Scanner key = new Scanner(System.in);
	    String str = key.nextLine();
	    display(str);
	}
	public static void display(String str) {
		if(str.length()== 0) {
			return;
		}
		else {
			System.out.print(str.charAt(0)+" ");
			String update = str.substring(1);
			display(update);
		}
		
	}
}