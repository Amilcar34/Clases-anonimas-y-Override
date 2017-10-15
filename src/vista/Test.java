package vista;

import modelo.Empleado;
import modelo.Persona;

public class Test {

	public static void main(String[] args) {

		/*
		Proyecto con el fin de mostrar el comportamiento de clases anonimas y el uso de Override
		hay dos clases en modelo Persona y Empleado, la clase Persona hereda de la clase Empelado
		hay 4 objetos:
		3 del tipo persona y 1 del tipo Empleado para analizar el comportamiento de metodos que tienen
		*/
		
		
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
