package logica;

import javax.swing.JOptionPane;

import interfaz.*;

public class Selector {
	private int tipoVista;
	
	public Selector(){
		tipoVista=Integer.parseInt(JOptionPane.showInputDialog("Ingrese que tipo de vista desea:"));
		switch(tipoVista){
			case 1:
				new VistaConsola();
				break;
			case 2:
				new VistaJOption();
				break;
			case 3:
				new VistaVentana();
				break;
		}
		while(tipoVista!=4);
	}

}
