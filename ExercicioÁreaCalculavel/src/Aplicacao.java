
public class Aplicacao {

	public static void main(String[] args) {
		//colocamos um objeto para cada classe no qual usamos para que o usuário tenha a resposta do que correspondeu 
		Retangulo retangulo = new Retangulo();
		retangulo.x=8;
		retangulo.y=10;
		retangulo.mostrarArea();
		
		Quadrado quadrado = new Quadrado();
		quadrado.x = 5;
		quadrado.mostrarArea();
		
		Circunferencia circunferencia = new Circunferencia();
		circunferencia.r=10;
		circunferencia.mostrarArea();

		
	}

}
