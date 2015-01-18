package Calculator;

public class Model {

	public View view;
	public Controller controller;
	
	int i = 0;
	String t = null;
	
	public void countClick() {
		i++;
		System.out.println("countClick: " + i);
		String t = "" + i;
		this.view.writeClickCount(t);
	}
}
