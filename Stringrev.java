# Stringrev
import java.util.Scanner;

public class Stringrev {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		
		String n2=scanner.next();
		StringBuilder buffer=new StringBuilder(n2);
		buffer.reverse();
		System.out.println(buffer);
		
		
	}

}
