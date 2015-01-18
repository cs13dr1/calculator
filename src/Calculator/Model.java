package Calculator;

public class Model {

	public View view;
	public Controller controller;
	
	int i = 0;
	String t = "";
	String output = "";
	
	public void countClick() {
		i++;
		//System.out.println("countClick: " + i);
		String t = "" + i;
		this.view.writeClickCount(t);
	}
	
	public void writeOperation(String t) {
		output = output + " " + t;
		this.view.writeOperation(output);
	}

	public void resetAnzeige() {
		i = 0;
		output = "";
		t = "";
		this.view.writeClickCount(output);
		this.view.writeOperation(output);
		
	}
}
