package com.adamu.jeu;

import javax.swing.JFrame;

//***** La classe Main gère le flux principal et exécute la méthode main() qui lance l'application *****//
public class Main {
	
	//**** VARIABLES **//
	public static Scene scene;
	
	//**** METHODES **//
	public static void main(String[] args) {
		
		// Création de la fenetre de l'application
		JFrame fenetre = new JFrame("Jeu style Mario");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(700, 360);
		fenetre.setLocationRelativeTo(null);
		fenetre.setResizable(false);
		fenetre.setAlwaysOnTop(true);
		
		// Instanciation de l'objet scene
		scene = new Scene();
				
		fenetre.setContentPane(scene); // On associe la scene à la fenêtre de l'application
		fenetre.setVisible(true);		
	}
}