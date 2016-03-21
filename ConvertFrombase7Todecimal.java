import java.util.Scanner;

public class ConvertFrombase7Todecimal {
public static void main(String[] args) {
	Scanner inputScan=new Scanner(System.in);
	String numberA=inputScan.nextLine();
	
	System.out.println(Integer.valueOf(numberA,7));
}
}
