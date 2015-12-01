public class Creature {
	private Room location;
	private Course course;

	public Creature(Room current, Course course) {
		this.location = current;
		this.course = course;
	}

	public void setRoom(Room next) {
		this.location = next;
	}
}