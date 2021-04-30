package week3_homework2;

public class StudentManager extends UserManager{
	
	//override
	public void login(Student student) {
		System.out.println(student.getFirstName()+" Öðrenci rolünde sisteme girdi.");
	}
	public void joinCourse() {
		System.out.println("Kursa baþarý ile katýldýn");
	}
	public void backLesson() {
		System.out.println("Önceki derse gidildi.");
	}
	public void nextLesson() {
		System.out.println("Sonraki derse gidildi.");
	}
	
}
