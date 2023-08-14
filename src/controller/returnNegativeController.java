package controller;

public class returnNegativeController {

	public returnNegativeController() {
		super();
	}
	public int retornaNegativos(int vetInteiros[],int indice, int negativos ) { //recebe o vetor, o tamanho do vetor para servir de índice e o número de negativos incial
		//A condiçao de parada é dada quando o índice do vetor é menor que 0, ou seja, não há mais o que ser verificado
		if (indice<0) {
			return negativos; //retorna a quantidade de números negativos encontrados no vetor
			
		}else if (vetInteiros[indice]<0) {//Se o valor do vetor que está sendo comparado é negativo
			negativos ++;	//Adiciona +1 em 'negativos'
		}
		negativos = retornaNegativos(vetInteiros, indice-1, negativos); //Chama a funçao novamente e atribui a quantidade de números negativos encontrados dos próximos índeces verificados 
		return negativos;
	}
}
