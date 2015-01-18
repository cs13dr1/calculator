package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	
	public View view;
	public Model model;

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		case "about":
			About about = new About();
			about.initialise();
			this.model.countClick();
			break;
		
		case "theme":
			this.view.changeTheme();
			this.model.countClick();
			break;
			
		case "1":
			this.model.writeOperation("1");
			this.model.countClick();
			break;
			
		case "2":
			this.model.writeOperation("2");
			this.model.countClick();
			break;
			
		case "3":
			this.model.writeOperation("3");
			this.model.countClick();
			break;
			
		case "4":
			this.model.writeOperation("4");
			this.model.countClick();
			break;
			
		case "5":
			this.model.writeOperation("5");
			this.model.countClick();
			break;
			
		case "6":
			this.model.writeOperation("6");
			this.model.countClick();
			break;
			
		case "7":
			this.model.writeOperation("7");
			this.model.countClick();
			break;
			
		case "8":
			this.model.writeOperation("8");
			this.model.countClick();
			break;
			
		case "9":
			this.model.writeOperation("9");
			this.model.countClick();
			break;
			
		case "0":
			this.model.writeOperation("0");
			this.model.countClick();
			break;
		
		case "+":
			this.model.writeOperation("+");
			this.model.countClick();
			break;
			
		case "-":
			this.model.writeOperation("-");
			this.model.countClick();
			break;
			
		case "*":
			this.model.writeOperation("*");
			this.model.countClick();
			break;
			
		case "/":
			this.model.writeOperation("/");
			this.model.countClick();
			break;
			
		case "Reset":
			this.model.resetAnzeige();
			//this.model.countClick();
			break;

		default:
			this.model.countClick();
			break;
		}
		
		
			
		}
				
	}


