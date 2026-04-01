package studio8;

import support.cse131.NotYetImplementedException;

public class Question {
	private String prompt;
	private String answer;
	private int points;
	public Question(String prompt, String answer, int points) {
		this.prompt = prompt;
		this.answer = answer;
		this.points = points;
	}
	
	/**
	 * Prints out the current question's prompt, with a parenthetical 
	 * number of points possible.
	 */
	public void displayPrompt() {
		System.out.println(this.prompt + "(" + this.points + " points)");
	}
	
	/**
	 * Check the answer provided by a user
	 * @param givenAnswer
	 * @return the number of points earned by the givenAnswer
	 */
	public int checkAnswer(String givenAnswer) {
		if(answer.equals(givenAnswer)) { //String comparison
			return this.points;
		} else {
			return 0;
		}
	}
	public int getPoints() {
		return points;
	}
	public String getAnswer() {
		return answer;
	}
	
	public static void main(String[] args) {
		Question q1 = new Question("What is 1+1?","2",1);
		q1.displayPrompt();
	}
}
