package P2.P2ex03;

public class ProfessorController extends Controller{
	private Professor model;
	private ProfessorView view;

	public ProfessorController(Professor model, ProfessorView view) {
		this.model = model;
		this.view = view;
	}
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	public String getProfessorName() {
		return model.getName();
	}

	public void setProfessorSalario(double rollNo) {
		model.setSalario(rollNo);
	}

	public double getProfessorSalario() {
		return model.getSalario();
	}

	public void updateView() {
		view.printProfessorDetails(model.getName(), model.getSalario());
	}

}
