import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class GetFirstOddorEvenE {
public static void main(String[] args) {
	Scanner inputScan=new Scanner(System.in);
	String numbers=inputScan.nextLine();
	String sentence=inputScan.nextLine();
	ArrayList<Integer> list=new ArrayList<>();
	String []arr=numbers.split(" ");
	for (int i = 0; i < arr.length; i++) {
		list.add(Integer.parseInt(arr[i]));
	}
	String[] type=sentence.split(" ");
	Integer getNumber=Integer.parseInt(type[1]);
	String typeofNumber=type[2];
	ArrayList <Integer> finalList=Name(list, getNumber, typeofNumber);
	for (int i = 0; i < finalList.size(); i++) {
		System.out.print(finalList.get(i)+" ");
	}
}
public static  ArrayList<Integer> Name (ArrayList<Integer> list,Integer getnumber,String type) {
	ArrayList<Integer> finale=new ArrayList<>();
	Integer count =0;
	if (type.equals("odd")) {
		for (int i = 0; i < list.size(); i++) {
			
		 if(list.get(i)% 2==1){
			 finale.add(list.get(i));
				count++;
				
		 };
			if (count==getnumber) {
			break;	
			}
		}
		
	}else {
		if (type.equals("even")) {
			for (int i = 0; i < list.size(); i++) {
				
			 if(list.get(i)% 2==0){
				 finale.add(list.get(i));
					count++;
					
			 };
				if (count==getnumber) {
				break;	
				}
			}
	}

	
}
	return finale;
}
}
