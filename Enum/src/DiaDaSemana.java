// Serve para criar uma lista
public enum DiaDaSemana {
	// lista de dias da semana = inteiro 
	DOMINGO(1),
	SEGUNDA(2),
	TERCA(3),
	QUARTA(4),
	QUINTA(5),
	SEXTA(6),
	SABADO(7);


	private int num;
	//getNum retorna num 
	public int getNum() {
		return num;
	}
	
	//construtor privado 
	private DiaDaSemana(int num) {
		this.num = num;
	}
	
}
