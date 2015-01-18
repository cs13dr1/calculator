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

		default:
			this.model.countClick();
			break;
		}
		
		
			
		}
				
	}


