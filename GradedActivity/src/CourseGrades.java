//Name: Thomas Nguyen

/*CourseGrades class that implements the Analyzable interface.
This class handles several methods- saving the scores into a grades array, getting the average
score of the grades, getting the highest and lowest scores of the grades, and
printing out the scores with their letter grades.
*/
public class CourseGrades implements Analyzable{
	//Variable to declare the number of grades to be saved in a grades array.
	public final int NUM_GRADES = 4;
	
	//Variable to reference to an Array of type graded activities.
	private GradedActivity[] grades;
	
	public CourseGrades()
	{
	  //Creates the grades array with length of NUM_GRADES.
	  grades = new GradedActivity[NUM_GRADES];	
	}
	
	//Saves a lab score into the 0th index of the grades array
	public void setLab(GradedActivity aLab)
	{
	  grades[0] = aLab;
	}
	
	//Saves a pass/fail exam score into the 1st index of the grades array
	public void setPassFailExam(PassFailExam aPassFailExam)
	{
	  grades[1] = aPassFailExam;
	}
	
	//Saves an essay score into the 2nd index of the grades array
	public void setEssay(Essay anEssay)
	{
	  grades[2] = anEssay;
	}
	
	//Saves a final exam score into the 3rd index of the grades array
	public void setFinalExam(FinalExam aFinalExam)
	{
	  grades[3] = aFinalExam;
	}
	
	//getAverage method to get the average score of the grades inputted
	public double getAverage()
	{
	  //Total variable to get the total of the scores added together
	  double total = 0.0;
		
	  //Count variable to tell how many scores are being added
	  double count = 0.0;
		
	  //For loop to get the total score and to tell how many scores there are
	  for(int i =0; i<grades.length; i++)
	  {
	    total += grades[i].getScore();
		count++;
	  }
		
	  //Calculates the average score by dividing the total score by how many scores there are
	  double average = total/count;
		
	  return average;
	}
	
	//getHighest method to get the highest score of the grades inputted.
	public GradedActivity getHighest()
	{
	  //Initializes the highest grade as the first one
	  GradedActivity highest = grades[0];
		
	  //For loop to check if the score is higher than the current high score.
	  for(int i =0; i<grades.length; i++)
	  {
		if(grades[i].getScore() > highest.getScore())
		{
		  highest = grades[i];
		}
	  }	
	  return highest;	
	}

	//getLowest method to get the lowest score of the grades inputted.
	public GradedActivity getLowest()
	{
	  //Initializes the highest grade as the first one.
	  GradedActivity lowest = grades[0];
		
	  //For loop to check if the score is lower than the current low score.
	  for(int i =0; i<grades.length; i++)
	  {
	    if(grades[i].getScore() < lowest.getScore())
		{
		  lowest = grades[i];
		}
	  }
	  return lowest;	
	}
	
	//toString method to get the scores and their letter grades.
	public String toString()
	{
	return ("Lab Score: " + grades[0].getScore() + "\tGrade: " + grades[0].getGrade()
	  + "\nPass/Fail Exam Score: " + grades[1].getScore()  + "\tGrade: " + grades[1].getGrade()
	  + "\nEssay Score: " + grades[2].getScore() + "\tGrade: " + grades[2].getGrade()
	  + "\nFinal Exam Score: " + grades[3].getScore() + "\tGrade: " + grades[3].getGrade());		
	}



}
