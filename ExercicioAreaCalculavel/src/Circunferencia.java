
public class Circunferencia implements AreaCalculavel{
	double r;
	
	@Override
	public double calcularArea() {
		return r*r*Math.PI;
	}

	public void mostrarArea() {
		System.out.println("A �rea da Cinfurer�ncia � " + calcularArea() + " m2");
	}

}
