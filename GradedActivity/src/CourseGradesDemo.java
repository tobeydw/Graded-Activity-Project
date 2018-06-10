//Name: Thomas Nguyen


//Driver program for the course grades class. 
//This class sets the different scores for the lab, pass/fail exam, essay, and final exam.
//Afterwards, it creates an object of type CourseGrades that holds those scores.
//It will then print out their scores and letter grades, average, highest, and lowest scores.
public class CourseGradesDemo {
	
	public static void main(String[] args)
	{
	  //Creates an object for the lab grade.
	  GradedActivity lab = new GradedActivity();
		
	  //Set the lab score at 85.
	  lab.setScore(85);
		
	  //Creates an object for the pass/fail exam.
	  //30 total questions, 3 questions missed, minimum passing score is 70
	  PassFailExam pfexam = new PassFailExam(20, 3, 70);
		
	  //Creates an object for the essay grade.
	  Essay essay = new Essay();
		
	  //Set the essay scores. Grammar = 25, spelling = 18, length = 17, content =20
	  essay.setScore(25,  18,  17, 20);
		
	  //Creates an object for the final exam.
	  //50 questions, 10 missed.
	  FinalExam finalExam = new FinalExam(50, 10);
		
	  //Creates a CourseGrades object.
	  CourseGrades course = new CourseGrades();
	  course.setLab(lab);
	  course.setPassFailExam(pfexam);
	  course.setEssay(essay);
	  course.setFinalExam(finalExam);
		
	  //Prints out the different scores and their letter grades.
	  System.out.println(course.toString());
		
	  //Prints the average score
      System.out.println("Average score: " + course.getAverage());
		
	  //Declares highItem variable as the highest score in order to print it out easier.
	  GradedActivity highItem = course.getHighest();
		
	  //Prints out the highest score.
	  System.out.println("Highest score: " + highItem.getScore());
		
	  //Declares lowItem variable as the lowest score in order to print it out easier.
	  GradedActivity lowItem = course.getLowest();
		
	  //Prints out the lowest score.
	  System.out.println("Lowest score: " + lowItem.getScore());		
	}
}
