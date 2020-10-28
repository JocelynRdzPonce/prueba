package prueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.Random;
import java.util.Stack;

public class ejercicio extends JFrame {
	

	int Aleatorios[]= new int[8];
	
	JButton JButton1 = new JButton("");
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejercicio frame = new ejercicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ejercicio() {
		Numeros();
		JButton1.setText(String.valueOf(Aleatorios[0]));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(28, 30, 267, 171);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton JButton1 = new JButton("");
		panel.add(JButton1);
		
		JButton btn2 = new JButton("");
		panel.add(btn2);
		
		JButton btn3 = new JButton("");
		panel.add(btn3);
		
		JButton btn4 = new JButton("");
		panel.add(btn4);
		
		JButton btn5 = new JButton("");
		panel.add(btn5);
		
		JButton btn6 = new JButton("");
		panel.add(btn6);
		
		JButton btn7 = new JButton("");
		panel.add(btn7);
		
		JButton btn8 = new JButton("");
		panel.add(btn8);
		
		JButton btn9 = new JButton("");
		panel.add(btn9);
	
	}
	
	public void Numeros() {
		Stack<Integer> Numeros= new Stack<Integer>();
		Random Rnd = new Random();
		int Aleatorio;
		
		
		for(int i=0;i<8;i++) {
			Aleatorio=(int)(Rnd.nextDouble()*8+1);
			while(Numeros.contains(Aleatorio)) {
				Aleatorio=(int)(Rnd.nextDouble()*8+1);
			}
			Numeros.push(Aleatorio);
			Aleatorios[i]=Aleatorio;
			System.out.println(Aleatorios[i]);   
		} 
	
	}  
}

