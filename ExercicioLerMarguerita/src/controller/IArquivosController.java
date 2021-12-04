package controller;

import java.io.IOException;

public interface IArquivosController 
{
	public void abreArquivo(String path, String name) throws IOException;

}