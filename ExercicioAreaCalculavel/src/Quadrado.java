
public class Quadrado implements AreaCalculavel{
	// Declarando variaveis
	double x;
	

	@Override
	public double calcularArea() {
		return x *= x;
	}

	// Aqui e um metodo para imprimir a area na tela
	public void mostrarArea() {
		System.out.println("A área do quadrado é " + calcularArea() + " m2");
	}
	
}
