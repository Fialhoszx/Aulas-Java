
public class Retangulo implements AreaCalculavel{
	double x;
	double y;
	
	@Override
	public double calcularArea() {
		return x*y;
	}

	public void mostrarArea() {
		System.out.println("A �rea do Ret�ngulo � " + calcularArea() + " m2");
	}

}
