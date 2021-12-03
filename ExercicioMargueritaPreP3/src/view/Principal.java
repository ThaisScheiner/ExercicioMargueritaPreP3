package view;

import controller.SteamController;

public class Principal
{
	public static void main(String[] args)
	{
		SteamController sc = new SteamController();
		
		String strInstructionsIT = null;
		
	
		try 
		{
			sc.buscarInstrucaoItaliano(strInstructionsIT);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
