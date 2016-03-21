import java.util.Scanner;

public class CalculateExpression {
public static void main(String[] args) {
	Scanner inputScan=new Scanner(System.in);
	Double numberA=inputScan.nextDouble();
	Double numberB=inputScan.nextDouble();
	Double numberc=inputScan.nextDouble();
	
	Double AvarageF1=Math.pow(((numberA*numberA)+(numberB*numberB))/(((numberA*numberA)-(numberB*numberB))),(((numberA+numberB+numberc)/Math.sqrt(numberc))));
	Double AvarageF2=Math.pow(((numberA*numberA)+(numberB*numberB))-(numberc*numberc*numberc), numberA-numberB);
	
	Double avarageNumber=(numberA+numberB+numberc)/3;
	Double avarageF1F2=(AvarageF1+AvarageF2)/2;
	Double diff=Math.abs(avarageF1F2-avarageNumber);
	String result=String.format("F1 result: %.2f; F2 result: %.2f; Diff: %.2f",AvarageF1,AvarageF2,diff);
	System.out.println(result);
}
}
