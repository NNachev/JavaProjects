import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
//You need to downoload apache jar

import java.text.DecimalFormat;
public class FormatingNumbers {
public static void main(String[] args) {
	Scanner inputScan=new Scanner(System.in);
	int Anumber=inputScan.nextInt();
	float Bnumber=inputScan.nextFloat();
	float Cnumber=inputScan.nextFloat();
	String Anumb=Integer.toHexString(Anumber);
	String Abinarynumb=Integer.toBinaryString(Anumber);
	String bsString=Float.toString(Bnumber);
	String filledA = StringUtils.repeat(" ", 10-Anumb.length());
	
    Integer aBinary=Integer.parseInt(Abinarynumb);
	NumberFormat formatter = new DecimalFormat("0000000000");
	DecimalFormat df = new DecimalFormat("0.00");
	
	String filledB = StringUtils.repeat(" ", 10-df.format(Bnumber).toString().length());
	DecimalFormat secondNumber= new DecimalFormat("0.000");
	String filledC = StringUtils.repeat(" ", 10-secondNumber.format(Cnumber).toString().length());

	
	String AbinaryFinal=StringUtils.leftPad(Abinarynumb,10-Abinarynumb.length(), '0');
	System.out.println("|"+Anumb.toUpperCase()+filledA+"|"+formatter.format(aBinary)+"|"+filledB+df.format(Bnumber)+"|"+secondNumber.format(Cnumber)+filledC+"|");
		
}
}
