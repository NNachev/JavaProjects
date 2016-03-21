import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import org.apache.commons.lang3.RandomUtils;

public class RandomizeNumbersNtoM {
public static void main(String[] args) {
	Scanner inputScan=new Scanner(System.in);
	Integer numberN=inputScan.nextInt();
	Integer numberM=inputScan.nextInt();
	ArrayList<Integer>list=new ArrayList<>();
	if (numberM>numberN) {
		for (int i = numberN; i <=numberM; i++) {
			list.add(i);
		}
	}
	else if (numberM==numberN) {
		list.add(numberM);
	}
	else {
		for (int i = numberM; i <=numberN; i++) {
			list.add(i);
		}
	}
	Collections.shuffle(list);
	for (int i = 0; i < list.size(); i++) {
		System.out.print(list.get(i)+" ");
	}
}
}
