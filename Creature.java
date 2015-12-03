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

	public void setCourse(Course newCourse) {
		this.course = newCourse;
	}

	public void returnCourse() {
		return this.course;
	}

		private class Student extends Creature {
			private Book coursebook;
			private Course finishedCourse;

			public Student(Room location, Course course, Book coursebook, Course finishedCourse) {
				super(location, course);
				this.coursebook = cousebook;
				this.finishedCourse = finishedCourse;
			}
		}

		public Book getCoursebook() {
			return this.coursebook;
		}

		public void setCoursebook(Book e) {
			this.coursebook = e;
		}

		public void setfinishedCourse(Course e) {
			this.finishedCourse = e;
		}

		public Course returnfinishedCourse() {
			return this.finishedCourse;
		}

}