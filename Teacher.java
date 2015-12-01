import java.util.Random;

public class Teacher extends Creature {
	private Course course;

	public Teacher(Course course) {
		this.course = course;
	}

	public void askQuestion() {
		ArrayList<String> list = Course.getQuestions();
		for (int i = 0; i < 3, i++) {
			System.out.println(list[i]) + "\n";
		}
	}

	public void generateQuestion(boolean finishedCourse) {
		Random random = new Random();
		int u = random.nextInt(100);
		if finishedCourse {
			if u <= 75 {
				askQuestion();
			}
		}
		else {
			if u <= 50 {
				askQuestion();
			}
		}
	}

	public void determineAnswer(String answer) {
		if list.contains(answer) {
			return True;
		}
		return False;	
	}
}