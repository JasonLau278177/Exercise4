package ArrayOneDimensional;
import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		int[] list1 = new int[5];
		int[] list2 = list1;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 5 digits: ");
		
		System.out.println("List1: ");
		for (int i=0; i<list1.length; i++) {
			list1[i] = input.nextInt();
		}
		System.out.println();
		
		System.out.println("List 2: ");
		for(int j=0;j<list2.length;j++) {
			System.out.println(list2[j]);
		}
	}
}
