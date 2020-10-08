package br.com.assemblyline.application;

import br.com.assemblyline.controller.LineController;

/**
 * @author Keetener Rodrigo
 *
 */
public class Application {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new LineController().readInput();
	}
}
