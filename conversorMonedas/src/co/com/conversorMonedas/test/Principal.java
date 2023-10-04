package co.com.conversorMonedas.test;


import javax.swing.JOptionPane;

import co.com.conversorMonedas.modelo.Function;

public class Principal {

	public static void main(String[] args) {
		 Function monedas = new Function();
	             
	        while(true) {
	        	
	        	String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda"}, "Seleccion")).toString();
	        	
	        	switch(opciones) {
	        	case "Conversor de Moneda":
	        		 String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
	                 if(validarNumero(input) == true) {
	                     double Minput = Double.parseDouble(input);
	                     monedas.ConvertirMonedas(Minput);

	                     int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
	                     if (JOptionPane.OK_OPTION == respuesta){
	                     	System.out.println("Selecciona opción Afirmativa");
	                     }else{
	                        	JOptionPane.showMessageDialog(null, "Programa terminado");                         
	                     }

	                    } else {
	                        JOptionPane.showMessageDialog(null, "Valor inválido");                
	                    }
	                     	break;
	        	}
	        }
	}

	private static boolean validarNumero(String input) {
		// TODO Auto-generated method stub
		return false;
	}

}
