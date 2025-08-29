package user_inpot_3;
import java.util.Scanner;
public class AverageMarksOfStudents {
	static int total=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		this is to calculate the average of the marks of students
		System.out.println("Please give the size of the array :");
		int size = sc.nextInt();
		int marks[] = new int[size];
		System.out.println("give the marks of the student :");
		for(int i=0;i<=size-1;i++) {
			marks[i] = sc.nextInt();
		}
		System.out.println("The given marks are :");
		
		for(int i=0;i<=size-1;i++) {
			System.out.println(marks[i]);
		}
		System.out.println("calculating the total sum of marks.");
		
		for(int t: marks) {
			total=total+t;
			
		}
		System.out.println("Total marks  :"+total);
		double avg;
		avg=total/(size-1);
		System.out.println("Average marks is  :"+avg);
		
		
		
		
		}
		
	}
	


