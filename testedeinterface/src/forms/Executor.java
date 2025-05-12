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

public class Executor {
	public static void executar(JButton btn, JPanel panel1, JPanel panel2, JLabel lbl, Tabuleiro tab, Color cor, int i, int j, int k, int l) {
		
		//verifica se a jogada é válida ou não
		if (!tab.getJogadaLivre() && panel1.getBackground() != Color.GREEN) {
			JOptionPane.showMessageDialog(null, "Você não pode jogar nessa posição no momento! Por favor, tente novamente!","Tabuleiro Inválido" , JOptionPane.WARNING_MESSAGE);
		} else if (!btn.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Essa posição já foi preenchida! Por favor, tente novamente!", "Posição inválida", JOptionPane.WARNING_MESSAGE);
		} else {
			tab.setElementoTabuleiroDetalhe(i - 1, j - 1, k - 1, l - 1);
			btn.setText(Character.toString(tab.getLetraJogador()));
			tab.setJogadaLivre(false);
			
			//verifica se houve vitória em determinado minijogo
			if (tab.getElementoTabuleiroSimples(i - 1, j - 1) == 'X' || tab.getElementoTabuleiroSimples(i - 1, j - 1) == 'O') {
				JOptionPane.showMessageDialog(null, "Vitória do jogador " + tab.getLetraJogador() + " na posição " + i + "x" + j + "!", "Pequena Vitória, Grandes Passos", JOptionPane.PLAIN_MESSAGE);
				panel1.setVisible(false);
				lbl.setText(Character.toString(tab.getLetraJogador()));
			} else if (tab.empate(tab.getTabuleiroEspecifico(i - 1, j - 1))) {
				JOptionPane.showMessageDialog(null, "Empate na posição " + i + "x" + j + "!", "Um Ótimo Jogo", JOptionPane.PLAIN_MESSAGE);
			}
				
			//verifica se houve vitória, empate, ou se o jogo continua
			if (tab.ganhou(tab.getTabuleiroSimples(), tab.getLetraJogador())) {
				JOptionPane.showMessageDialog(null, "Vitória do jogador " + tab.getLetraJogador() + "! PARABÉNS!", "Vitória Merecida", JOptionPane.PLAIN_MESSAGE);
				System.exit(0);
			} else if (tab.empate(tab.getTabuleiroSimples())) {
				JOptionPane.showMessageDialog(null, "Aconteceu um empate! Parabéns aos competidores", "Um Ótimo Jogo", JOptionPane.PLAIN_MESSAGE);
				System.exit(0);
			} else {
				tab.trocaLetra();
				panel1.setBackground(cor);
				if (tab.getElementoTabuleiroSimples(k - 1, l - 1) == '-') {
					panel2.setBackground(Color.GREEN);
				} else {
					JOptionPane.showMessageDialog(null, "O jogo na posição " + k + "x" + l + "já acabou! Você pode escolher outro jogo!", "Escolha um Jogo", JOptionPane.PLAIN_MESSAGE);
					tab.setJogadaLivre(true);
				}
			}
		}
	}
}
