package modelo;

public class Persona implements IPersona{
	
	
	//La clase Object ya tiene su metodo toString asique lo estamos reescribiendo y poreso ponemos @Override
	@Override
	public String toString() {
		return "clase padre (Persona): ";
	}

	public void imprime(){
		System.out.println("CLASE PERSONA");
		System.out.println();
	}
}
