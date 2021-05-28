package controller;

import java.io.IOException;

public interface IArquivosController {

	 public void readDir(String path) throws IOException; 
	 public void createfile(String path, String nome) throws IOException;
	 public void readfile(String path, String nome) throws IOException;
	 public void openfile(String path, String nome) throws IOException;
	 
	  
}
