package week3_homework2;

public class Main {

	public static void main(String[] args) {
		
		//Student Nesnesi
		Student student1 = new Student();
		
		student1.setId(1);
		student1.setFirstName("Hasan");
		student1.setLastName("ÖZ");
		student1.setAge(19);
		student1.setEmail("hasanozz2002@gmail.com");
		student1.setSchool("Mehmet Akif Ersoy Üniversitesi");
		
		//Instructor Nesnesi
		Instructor instructor1= new Instructor();
		
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setAge(28);
		instructor1.setEmail("edemirog@kodlama.io");
		instructor1.setJob("Yazılım Danışmanı");
		instructor1.setAbility("MVC,PMP ve ITIL sertifikasyonlarına sahip.");
		
		UserManager userManager=new UserManager();
		StudentManager studentManager=new StudentManager();
		InstructorManager instructorManager=new InstructorManager();
		
		studentManager.login(student1);
		instructorManager.login(instructor1);
		instructorManager.addStudent(student1);
		
		User[] users= {instructor1,student1};
		
		userManager.list(users);
	}
	

}
