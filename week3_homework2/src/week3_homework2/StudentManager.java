package week3_homework2;

public class StudentManager extends UserManager{
	
	//override
	public void login(Student student) {
		System.out.println(student.getFirstName()+" ��renci rol�nde sisteme girdi.");
	}
	public void joinCourse() {
		System.out.println("Kursa ba�ar� ile kat�ld�n");
	}
	public void backLesson() {
		System.out.println("�nceki derse gidildi.");
	}
	public void nextLesson() {
		System.out.println("Sonraki derse gidildi.");
	}
	
}
