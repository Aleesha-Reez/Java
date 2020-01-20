import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Color;

import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
enum Operation 
{
	ADD, SUBTRACT, MULTIPLY, DIVIDE
}


public class calculator extends JFrame {
	
	private JTextField resultTextField;
	private JButton add, subtract, multiply, divide, compute, clear;
	private JButton numbers[];
	private Font font;
	int first = 0;
	int second = 0;
	boolean flag = false;
	Operation o;
	
	public calculator() {
		
		setTitle("Calculator");
		createComponents();
		setLayout();
		addComponents();
		addBehaviors();
		display();
	}
	
	
	class OperationListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			flag = true;

			if (e.getSource() == add) {
				o = Operation.ADD;

			}
			if (e.getSource() == subtract) {
				o = Operation.SUBTRACT;

			}
			if (e.getSource() == multiply) {
				o = Operation.MULTIPLY;

			}
			if (e.getSource() == divide) {
				o = Operation.DIVIDE;

			}
			resultTextField.setText("");
		}
	}
	
	class ComputeListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
		  
			  flag = false;
		  
			  int result = 0;
			  if (o == Operation.ADD) {
				result = first + second;
			  }
			  if (o == Operation.SUBTRACT) {
				result = first - second;
			  }
			  if (o == Operation.DIVIDE) {
				result = first / second;

			  }
			if (o == Operation.MULTIPLY) {
				result = first * second;
			}

			Integer.toString(result);
			first = 0;
			second = 0;
			resultTextField.setText(result + "");
		}
	}

	class DigitsListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String number = null;
			if(!flag)
			{
				for (int i = 0; i < 10; i++) 
				{
					if (e.getSource() == numbers[i]) 
					{
						number = resultTextField.getText() + numbers[i].getActionCommand();
						resultTextField.setText(number);
					}
				}

				first = Integer.parseInt(number);
			}
			else
			{
				for (int i = 0; i < 10; i++) 
				{
					if (e.getSource() == numbers[i]) 
					{
						number = resultTextField.getText() + numbers[i].getActionCommand();
						resultTextField.setText(number);
					}
				}

				second = Integer.parseInt(number);
			}
		}
	}

	class ClearListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == clear) 
			{
				resultTextField.setText("");
				first = 0;
				second = 0;
			}
		}
	}
	
	
	private void addBehaviors() {
		
		ComputeListener cl = new ComputeListener();
		compute.addActionListener(cl);
		
		OperationListener ol = new OperationListener();
		
		add.addActionListener(ol);
		subtract.addActionListener(ol);
		multiply.addActionListener(ol);
		divide.addActionListener(ol);
		
		DigitsListener d1 = new DigitsListener();
		for (int i = 0; i < 10; i++) 
		{
			numbers[i].addActionListener(d1);

		}
		
		ClearListener c1 = new ClearListener();
		clear.addActionListener(c1);
	}
	
	
	private void display() {
		setSize(400, 550);
		setVisible(true);
	}
	
	
	private void addComponents() 
	{
		Container c = getContentPane();
		c.setBackground(Color.gray);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.gray);
		panel.add(resultTextField);
		
		c.add(panel);
		
		JPanel p = new JPanel();
		p.add(numbers[7]);
		p.add(numbers[8]);
		p.add(numbers[9]);
		p.add(divide);
		p.setBackground(Color.gray);
		
		c.add(p);
		
		p = new JPanel();
		p.add(numbers[4]);
		p.add(numbers[5]);
		p.add(numbers[6]);
		p.add(multiply);
		p.setBackground(Color.gray);
		
		c.add(p);
		
		p = new JPanel();
		p.add(numbers[1]);
		p.add(numbers[2]);
		p.add(numbers[3]);
		p.add(subtract);
		p.setBackground(Color.gray);
		
		c.add(p);
		
		panel = new JPanel();
		panel.add(numbers[0]);
		panel.add(clear);
		panel.add(compute);
		panel.add(add);
		
		panel.setBackground(Color.gray);
		c.add(panel);

	}
	private void setLayout() 
	{
		GridLayout gl = new GridLayout(6, 1);
		Container c = this.getContentPane();
		c.setLayout(gl);		
		c.setBackground(Color.gray);
		
	}
	private void createComponents() 
	{
		font = new Font("TimesRoman", Font.PLAIN, 36);
		
		resultTextField = new JTextField(10);
		resultTextField.setFont(font);
		
		add = new JButton("+");
		add.setFont(font);
		
		subtract = new JButton("-");
		subtract.setFont(font);
		
		multiply = new JButton("*");
		multiply.setFont(font);
		
		divide = new JButton("%");
		divide.setFont(font);
		
		compute = new JButton("=");
		compute.setFont(font);
		
		clear = new JButton("C");
		clear.setFont(font);
		
		numbers = new JButton[10];
		for (int i = 0; i < 10; i++) {
			numbers[i] = new JButton(i + "");
			numbers[i].setFont(font);
		}
	}
	public static void main(String[] args) 
	{
		calculator calc = new calculator();
	}

}
