package P2.P2ex03;

public class StudentControllerFactory extends Factory{
	public Controller criarController()  {
        return new StudentController(MVCPatternDemo.retriveStudentFromDatabase() , new StudentView());
    }
	public StudentControllerFactory(){
		
	}
}
