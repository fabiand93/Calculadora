package interfaz;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Panel;

public class tablero extends JFrame{
	
	/**
	 * Fabian Diaz
	 * 
	 */

	private static final long serialVersionUID = 1L;
	JFrame cuadro;
	JTextField entrada, salida;
	Panel panelNorte, panelSur;
	JPanel fondo, text, botones;
	JButton uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero;
	JButton punto, mas, menos, por, sobre, igual, limpiar;
	
	
	public tablero(){
		
		//Inicia la ventana
		JFrame cuadro = new JFrame("Tablero");
	    cuadro.setSize(450,300);
		cuadro.setVisible(true);
		cuadro.setResizable(false);
		cuadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		cuadro.getContentPane().setLayout(new BorderLayout(4, 4));
			
			JPanel texto = new JPanel();
			texto.setBounds(0, 0, 450, 124);
			getContentPane().add(texto);
			texto.setLayout(null);
		
				entrada = new JTextField();
				entrada.setHorizontalAlignment(SwingConstants.CENTER);
				entrada.setBackground(Color.LIGHT_GRAY);
				entrada.setBounds(0, 25, 450, 35);
				texto.add(entrada);
				entrada.setColumns(10);
			
				salida = new JTextField();
				salida.setHorizontalAlignment(SwingConstants.CENTER);
				salida.setBounds(0, 65, 450, 35);
				texto.add(salida);
				salida.setBackground(Color.LIGHT_GRAY);
				salida.setColumns(10);
		
			JPanel botones = new JPanel();
			botones.setBounds(0, 136, 450, 142);
			getContentPane().add(botones);
			botones.setLayout(null);
			
				JButton uno = new JButton("1");
				uno.setBounds(83, 47, 58, 29);
				botones.add(uno);
				
				JButton dos = new JButton("2");
				dos.setBounds(143, 47, 58, 29);
				botones.add(dos);
				
				JButton tres = new JButton("3");
				tres.setBounds(202, 47, 58, 29);
				botones.add(tres);
				
				JButton cuatro = new JButton("4");
				cuatro.setBounds(260, 47, 58, 29);
				botones.add(cuatro);
				
				JButton cinco = new JButton("5");
				cinco.setBounds(318, 47, 58, 29);
				botones.add(cinco);
				
				JButton seis = new JButton("6");
				seis.setBounds(83, 88, 58, 29);
				botones.add(seis);
				
				JButton siete = new JButton("7");
				siete.setBounds(143, 88, 58, 29);
				botones.add(siete);
				
				JButton ocho = new JButton("8");
				ocho.setBounds(202, 88, 58, 29);
				botones.add(ocho);
				
				JButton nueve = new JButton("9");
				nueve.setBounds(260, 88, 58, 29);
				botones.add(nueve);
				
				JButton cero = new JButton("0");
				cero.setBounds(318, 88, 58, 29);
				botones.add(cero);
				
				JButton del = new JButton("C");
				del.setBounds(83, 6, 58, 29);
				botones.add(del);
				
				JButton mas = new JButton("+");
				mas.setBounds(143, 6, 58, 29);
				botones.add(mas);
				
				JButton menos = new JButton("-");
				menos.setBounds(202, 6, 58, 29);
				botones.add(menos);
				
				JButton por = new JButton("*");
				por.setBounds(260, 6, 58, 29);
				botones.add(por);
				
				JButton sobre = new JButton("/");
				sobre.setBounds(318, 6, 58, 29);
				botones.add(sobre);
		
		
	}	
}
