import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		//List = Interface
		//ArrayList = implementa a list (Classe da object)
		//LinkedList = outra classe que implementa a list
		
/*		List lista = new ArrayList(); //Instanciar uma lista
		
		lista.add("abc"); //Como a list vem da object, o polimorfismo dela permite colocar v�rios valores de difentes tipos
		lista.add(12);
		lista.add(true);
*/		
		//Aqui  o for foi usado para interagir com a lista e permitir que a vari�vel x mostrasse os valores da lista (Intera��o mais trabalhosa)
/*		for(int x=0;x<lista.size();x++) {
		System.out.println(lista.get(x));
		
		}
*/		
/*
		//Enhanced for facilita o c�digo, pois automaticamente interage com a lista (Intera��o mais simples)
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
*/	
		//No remove pode-se utilizar tanto o index como o objeto
		//Ao contr�rio do array, aqui quando voc� exclui um item ele n�o mostra nulo, mas remove completamente, pois utiliza o m�todo lista e n�o direto o objeto
/*		lista.remove(0);
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		//O add empurra a valor que est� na posi��o 0
		lista.add(0, "hue");
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
*/	
/*		
		lista.remove(0);
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		//Set substitui o que estava na posi��o 0
		lista.set(0, "hue");
		for(Object valor: lista) {
			System.out.println(valor);
		}
		System.out.println();
		
		//O comando clear limpa os valores da lista
		lista.clear();
		if(lista.isEmpty()) {
			System.out.println("Sua lista est� vazia");
		}
*/
		Conta conta1 = new Conta("�gua",60.00);
		Conta conta2 = new Conta("Luz",120.00);
		
		List<Conta>listaContas = new ArrayList<Conta>();
		listaContas.add(conta1);
		listaContas.add(conta2);
		
		for(Conta conta:listaContas) {
			System.out.println(conta);
		}
	}

}
