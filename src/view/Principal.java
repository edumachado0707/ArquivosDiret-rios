package view;

import java.io.IOException;

import controller.ArquivosController;
import controller.IArquivosController;

public class Principal {

	public static void main(String[] args) {
	

		IArquivosController arqCont = new ArquivosController();
		String dirWin = "C: \\Windows";
		String path = "C:\\TEMP\\WinSat";
		String nome = "teste.csv";
		
		try {
			arqCont.readDir(dirWin);
			arqCont.createfile(path, nome);
			arqCont.readFile(path, nome);
			arqCont.openfile(path, nome);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
