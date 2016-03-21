import java.util.Scanner;

public class CharacterMultiplayer {
public static void main(String[] args) {
	Scanner inputScan=new Scanner(System.in);
	String sentence= inputScan.nextLine();
	String []arr=sentence.split(" ");
	Integer number=name(arr[0], arr[1]);
	System.out.println(number);
}
public static Integer name(String first,String second) {
	char [] arr=first.toCharArray();
	char [] SecondChar=second.toCharArray();
	Integer number=0;
	Integer count=0;
if (arr.length>SecondChar.length) {
	for (int i = 0; i < arr.length; i++) {
		number+=(char)arr[i]*(char)SecondChar[i];
		count++;
	}
	for (int i = arr.length-1; count < count-1; i--) {
		number+=(char)arr[i];
	}
	
	
}
else if (arr.length<SecondChar.length) {
	for (int i = 0; i < arr.length; i++) {
		number+=(char)arr[i]*(char)SecondChar[i];
		count++;
	}
	for (int i = SecondChar.length-1; i > count-1; i--) {
		number+=(char)SecondChar[i];
	}
}
else if (arr.length==SecondChar.length) {
	for (int i = 0; i < arr.length; i++) {
		number+=(char)arr[i]*(char)SecondChar[i];
		count++;
	}
}
return number;
	}
	
}

