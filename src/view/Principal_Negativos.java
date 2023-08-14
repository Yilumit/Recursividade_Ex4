package view;
// Exibe o total de elemntos negativos de um vetor de inteiros

import controller.returnNegativeController;

public class Principal_Negativos {

	public static void main(String[] args) {
		returnNegativeController cFunc = new returnNegativeController();
		int[] vet = {-9, 9, 8, 5, 2, 1, -3, -3, -3, 0};
		int tamanho = vet.length-1;
		System.out.println("Quantidade de núemros negativos no vetor: "+cFunc.retornaNegativos(vet, tamanho, 0));

	}

}
