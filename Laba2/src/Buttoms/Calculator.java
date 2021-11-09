package Buttoms;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 50));
		frame.add(new JLabel("Количество чашек"));
		JTextArea cupnumber = new JTextArea("0");
		frame.add(cupnumber);
		frame.add(new JLabel("Количество сахара(от 0 до 6)"));
		JTextArea sugar = new JTextArea("0");
		frame.add(sugar);
		frame.add(new JLabel("Вид кофе"));
		JComboBox coffee = new JComboBox<String>(new String[] {"Americano","Cappuchino", "Latte"});
		frame.add(coffee);
		JButton button = new JButton("          Заказ кофе            ");
		frame.add(button);
		final JLabel label1 = new JLabel("");
		frame.add(label1);
		final JLabel label2 = new JLabel("");
		frame.add(label2);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num = Float.parseFloat(cupnumber.getText());
				float sug = Float.parseFloat(sugar.getText());
				float result = 0;
				if  (coffee.getSelectedItem().equals("Americano")) {
					result = (100+sug*5)*num;
				}
				else if (coffee.getSelectedItem().equals("Cappuchino")) {
					result = (140 + sug*5)*num;
				}
				else if (coffee.getSelectedItem().equals("Latte")) {
					result = (120 + sug*5)*num;
				}
			label1.setText("К оплате:");
			label2.setText(String.valueOf(result));
		}
		});
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,400);
		frame.setLocation(300,300);
		frame.setTitle("Кофейный автомат");
		frame.setVisible(true);
	}

}

