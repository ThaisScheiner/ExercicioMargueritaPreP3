package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
		IArquivosController arqCont = new ArquivosController();
		try {

			arqCont.abreArquivo("C:\\TEMP", "marg.json");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}