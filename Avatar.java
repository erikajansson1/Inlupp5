import java.util.*;

public class Avatar {
	public ArrayList<Course> currentcourses;
	public ArrayList<Course> donecourses;
	private int hp; //högskolepoäng
	private int weight;
	public ArrayList<Key> keylist;
	public ArrayList<Book> booklist;

	public Avatar(ArrayList<Course> current, ArrayList<Course> done) {
		this.currentcourses = current;
		this.donecourses = done;
		this.hp = 0;
		this.backpack = 0;
	}

	public Avatar() {
		this.currentcourses = new ArrayList<Course>();
		this.donecourses = new ArrayList<Course>();
		this.keylist = new ArrayList<Key>();
		this.booklist = new ArrayList<Book>();
		this.hp = 0;
		this.backpack = 0;
	}

	public void increaseHp(int toAdd) {
		this.hp += toAdd;
	}

	public void increaseWeight(int itemweight) {
		if ((this.weight + itemweight) <= 10) {
			this.weight += itemweight;
		}
		else {
			System.out.println("Your backback is full! Please drop item(s) in order to pick this up!\n");
		}
	}

	public int hp() {
		return this.hp;
	}

	public int weight() {
		return this.weight;
	}

	public void addBook(Book e) {
		this.booklist = booklist.add(e);
	}

	public void addKey(Key e) {
		this.keylist = keylist.add(e);
	}

	public void enrollCourse(Course e) {
		this.currentcourses = currentcourses.add(e);
	}

	public void addDoneCourse(Course e) {
		this.donecourses = donecourses.add(e);
	}

	public boolean isDone() {
		if (this.hp >= 180) {
			return True;
		}
		return False;
	}
}