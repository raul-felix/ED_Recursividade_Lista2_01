package view;

import controller.MultiplicacaoController;

public class Main {
	
	public static void main(String[] args) {
		
		 MultiplicacaoController multiController = new MultiplicacaoController();
		 
		 int a = 4;
		 int b = 5;
		 
		 int resultado = multiController.multiplicacaoPorSoma(a, b);
		 
		 System.out.println(String.format("%d * %d = %d", a, b, resultado));
	}

}
