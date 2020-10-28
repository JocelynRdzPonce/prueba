package rompecabezas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class puzzle extends JFrame {

	int cont=1;
	int i=0;
	int n;

	
	private JPanel contentPane;
	private JTextField txtContador;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					puzzle frame = new puzzle();
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
	public puzzle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(42, 34, 241, 181);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn2.setBackground(new Color(199, 21, 133));
		btn2.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn2.setForeground(new Color(255, 255, 255));
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn3.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btn3.setBackground(new Color(199, 21, 133));
		btn3.setForeground(new Color(255, 255, 255));
		panel.add(btn3);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn6.setBackground(new Color(199, 21, 133));
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setFont(new Font("Segoe UI", Font.BOLD, 30));
		panel.add(btn6);
		
		JButton btnNewButton_4 = new JButton("1");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btnNewButton_4.setBackground(new Color(199, 21, 133));
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("5");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btnNewButton_2.setBackground(new Color(199, 21, 133));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setForeground(new Color(255, 255, 255));
		btnNewButton_5.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btnNewButton_5.setBackground(new Color(199, 21, 133));
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("4");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setForeground(new Color(255, 255, 255));
		btnNewButton_6.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btnNewButton_6.setBackground(new Color(199, 21, 133));
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setForeground(new Color(255, 255, 255));
		btnNewButton_7.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btnNewButton_7.setBackground(new Color(199, 21, 133));
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setFont(new Font("Segoe UI", Font.BOLD, 30));
		btnNewButton_8.setBackground(new Color(199, 21, 133));
		panel.add(btnNewButton_8);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(339, 59, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtContador = new JTextField();
		txtContador.setBounds(319, 95, 86, 20);
		contentPane.add(txtContador);
		txtContador.setColumns(10);
		
		JButton btnNewButton = new JButton("JUEGO NUEVO");
		btnNewButton.setBounds(125, 226, 89, 23);
		contentPane.add(btnNewButton);
	}
}
