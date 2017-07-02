package P2.P2ex03;

import java.lang.reflect.InvocationTargetException;

/**
 * Hello world!
 *
 */
public class MVCPatternDemo {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		// fetch student record based on his roll no from the database
		/*Student model = retriveStudentFromDatabase();

		// Create a view : to write student details on console
		StudentView view = new StudentView();

		StudentController controller = new StudentController(model, view);*/
	//	System.out.println(controller.getClass().getName());
		Factory factory = Factory.obterFactory("StudentController");
		Controller controller = factory.criarController();
		controller.updateView();

		// update model data
		controller.setName("John");

		controller.updateView();
		factory = Factory.obterFactory("ProfessorController");
		controller = factory.criarController();
		controller.updateView();

	}

	public static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	public static Professor retriveProfessorFromDatabase() {
		Professor professor = new Professor();
		professor.setName("Adam");
		professor.setSalario(15);
		return professor;
	}

}