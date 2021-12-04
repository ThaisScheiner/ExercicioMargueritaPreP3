package view;

import controller.SteamController;

public class Principal
{
	public static void main(String[] args)
	{
		SteamController sc = new SteamController();
		
	//	String strInstructionsIT = "strInstructionsIT";
		String arquivo = "marg.json";
		String diretorio = "C:\\TEMP";
		
		try 
		{
			sc.gerarArquivo("C:\\Windows\\Temp");
			sc.buscarInstrucaoItaliano("marg.json");
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
