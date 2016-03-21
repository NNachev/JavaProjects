import java.util.Scanner;

public class OddAndEvenPairs {
public static void main(String[] args) {
	Scanner inputScan=new Scanner(System.in);
	String sentence = inputScan.nextLine();
	String [] arr=sentence.split(" ");
	Integer [] arrNumbers=new Integer[arr.length];
	for (int i = 0; i < arr.length; i++) {
		arrNumbers[i]=Integer.parseInt(arr[i]);
	}
	if (arrNumbers.length%2==1) {
		System.out.println("Invalid lenght");
	}
	else {
		for (int i = 0; i < arrNumbers.length; i+=2) {
			if (arrNumbers[i] %2==0 && arrNumbers[i+1]%2==0) {
				System.out.println(arrNumbers[i]+", "+arrNumbers[i+1]+" -> both are even");
			}
			else if (arrNumbers[i] %2==1 && arrNumbers[i+1]%2==1) {
				System.out.println(arrNumbers[i]+", "+arrNumbers[i+1]+" -> both are odd");

			}else {
				System.out.println(arrNumbers[i]+", "+arrNumbers[i+1]+" -> different");
			}
		}
	}
}
}
