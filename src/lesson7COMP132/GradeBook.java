package lesson7COMP132;

public class GradeBook {

	private int[][] grades;
	private String[] subjects;
	private String[] students;
	
	public GradeBook() {
		
	}

	public GradeBook(int[][] grades, String[] subjects, String[] students) {
		this.grades = grades;
		this.subjects = subjects;
		this.students = students;
	}

	public int[][] getGrades() {
		return grades;
	}

	public void setGrades(int[][] grades) {
		this.grades = grades;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public String[] getStudents() {
		return students;
	}

	public void setStudents(String[] students) {
		this.students = students;
	}
	
	@Override
	public String toString() {
		return "P" + grades + "\n" + subjects + "\n" + students;
	}
	
	
	
}