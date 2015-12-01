import java.util.*;

public class Course {
	private String name; //name of course
	private int extent; //antal hp
	private Arraylist<String> questionlist;
	private ArrayList<String> answerlist;
	private Book coursebook;

	public Course(String name, int extent, ArrayList questions, ArrayList answers, Book coursebook) {
		this.name = name;
		this.extent = extent;
		this.questionlist = questions;
		this.answerlist = answers;
		this.coursebook = coursebook;
	}

	public String getName() {
		return this.name;
	}

	public int getExtent() {
		return this.extent;
	}

	public Arraylist<String> getQuestions() {
		return this.questionlist;
	}

	public ArrayList<String> getAnswers() {
		return this.answerlist;
	}

	public Book getBook() {
		return this.coursebook;
	}
}