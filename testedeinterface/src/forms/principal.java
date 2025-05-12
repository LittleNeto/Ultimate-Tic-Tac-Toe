package forms;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel interfaceTTC;
	private final JPanel panel1_1 = new JPanel();
	private final JButton btn1_1_1_2 = new JButton("");
	private final JButton btn1_1_1_3 = new JButton("");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
					frame.setVisible(true);
					frame.setResizable(false);
					frame.setTitle("Ultimate Tic Tac Toe");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 518);
		interfaceTTC = new JPanel();
		interfaceTTC.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(interfaceTTC);
		interfaceTTC.setLayout(null);
		panel1_1.setBounds(21, 11, 185, 161);
		interfaceTTC.add(panel1_1);
		
		Tabuleiro tab = new Tabuleiro();
		
		//**************paineis*****************
		
		JPanel panel1_2 = new JPanel();
		panel1_2.setBounds(206, 11, 185, 161);
		interfaceTTC.add(panel1_2);
		panel1_2.setLayout(null);
		
		JPanel panel1_3 = new JPanel();
		panel1_3.setBounds(391, 11, 185, 161);
		interfaceTTC.add(panel1_3);
		panel1_3.setLayout(null);
		
		JPanel panel2_1 = new JPanel();
		panel2_1.setBounds(21, 172, 185, 161);
		interfaceTTC.add(panel2_1);
		panel2_1.setLayout(null);
		
		JPanel panel2_2 = new JPanel();
		panel2_2.setBounds(206, 172, 185, 161);
		interfaceTTC.add(panel2_2);
		panel2_2.setLayout(null);
		
		JPanel panel2_3 = new JPanel();
		panel2_3.setBounds(391, 172, 185, 161);
		interfaceTTC.add(panel2_3);
		panel2_3.setLayout(null);
		
		JPanel panel3_1 = new JPanel();
		panel3_1.setBounds(21, 333, 185, 146);
		interfaceTTC.add(panel3_1);
		panel3_1.setLayout(null);
		
		JPanel panel3_2 = new JPanel();
		panel3_2.setBounds(206, 333, 185, 146);
		interfaceTTC.add(panel3_2);
		panel3_2.setLayout(null);
		
		JPanel panel3_3 = new JPanel();
		panel3_3.setBounds(391, 333, 185, 146);
		interfaceTTC.add(panel3_3);
		panel3_3.setLayout(null);
		
		Color cor = panel3_3.getBackground();//armazena a cor padrão do painel
		
		//**************labels*****************
		
		JLabel lbl1_1 = new JLabel("");
		lbl1_1.setBounds(80, 35, 99, 99);
		interfaceTTC.add(lbl1_1);
		
		JLabel lbl1_2 = new JLabel("");
		lbl1_2.setBounds(256, 35, 99, 99);
		interfaceTTC.add(lbl1_2);
		
		JLabel lbl1_3 = new JLabel("");
		lbl1_3.setBounds(433, 35, 99, 99);
		interfaceTTC.add(lbl1_3);
		
		JLabel lbl2_1 = new JLabel("");
		lbl2_1.setBounds(80, 194, 99, 99);
		interfaceTTC.add(lbl2_1);
		
		JLabel lbl2_2 = new JLabel("");
		lbl2_2.setBounds(256, 194, 99, 99);
		interfaceTTC.add(lbl2_2);
		
		JLabel lbl2_3 = new JLabel("");
		lbl2_3.setBounds(433, 194, 99, 99);
		interfaceTTC.add(lbl2_3);
		
		JLabel lbl3_1 = new JLabel("");
		lbl3_1.setBounds(80, 344, 99, 99);
		interfaceTTC.add(lbl3_1);
		
		JLabel lbl3_2 = new JLabel("");
		lbl3_2.setBounds(256, 344, 99, 98);
		interfaceTTC.add(lbl3_2);
		
		JLabel lbl3_3 = new JLabel("");
		lbl3_3.setBounds(433, 344, 99, 99);
		interfaceTTC.add(lbl3_3);
		
		//**************botões e suas funções*****************
		
		JButton btn1_1_1_1 = new JButton("");
		btn1_1_1_1.setBounds(18, 11, 43, 33);
		btn1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_1_1_1, panel1_1, panel1_1, lbl1_1, tab, cor, 1, 1, 1, 1);
			}
		});
		
		panel1_1.setLayout(null);
		panel1_1.add(btn1_1_1_1);
		btn1_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_1_1_2, panel1_1, panel1_2, lbl1_1, tab, cor, 1, 1, 1, 2);
			}
		});
		btn1_1_1_2.setBounds(71, 11, 43, 33);
		
		panel1_1.add(btn1_1_1_2);
		btn1_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_1_1_3, panel1_1, panel1_3, lbl1_1, tab, cor, 1, 1, 1, 3);
			}
		});
		btn1_1_1_3.setBounds(124, 11, 43, 33);
		
		panel1_1.add(btn1_1_1_3);
		
		JButton btn1_1_2_1 = new JButton("");
		btn1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_1_2_1, panel1_1, panel2_1, lbl1_1, tab, cor, 1, 1, 2, 1);
			}
		});
		btn1_1_2_1.setBounds(18, 55, 43, 33);
		panel1_1.add(btn1_1_2_1);
		
		JButton btn1_1_2_2 = new JButton("");
		btn1_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_1_2_2, panel1_1, panel2_2, lbl1_1, tab, cor, 1, 1, 2, 2);
			}
		});
		btn1_1_2_2.setBounds(71, 55, 43, 33);
		panel1_1.add(btn1_1_2_2);
		
		JButton btn1_1_2_3 = new JButton("");
		btn1_1_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_1_2_3, panel1_1, panel2_3, lbl1_1, tab, cor, 1, 1, 2, 3);
			}
		});
		btn1_1_2_3.setBounds(124, 55, 43, 33);
		panel1_1.add(btn1_1_2_3);
		
		JButton btn1_1_3_1 = new JButton("");
		btn1_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_1_3_1, panel1_1, panel3_1, lbl1_1, tab, cor, 1, 1, 3, 1);
			}
		});
		btn1_1_3_1.setBounds(18, 99, 43, 33);
		panel1_1.add(btn1_1_3_1);
		
		JButton btn1_1_3_2 = new JButton("");
		btn1_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_1_3_2, panel1_1, panel3_2, lbl1_1, tab, cor, 1, 1, 3, 2);
			}
		});
		btn1_1_3_2.setBounds(71, 99, 43, 33);
		panel1_1.add(btn1_1_3_2);
		
		JButton btn1_1_3_3 = new JButton("");
		btn1_1_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_1_3_3, panel1_1, panel3_3, lbl1_1, tab, cor, 1, 1, 3, 3);
			}
		});
		btn1_1_3_3.setBounds(124, 99, 43, 33);
		panel1_1.add(btn1_1_3_3);
		
		JButton btn1_2_1_1 = new JButton("");
		btn1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_2_1_1, panel1_2, panel1_1, lbl1_2, tab, cor, 1, 2, 1, 1);
			}
		});
		btn1_2_1_1.setBounds(17, 11, 43, 33);
		panel1_2.add(btn1_2_1_1);
		
		JButton btn1_2_1_2 = new JButton("");
		btn1_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_2_1_2, panel1_2, panel1_2, lbl1_2, tab, cor, 1, 2, 1, 2);
			}
		});
		btn1_2_1_2.setBounds(70, 11, 43, 33);
		panel1_2.add(btn1_2_1_2);
		
		JButton btn1_2_1_3 = new JButton("");
		btn1_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_2_1_3, panel1_2, panel1_3, lbl1_2, tab, cor, 1, 2, 1, 3);
			}
		});
		btn1_2_1_3.setBounds(123, 11, 43, 33);
		panel1_2.add(btn1_2_1_3);
		
		JButton btn1_2_2_1 = new JButton("");
		btn1_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_2_2_1, panel1_2, panel2_1, lbl1_2, tab, cor, 1, 2, 2, 1);
			}
		});
		btn1_2_2_1.setBounds(17, 55, 43, 33);
		panel1_2.add(btn1_2_2_1);
		
		JButton btn1_2_2_2 = new JButton("");
		btn1_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_2_2_2, panel1_2, panel2_2, lbl1_2, tab, cor, 1, 2, 2, 2);
			}
		});
		btn1_2_2_2.setBounds(70, 55, 43, 33);
		panel1_2.add(btn1_2_2_2);
		
		JButton btn1_2_2_3 = new JButton("");
		btn1_2_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_2_2_3, panel1_2, panel2_3, lbl1_2, tab, cor, 1, 2, 2, 3);
			}
		});
		btn1_2_2_3.setBounds(123, 55, 43, 33);
		panel1_2.add(btn1_2_2_3);
		
		JButton btn1_2_3_1 = new JButton("");
		btn1_2_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_2_3_1, panel1_2, panel3_1, lbl1_2, tab, cor, 1, 2, 3, 1);
			}
		});
		btn1_2_3_1.setBounds(17, 99, 43, 33);
		panel1_2.add(btn1_2_3_1);
		
		JButton btn1_2_3_2 = new JButton("");
		btn1_2_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_2_3_2, panel1_2, panel3_2, lbl1_2, tab, cor, 1, 2, 3, 2);
			}
		});
		btn1_2_3_2.setBounds(70, 99, 43, 33);
		panel1_2.add(btn1_2_3_2);
		
		JButton btn1_2_3_3 = new JButton("");
		btn1_2_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_2_3_3, panel1_2, panel3_3, lbl1_2, tab, cor, 1, 2, 3, 3);
			}
		});
		btn1_2_3_3.setBounds(123, 99, 43, 33);
		panel1_2.add(btn1_2_3_3);
		
		JButton btn1_3_1_1 = new JButton("");
		btn1_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_3_1_1, panel1_3, panel1_1, lbl1_3, tab, cor, 1, 3, 1, 1);
			}
		});
		btn1_3_1_1.setBounds(17, 11, 43, 33);
		panel1_3.add(btn1_3_1_1);
		
		JButton btn1_3_1_2 = new JButton("");
		btn1_3_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_3_1_2, panel1_3, panel1_2, lbl1_3, tab, cor, 1, 3, 1, 2);
			}
		});
		btn1_3_1_2.setBounds(70, 11, 43, 33);
		panel1_3.add(btn1_3_1_2);
		
		JButton btn1_3_1_3 = new JButton("");
		btn1_3_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_3_1_3, panel1_3, panel1_3, lbl1_3, tab, cor, 1, 3, 1, 3);
			}
		});
		btn1_3_1_3.setBounds(123, 11, 43, 33);
		panel1_3.add(btn1_3_1_3);
		
		JButton btn1_3_2_1 = new JButton("");
		btn1_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_3_2_1, panel1_3, panel2_1, lbl1_3, tab, cor, 1, 3, 2, 1);
			}
		});
		btn1_3_2_1.setBounds(17, 55, 43, 33);
		panel1_3.add(btn1_3_2_1);
		
		JButton btn1_3_2_2 = new JButton("");
		btn1_3_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_3_2_2, panel1_3, panel2_2, lbl1_3, tab, cor, 1, 3, 2, 2);
			}
		});
		btn1_3_2_2.setBounds(70, 55, 43, 33);
		panel1_3.add(btn1_3_2_2);
		
		JButton btn1_3_2_3 = new JButton("");
		btn1_3_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_3_2_3, panel1_3, panel2_3, lbl1_3, tab, cor, 1, 3, 2, 3);
			}
		});
		btn1_3_2_3.setBounds(123, 55, 43, 33);
		panel1_3.add(btn1_3_2_3);
		
		JButton btn1_3_3_1 = new JButton("");
		btn1_3_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_3_3_1, panel1_3, panel3_1, lbl1_3, tab, cor, 1, 3, 3, 1);
			}
		});
		btn1_3_3_1.setBounds(17, 99, 43, 33);
		panel1_3.add(btn1_3_3_1);
		
		JButton btn1_3_3_2 = new JButton("");
		btn1_3_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_3_3_2, panel1_3, panel3_2, lbl1_3, tab, cor, 1, 3, 3, 2);
			}
		});
		btn1_3_3_2.setBounds(70, 99, 43, 33);
		panel1_3.add(btn1_3_3_2);
		
		JButton btn1_3_3_3 = new JButton("");
		btn1_3_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn1_3_3_3, panel1_3, panel3_3, lbl1_3, tab, cor, 1, 3, 3, 3);
			}
		});
		btn1_3_3_3.setBounds(123, 99, 43, 33);
		panel1_3.add(btn1_3_3_3);
		
		JButton btn2_1_1_1 = new JButton("");
		btn2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_1_1_1, panel2_1, panel1_1, lbl2_1, tab, cor, 2, 1, 1, 1);
			}
		});
		btn2_1_1_1.setBounds(20, 21, 43, 33);
		panel2_1.add(btn2_1_1_1);
		
		JButton btn2_1_1_2 = new JButton("");
		btn2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_1_1_2, panel2_1, panel1_2, lbl2_1, tab, cor, 2, 1, 1, 2);
			}
		});
		btn2_1_1_2.setBounds(73, 21, 43, 33);
		panel2_1.add(btn2_1_1_2);
		
		JButton btn2_1_1_3 = new JButton("");
		btn2_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_1_1_3, panel2_1, panel1_3, lbl2_1, tab, cor, 2, 1, 1, 3);
			}
		});
		btn2_1_1_3.setBounds(126, 21, 43, 33);
		panel2_1.add(btn2_1_1_3);
		
		JButton btn2_1_2_1 = new JButton("");
		btn2_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_1_2_1, panel2_1, panel2_1, lbl2_1, tab, cor, 2, 1, 2, 1);
			}
		});
		btn2_1_2_1.setBounds(20, 65, 43, 33);
		panel2_1.add(btn2_1_2_1);
		
		JButton btn2_1_2_2 = new JButton("");
		btn2_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_1_2_2, panel2_1, panel2_2, lbl2_1, tab, cor, 2, 1, 2, 2);
			}
		});
		btn2_1_2_2.setBounds(73, 65, 43, 33);
		panel2_1.add(btn2_1_2_2);
		
		JButton btn2_1_2_3 = new JButton("");
		btn2_1_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_1_2_3, panel2_1, panel2_3, lbl2_1, tab, cor, 2, 1, 2, 3);
			}
		});
		btn2_1_2_3.setBounds(126, 65, 43, 33);
		panel2_1.add(btn2_1_2_3);
		
		JButton btn2_1_3_1 = new JButton("");
		btn2_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_1_3_1, panel2_1, panel3_1, lbl2_1, tab, cor, 2, 1, 3, 1);
			}
		});
		btn2_1_3_1.setBounds(20, 109, 43, 33);
		panel2_1.add(btn2_1_3_1);
		
		JButton btn2_1_3_2 = new JButton("");
		btn2_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_1_3_2, panel2_1, panel3_2, lbl2_1, tab, cor, 2, 1, 3, 2);
			}
		});
		btn2_1_3_2.setBounds(73, 109, 43, 33);
		panel2_1.add(btn2_1_3_2);
		
		JButton btn2_1_3_3 = new JButton("");
		btn2_1_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_1_3_3, panel2_1, panel3_3, lbl2_1, tab, cor, 2, 1, 3, 3);
			}
		});
		btn2_1_3_3.setBounds(126, 109, 43, 33);
		panel2_1.add(btn2_1_3_3);
		
		JButton btn2_2_1_1 = new JButton("");
		btn2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_2_1_1, panel2_2, panel1_1, lbl2_2, tab, cor, 2, 2, 1, 1);
			}
		});
		btn2_2_1_1.setBounds(17, 22, 43, 33);
		panel2_2.add(btn2_2_1_1);
		
		JButton btn2_2_1_2 = new JButton("");
		btn2_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_2_1_2, panel2_2, panel1_2, lbl2_2, tab, cor, 2, 2, 1, 2);
			}
		});
		btn2_2_1_2.setBounds(70, 22, 43, 33);
		panel2_2.add(btn2_2_1_2);
		
		JButton btn2_2_1_3 = new JButton("");
		btn2_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_2_1_3, panel2_2, panel1_3, lbl2_2, tab, cor, 2, 2, 1, 3);
			}
		});
		btn2_2_1_3.setBounds(123, 22, 43, 33);
		panel2_2.add(btn2_2_1_3);
		
		JButton btn2_2_2_1 = new JButton("");
		btn2_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_2_2_1, panel2_2, panel2_1, lbl2_2, tab, cor, 2, 2, 2, 1);
			}
		});
		btn2_2_2_1.setBounds(17, 66, 43, 33);
		panel2_2.add(btn2_2_2_1);
		
		JButton btn2_2_2_2 = new JButton("");
		btn2_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_2_2_2, panel2_2, panel2_2, lbl2_2, tab, cor, 2, 2, 2, 2);
			}
		});
		btn2_2_2_2.setBounds(70, 66, 43, 33);
		panel2_2.add(btn2_2_2_2);
		
		JButton btn2_2_2_3 = new JButton("");
		btn2_2_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_2_2_3, panel2_2, panel2_3, lbl2_2, tab, cor, 2, 2, 2, 3);
			}
		});
		btn2_2_2_3.setBounds(123, 66, 43, 33);
		panel2_2.add(btn2_2_2_3);
		
		JButton btn2_2_3_1 = new JButton("");
		btn2_2_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_2_3_1, panel2_2, panel3_1, lbl2_2, tab, cor, 2, 2, 3, 1);
			}
		});
		btn2_2_3_1.setBounds(17, 110, 43, 33);
		panel2_2.add(btn2_2_3_1);
		
		JButton btn2_2_3_2 = new JButton("");
		btn2_2_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_2_3_2, panel2_2, panel3_2, lbl2_2, tab, cor, 2, 2, 3, 2);
			}
		});
		btn2_2_3_2.setBounds(70, 110, 43, 33);
		panel2_2.add(btn2_2_3_2);
		
		JButton btn2_2_3_3 = new JButton("");
		btn2_2_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_2_3_3, panel2_2, panel3_3, lbl2_2, tab, cor, 2, 2, 3, 3);
			}
		});
		btn2_2_3_3.setBounds(123, 110, 43, 33);
		panel2_2.add(btn2_2_3_3);
		
		JButton btn2_3_1_1 = new JButton("");
		btn2_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_3_1_1, panel2_3, panel1_1, lbl2_3, tab, cor, 2, 3, 1, 1);
			}
		});
		btn2_3_1_1.setBounds(18, 21, 43, 33);
		panel2_3.add(btn2_3_1_1);
		
		JButton btn2_3_1_2 = new JButton("");
		btn2_3_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_3_1_2, panel2_3, panel1_2, lbl2_3, tab, cor, 2, 3, 1, 2);
			}
		});
		btn2_3_1_2.setBounds(71, 21, 43, 33);
		panel2_3.add(btn2_3_1_2);
		
		JButton btn2_3_1_3 = new JButton("");
		btn2_3_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_3_1_3, panel2_3, panel1_3, lbl2_3, tab, cor, 2, 3, 1, 3);
			}
		});
		btn2_3_1_3.setBounds(124, 21, 43, 33);
		panel2_3.add(btn2_3_1_3);
		
		JButton btn2_3_2_1 = new JButton("");
		btn2_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_3_2_1, panel2_3, panel2_1, lbl2_3, tab, cor, 2, 3, 2, 1);
			}
		});
		btn2_3_2_1.setBounds(18, 65, 43, 33);
		panel2_3.add(btn2_3_2_1);
		
		JButton btn2_3_2_2 = new JButton("");
		btn2_3_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_3_2_2, panel2_3, panel2_2, lbl2_3, tab, cor, 2, 3, 2, 2);
			}
		});
		btn2_3_2_2.setBounds(71, 65, 43, 33);
		panel2_3.add(btn2_3_2_2);
		
		JButton btn2_3_2_3 = new JButton("");
		btn2_3_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_3_2_3, panel2_3, panel2_3, lbl2_3, tab, cor, 2, 3, 2, 3);
			}
		});
		btn2_3_2_3.setBounds(124, 65, 43, 33);
		panel2_3.add(btn2_3_2_3);
		
		JButton btn2_3_3_1 = new JButton("");
		btn2_3_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_3_3_1, panel2_3, panel3_1, lbl2_3, tab, cor, 2, 3, 3, 1);
			}
		});
		btn2_3_3_1.setBounds(18, 109, 43, 33);
		panel2_3.add(btn2_3_3_1);
		
		JButton btn2_3_3_2 = new JButton("");
		btn2_3_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_3_3_2, panel2_3, panel3_2, lbl2_3, tab, cor, 2, 3, 3, 2);
			}
		});
		btn2_3_3_2.setBounds(71, 109, 43, 33);
		panel2_3.add(btn2_3_3_2);
		
		JButton btn2_3_3_3 = new JButton("");
		btn2_3_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn2_3_3_3, panel2_3, panel3_3, lbl2_3, tab, cor, 2, 3, 3, 3);
			}
		});
		btn2_3_3_3.setBounds(124, 108, 43, 34);
		panel2_3.add(btn2_3_3_3);
		
		JButton btn3_1_1_1 = new JButton("");
		btn3_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_1_1_1, panel3_1, panel1_1, lbl3_1, tab, cor, 3, 1, 1, 1);
			}
		});
		btn3_1_1_1.setBounds(19, 11, 43, 33);
		panel3_1.add(btn3_1_1_1);
		
		JButton btn3_1_1_2 = new JButton("");
		btn3_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_1_1_2, panel3_1, panel1_2, lbl3_1, tab, cor, 3, 1, 1, 2);
			}
		});
		btn3_1_1_2.setBounds(72, 11, 43, 33);
		panel3_1.add(btn3_1_1_2);
		
		JButton btn3_1_1_3 = new JButton("");
		btn3_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_1_1_3, panel3_1, panel1_3, lbl3_1, tab, cor, 3, 1, 1, 3);
			}
		});
		btn3_1_1_3.setBounds(125, 11, 43, 33);
		panel3_1.add(btn3_1_1_3);
		
		JButton btn3_1_2_1 = new JButton("");
		btn3_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_1_2_1, panel3_1, panel2_1, lbl3_1, tab, cor, 3, 1, 2, 1);
			}
		});
		btn3_1_2_1.setBounds(19, 55, 43, 33);
		panel3_1.add(btn3_1_2_1);
		
		JButton btn3_1_2_2 = new JButton("");
		btn3_1_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_1_2_2, panel3_1, panel2_2, lbl3_1, tab, cor, 3, 1, 2, 2);
			}
		});
		btn3_1_2_2.setBounds(72, 55, 43, 33);
		panel3_1.add(btn3_1_2_2);
		
		JButton btn3_1_2_3 = new JButton("");
		btn3_1_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_1_2_3, panel3_1, panel2_3, lbl3_1, tab, cor, 3, 1, 2, 3);
			}
		});
		btn3_1_2_3.setBounds(125, 55, 43, 33);
		panel3_1.add(btn3_1_2_3);
		
		JButton btn3_1_3_1 = new JButton("");
		btn3_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_1_3_1, panel3_1, panel3_1, lbl3_1, tab, cor, 3, 1, 3, 1);
			}
		});
		btn3_1_3_1.setBounds(19, 99, 43, 33);
		panel3_1.add(btn3_1_3_1);
		
		JButton btn3_1_3_2 = new JButton("");
		btn3_1_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_1_3_2, panel3_1, panel3_2, lbl3_1, tab, cor, 3, 1, 3, 2);
			}
		});
		btn3_1_3_2.setBounds(72, 99, 43, 33);
		panel3_1.add(btn3_1_3_2);
		
		JButton btn3_1_3_3 = new JButton("");
		btn3_1_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_1_3_3, panel3_1, panel3_3, lbl3_1, tab, cor, 3, 1, 3, 3);
			}
		});
		btn3_1_3_3.setBounds(125, 99, 43, 33);
		panel3_1.add(btn3_1_3_3);
		
		JButton btn3_2_1_1 = new JButton("");
		btn3_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_2_1_1, panel3_2, panel1_1, lbl3_2, tab, cor, 3, 2, 1, 1);
			}
		});
		btn3_2_1_1.setBounds(19, 11, 43, 33);
		panel3_2.add(btn3_2_1_1);
		
		JButton btn3_2_1_2 = new JButton("");
		btn3_2_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_2_1_2, panel3_2, panel1_2, lbl3_2, tab, cor, 3, 2, 1, 2);
			}
		});
		btn3_2_1_2.setBounds(72, 11, 43, 33);
		panel3_2.add(btn3_2_1_2);
		
		JButton btn3_2_1_3 = new JButton("");
		btn3_2_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_2_1_3, panel3_2, panel1_3, lbl3_2, tab, cor, 3, 2, 1, 3);
			}
		});
		btn3_2_1_3.setBounds(125, 11, 43, 33);
		panel3_2.add(btn3_2_1_3);
		
		JButton btn3_2_2_1 = new JButton("");
		btn3_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_2_2_1, panel3_2, panel2_1, lbl3_2, tab, cor, 3, 2, 2, 1);
			}
		});
		btn3_2_2_1.setBounds(19, 55, 43, 33);
		panel3_2.add(btn3_2_2_1);
		
		JButton btn3_2_2_2 = new JButton("");
		btn3_2_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_2_2_2, panel3_2, panel2_2, lbl3_2, tab, cor, 3, 2, 2, 2);
			}
		});
		btn3_2_2_2.setBounds(72, 55, 43, 33);
		panel3_2.add(btn3_2_2_2);
		
		JButton btn3_2_2_3 = new JButton("");
		btn3_2_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_2_2_3, panel3_2, panel2_3, lbl3_2, tab, cor, 3, 2, 2, 3);
			}
		});
		btn3_2_2_3.setBounds(125, 55, 43, 33);
		panel3_2.add(btn3_2_2_3);
		
		JButton btn3_2_3_1 = new JButton("");
		btn3_2_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_2_3_1, panel3_2, panel3_1, lbl3_2, tab, cor, 3, 2, 3, 1);
			}
		});
		btn3_2_3_1.setBounds(19, 99, 43, 33);
		panel3_2.add(btn3_2_3_1);
		
		JButton btn3_2_3_2 = new JButton("");
		btn3_2_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_2_3_2, panel3_2, panel3_2, lbl3_2, tab, cor, 3, 2, 3, 2);
			}
		});
		btn3_2_3_2.setBounds(72, 99, 43, 33);
		panel3_2.add(btn3_2_3_2);
		
		JButton btn3_2_3_3 = new JButton("");
		btn3_2_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_2_3_3, panel3_2, panel3_3, lbl3_2, tab, cor, 3, 2, 3, 3);
			}
		});
		btn3_2_3_3.setBounds(125, 99, 43, 33);
		panel3_2.add(btn3_2_3_3);
		
		JButton btn3_3_1_1 = new JButton("");
		btn3_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_3_1_1, panel3_3, panel1_1, lbl3_3, tab, cor, 3, 3, 1, 1);
			}
		});
		btn3_3_1_1.setBounds(20, 11, 43, 33);
		panel3_3.add(btn3_3_1_1);
		
		JButton btn3_3_1_2 = new JButton("");
		btn3_3_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_3_1_2, panel3_3, panel1_2, lbl3_3, tab, cor, 3, 3, 1, 2);
			}
		});
		btn3_3_1_2.setBounds(73, 11, 43, 33);
		panel3_3.add(btn3_3_1_2);
		
		JButton btn3_3_1_3 = new JButton("");
		btn3_3_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_3_1_3, panel3_3, panel1_3, lbl3_3, tab, cor, 3, 3, 1, 3);
			}
		});
		btn3_3_1_3.setBounds(126, 11, 43, 33);
		panel3_3.add(btn3_3_1_3);
		
		JButton btn3_3_2_1 = new JButton("");
		btn3_3_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_3_2_1, panel3_3, panel2_1, lbl3_3, tab, cor, 3, 3, 2, 1);
			}
		});
		btn3_3_2_1.setBounds(20, 55, 43, 33);
		panel3_3.add(btn3_3_2_1);
		
		JButton btn3_3_2_2 = new JButton("");
		btn3_3_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_3_2_2, panel3_3, panel2_2, lbl3_3, tab, cor, 3, 3, 2, 2);
			}
		});
		btn3_3_2_2.setBounds(73, 55, 43, 33);
		panel3_3.add(btn3_3_2_2);
		
		JButton btn3_3_2_3 = new JButton("");
		btn3_3_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_3_2_3, panel3_3, panel2_3, lbl3_3, tab, cor, 3, 3, 2, 3);
			}
		});
		btn3_3_2_3.setBounds(126, 55, 43, 33);
		panel3_3.add(btn3_3_2_3);
		
		JButton btn3_3_3_1 = new JButton("");
		btn3_3_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_3_3_1, panel3_3, panel3_1, lbl3_3, tab, cor, 3, 3, 3, 1);
			}
		});
		btn3_3_3_1.setBounds(20, 99, 43, 33);
		panel3_3.add(btn3_3_3_1);
		
		JButton btn3_3_3_2 = new JButton("");
		btn3_3_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_3_3_2, panel3_3, panel3_2, lbl3_3, tab, cor, 3, 3, 3, 2);
			}
		});
		btn3_3_3_2.setBounds(73, 99, 43, 33);
		panel3_3.add(btn3_3_3_2);
		
		JButton btn3_3_3_3 = new JButton("");
		btn3_3_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Executor.executar(btn3_3_3_3, panel3_3, panel3_3, lbl3_3, tab, cor, 3, 3, 3, 3);
			}
		});
		btn3_3_3_3.setBounds(126, 99, 43, 33);
		panel3_3.add(btn3_3_3_3);
		
	}
}
