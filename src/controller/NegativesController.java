package controller;

public class NegativesController {
	
	public NegativesController() {
		super();
	}
	
	public int negatives(int array[], int size) {
//		Quando 'size' < 0, significa que ja foi percorrido todo o vetor
		if(size < 0) {
			return 0;
		}
//		Se o valor da posicao atual for positivo, nao sera somado uma unidade a chamada do metodo
		if(array[size] >= 0) {
			return negatives(array, size - 1);
		} else {
//		Se o valor da posicao atual for negativo, sera somada uma unidade a chamada do metodo
			return 1 + negatives(array, size - 1);
		}
	}
}
