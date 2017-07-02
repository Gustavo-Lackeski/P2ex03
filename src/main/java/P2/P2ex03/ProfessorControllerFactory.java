package P2.P2ex03;


public class ProfessorControllerFactory extends Factory{
	 public Controller criarController()  {
	        return new ProfessorController(MVCPatternDemo.retriveProfessorFromDatabase(), new ProfessorView());
	    }
	 public ProfessorControllerFactory(){
		 
	 }
}
