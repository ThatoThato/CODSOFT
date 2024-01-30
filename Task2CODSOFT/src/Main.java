import java.util.Scanner;

/**
 * 
 * @author Thato Masike
 */

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int Subject1;
		int Subject2;
		int Subject3;
		int Subject4;
		int Subject5;
		int Subject6;
		int Subject7;
		System.out.println("What is the mark for subject 1?");
		Subject1= scanner.nextInt();
		System.out.println("What is the mark for subject 2?");
		Subject2= scanner.nextInt();
		System.out.println("What is the mark for subject 3?");
		Subject3= scanner.nextInt();
		System.out.println("What is the mark for subject 4?");
		Subject4= scanner.nextInt();
		System.out.println("What is the mark for subject 5?");
		Subject5= scanner.nextInt();
		System.out.println("What is the mark for subject 6?");
		Subject6= scanner.nextInt();
		System.out.println("What is the mark for subject 7?");
		Subject7= scanner.nextInt();
		
		int TotalMark = Subject1 + Subject2 + Subject3 + Subject4 + Subject5 + Subject6 + Subject7;
		System.out.println("the sum of the marks for all subjects is "+ TotalMark);
		
		int GradeAve = TotalMark/7;
		System.out.println("Grade average is: "+ GradeAve);
		
		if(GradeAve > 0 && GradeAve <= 39) {
			System.out.println("how your mark was calculated: \ntotal marks: "+TotalMark+"\naverage percentage: "
					+ GradeAve + "\nFinal Grade: F\n");
		}
		else if(GradeAve > 40 && GradeAve <= 49) {
			System.out.println("how your mark was calculated: \ntotal marks: "+TotalMark+"\naverage percentage: "
					+ GradeAve + "\nFinal Grade: E\n");
		}
		else if(GradeAve > 50 && GradeAve <= 59) {
			System.out.println("how your mark was calculated: \ntotal marks: "+TotalMark+"\naverage percentage: "
					+ GradeAve + "\nFinal Grade: D\n");
		}
		else if(GradeAve > 60 && GradeAve <= 69) {
			System.out.println("how your mark was calculated: \ntotal marks: "+TotalMark+"\naverage percentage: "
					+ GradeAve + "\nFinal Grade: C\n");
		}
		else if(GradeAve > 70 && GradeAve <= 79) {
			System.out.println("how your mark was calculated: \ntotal marks: "+TotalMark+"\naverage percentage: "
					+ GradeAve + "\nFinal Grade: B\n");
		}
		else if(GradeAve > 80 && GradeAve <= 100) {
			System.out.println("how your mark was calculated: \ntotal marks: "+TotalMark+"\naverage percentage: "
					+ GradeAve + "\nFinal Grade: A\n");
		}
		else {
			System.err.println("grade average must be between 0 and 100");
		}

	}

}
