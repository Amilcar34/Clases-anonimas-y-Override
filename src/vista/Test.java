package vista;

import modelo.Empleado;
import modelo.Persona;

public class Test {

	public static void main(String[] args) {

		Persona p1 = new Persona();
		System.out.println(p1.toString());
		p1.imprime();
		
		
		Persona p2 = new Empleado();
		System.out.println(p2.toString());
		p2.imprime();
		
		Empleado e1 = new Empleado();
		System.out.println(e1.toString());
		e1.imprime();
		
		Persona p3 = new Empleado(){

			@Override
			public String toString(){
				return " clase anonima ";
			}
		};
		System.out.println(p3.toString());
		p3.imprime();
		
	}
}
