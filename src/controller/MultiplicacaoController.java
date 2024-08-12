package controller;

public class MultiplicacaoController {
	
	public MultiplicacaoController() {
		super();
	}
	
	public int multiplicacaoPorSoma(int a, int b) {
		if (b == 0) {
			return 0;
		} else if (b == 1) {
			return a;
		} else {
			return a + multiplicacaoPorSoma(a, b - 1);
		}
	}

}
