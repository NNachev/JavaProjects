import java.util.Scanner;

public class ConvertFromDecimalTo7 {
public static void main(String[] args) {
	Scanner inputScan=new Scanner(System.in);
	Integer numberA=inputScan.nextInt();
	System.out.println(Integer.toString(numberA,7));
}
}
