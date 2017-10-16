package modelo;

public interface IPersona {
	
	public String toString();
	
	public default void imprime(){
		System.out.println("ejecutando interface");
	}

	default void metodoInterface(String contendido){
		System.out.println(contendido);
	}
}
