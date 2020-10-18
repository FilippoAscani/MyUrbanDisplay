import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener {
	
	private int count = 0;
	private JLabel label;
	private JLabel label2;
	private JFrame frame;
	private JButton button; 
	private JPanel panel;
	public GUI() { //faccio il costruttore
		button = new JButton("click me");
		frame = new JFrame();
		panel = new JPanel();
		label = new JLabel ("number of clicks: 0");
		label2 = new JLabel ("nice");
		panel.setBorder(BorderFactory.createEmptyBorder(250, 250, 300, 250)); //nelle parentesi ci va un border object che può essere fatto in questo modo <-
		panel.setLayout(new GridLayout(0,1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("prima GUI");
		frame.pack();
		frame.setVisible(true);
		
		button.addActionListener(this);
		//speramo bene
		
		
	}
	
	
	public static void main(String[] args) {
		new GUI(); //è un constructor
		

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("number of clicks: " + count);
		if(count == 69) {
			panel.add(label2);
		}
		if(count == 70) {
			panel.remove(label2);
		}
		
	}

}
