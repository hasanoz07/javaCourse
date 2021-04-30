package week3_homework2;

public class InstructorManager extends UserManager{
	
	public void login(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" Eðitmen rolünde sisteme girdi.");
	}
	public void addCourse() {
		System.out.println("Kursa Eklendi");
	}
	public void deleteCourse() {
		System.out.println("Kursa Silindi");
	}
	public void addStudent(Student student) {
		System.out.println(student.getFirstName()+" Eklendi");
	}
	public void deleteStudent(Student student) {
		System.out.println(student.getFirstName()+" Silindi");
	}
	
}
