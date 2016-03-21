import java.util.Scanner;

public class TriangleArea {
public static void main(String[] args) {
	Scanner inputScan=new Scanner(System.in);
	Integer Ax= inputScan.nextInt();
	Integer Ay= inputScan.nextInt();
	Integer Bx= inputScan.nextInt();
	Integer By= inputScan.nextInt();
	Integer Cx= inputScan.nextInt();
	Integer Cy= inputScan.nextInt();
	Integer area=Math.abs((Ax*(By-Cy)+Bx*(Cy-Ay)+Cx*(Ay-By))/2);
	System.out.println(area);





}
}
