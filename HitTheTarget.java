import java.util.Scanner;

public class HitTheTarget {
	public static void main(String[] args) {
		Scanner inputScan=new Scanner(System.in);
		Integer target=inputScan.nextInt();
		for (int i = 1; i <=20; i++) {
			for (int j = 1; j <=20; j++) {
				if (i+j==target) {
					System.out.println(i+" + "+j+" = "+target);
				}
				if (i-j==target) {
					System.out.println(i+" - "+j+" = "+target);
				}
			}
		}
	}

}
