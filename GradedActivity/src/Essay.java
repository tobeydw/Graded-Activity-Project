//Name: Thomas Nguyen

// Essay class to get the score for an essay. 
// It adds up 4 different scores (grammar, spelling, correct length, and content) and totals them up
// I did not include accessor methods for grammar, spelling, correct length, and content
// since they were unused.
public class Essay extends GradedActivity{
	
	//Initializes the variables needed
	private double grammar, spelling, correctLength, content;
	
	//Sets the essay score by adding the grammar, spelling, correct length, and content scores.
	public void setScore(double gr, double sp, double len,double cnt)
	{
		setGrammar(gr);
		setSpelling(sp);
		setCorrectLength(len);
		setContent(cnt);
		super.setScore(grammar + spelling + correctLength + content);
	}
	
	//Mutator for grammar score
	private void setGrammar(double g)
	{
		if(g<=30.0)
			grammar = g;
		else
			grammar = 0;
	}
	
	//Mutator for spelling score
	private void setSpelling(double sp)
	{
		if(sp<=20.0)
			spelling = sp;
		else
			spelling = 0;
	}
	
	//Mutator for correct length score
	private void setCorrectLength(double len)
	{
		if(len<=20.0)
			correctLength = len;
		else
			correctLength = 0;
	}
	
	//Mutator for content score
	private void setContent(double cnt)
	{
		if(cnt<=30.0)
			content = cnt;
		else
			content = 0;
	}
	
	//Accessor for total score.
	public double getScore()
	{
		return grammar + spelling + correctLength + content;
	}

}
