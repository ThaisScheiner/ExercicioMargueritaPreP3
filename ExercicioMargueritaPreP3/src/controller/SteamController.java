package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SteamController 
{
	private static final String ARQ_STEAM = "C:\\Windows\\Temp\\marg.json";
	
	public void buscarInstrucaoItaliano(String strInstructionsIT)throws IOException
	{
		File arq = new File(ARQ_STEAM);
		
		if(arq.exists() && arq.isFile())
		{
			FileInputStream fis = new FileInputStream(arq);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			String linha = br.readLine();
			linha = br.readLine();
			
			while(linha != null)
			{
				String[] vetLinha = linha.split(",");
				String[] vetLinha2 = linha.split("strInstructionsIT");
				
				
				if(!(strInstructionsIT == null))
				{
					System.out.println(vetLinha[5]);
					System.out.println(vetLinha2[5]);
				}
				linha = br.readLine();
			}
			br.close();
			isr.close();
			fis.close();			
		}
		
		else
		{
			throw new IOException("Arquivo nao encontrado");
		}
	}
	
	public void gerarArquivo(String strInstructionsIT)throws IOException
	{
		File arq = new File(ARQ_STEAM);
		
		if(arq.exists() && arq.isFile())
		{
			StringBuffer sb = arquivoParaBuffer(strInstructionsIT);
		
		
		File dir = new File(strInstructionsIT);
		if(dir.exists() && dir.isDirectory())
		{
			File newArq = new File(dir, ARQ_STEAM);
			if(!newArq.exists())
			{
				bufferParaArquivo(sb, newArq);
			}
			else 
			{
				throw new IOException("Arquivo ja existente");
			}
			
		}else
		{
			throw new IOException("Diretorio de destino nao encontrado");
		}
		}else 
			throw new IOException("Arquivo nao encontrado");
	}
	
	private StringBuffer arquivoParaBuffer(String strInstructionsIT)throws IOException
	{
		StringBuffer sb = new StringBuffer();
		FileInputStream fis = new FileInputStream(ARQ_STEAM);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String linha = br.readLine();
		linha = br.readLine();
		
		while(linha != null)
		{
			
			String[] vetLinha = linha.split(",");
			String[] vetLinha2 = linha.split("strInstructionsIT");
			
			if(!(strInstructionsIT == null)) {
				sb.append(vetLinha[5]);
				sb.append(vetLinha2[5]);
			}
			linha = br.readLine();
				
		}
		br.close();
		isr.close();
		fis.close();
		return sb;
		
	}
	
	private void bufferParaArquivo(StringBuffer sb, File newArq)throws IOException
	{
		FileWriter fw = new FileWriter(newArq, false);
		PrintWriter pw = new PrintWriter(fw);
		pw.write(sb.toString());
		pw.flush();
		pw.close();
		fw.close();
	}
	
	
}