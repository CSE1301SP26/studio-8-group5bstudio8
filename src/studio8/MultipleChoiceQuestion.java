package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
	private String[] choices;
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		super(prompt,answer,points);
		this.choices = choices;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	public void displayPrompt() {
		super.displayPrompt();
		int i = 1;
		for (String s : choices){
			System.out.println(i + ". " + s);
			i++;
		}
	}
	
	
	public String[] getChoices() {
		return choices;
	}
	
	public static void main(String[] args) {
		String [] answerChoices = {"1","2","3","4"};
		Question q2 = new MultipleChoiceQuestion("What is 2+2?", "4", 1, answerChoices);
		q2.displayPrompt();
	}

}
