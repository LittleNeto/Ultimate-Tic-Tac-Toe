package forms;

public class Tabuleiro {
	private char[][] tabuleiro_simples = new char[3][3];
	private char[][][][] tabuleiro_detalhe = new char[3][3][3][3];
	private char letra_jogador;
	private boolean jogada_livre;
	
	public Tabuleiro() {
		this.tabuleiro_simples = preencheSimples(this.tabuleiro_simples);
		this.tabuleiro_detalhe = preencheDetalhe(this.tabuleiro_detalhe);
		this.letra_jogador = Math.round(Math.random()) == 0 ? 'O' : 'X';
		this.jogada_livre = true;
	}
	
	//getters
	public char[][] getTabuleiroSimples() {
		return this.tabuleiro_simples;
	}
	
	public char[][][][] getTabuleiroDetalhe() {
		return this.tabuleiro_detalhe;
	}
	
	public char getLetraJogador() {
		return this.letra_jogador;
	}
	
	public boolean getJogadaLivre() {
		return this.jogada_livre;
	}
	
	public char getElementoTabuleiroSimples(int i, int j) {
		return this.tabuleiro_simples[i][j];
	}
	
	public char getElementoTabuleiroDetalhe(int i, int j, int k, int l) {
		return this.tabuleiro_detalhe[i][j][k][l];
	}
	
	public char[][] getTabuleiroEspecifico(int i, int j) {
		return this.tabuleiro_detalhe[i][j];
	}
	
	//setters
	public void setTabuleiroSimples(char[][] tabuleiro) {
		this.tabuleiro_simples = tabuleiro;
	}
	
	public void setTabuleiroDetalhe(char[][][][] tabuleiro) {
		this.tabuleiro_detalhe = tabuleiro;
	}
	
	public void setLetraJogador(char letra) {
		this.letra_jogador = letra;
	}
	
	public void setJogadaLivre(boolean validador) {
		this.jogada_livre = validador;
	}
	
	public void setElementoTabuleiroSimples(char letra, int i, int j) {
		this.tabuleiro_simples[i][j] = letra;
	}
	
	public void setElementoTabuleiroDetalhe(int i, int j, int k, int l) {
		this.tabuleiro_detalhe[i][j][k][l] = this.getLetraJogador();
		if (this.ganhou(this.getTabuleiroEspecifico(i, j), this.getLetraJogador())) {
			this.setElementoTabuleiroSimples(this.getLetraJogador(), i, j);
		} else if (this.empate(this.getTabuleiroEspecifico(i, j))) {
			this.setElementoTabuleiroSimples('E', i, j);
		}
	}
	
	//funções específicas da classe
	public char[][] preencheSimples(char[][] tabuleiro) {
		int i, j;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				tabuleiro[i][j] = '-';
			}
		}
		return tabuleiro;
	}
	
	public char[][][][] preencheDetalhe(char[][][][] tabuleiro) {
		int i, j, k, l;
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				for (k = 0; k < 3; k++) {
					for (l = 0; l < 3; l++) {
						tabuleiro[i][j][k][l] = '-';
					}
				}
			}
		} return tabuleiro;
	}
	
	public boolean ganhou(char[][] tabuleiro, char jogador) {
        int i;
        for (i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }
    
        for (i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == jogador && tabuleiro[1][i] == jogador && tabuleiro[2][i] == jogador) {
                return true;
            }
        }

        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }

        return false;
    }
	
	public boolean empate(char[][] tabuleiro) {
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') return false;
            }
        }
        return true;
    }
	
	public void trocaLetra() {
		if (this.getLetraJogador() == 'X') this.setLetraJogador('O');
		else this.setLetraJogador('X');
	}
}