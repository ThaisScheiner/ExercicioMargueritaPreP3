package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosController implements IArquivosController {

	@Override
	public void abreArquivo(String path, String name) throws IOException {
		File arq = new File(path, name);
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leFluxo = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leFluxo);
			String linha = buffer.readLine();
			while (linha != null) {
				
				System.out.println("===============================");
				
				String[] vetLinha = linha.split("strInstructions");
				System.out.println(vetLinha[5]);
				
				System.out.println("===============================");
				
				System.out.println(vetLinha[12]);
				
				System.out.println("===============================");
				
				System.out.println(vetLinha[19]);
				
				System.out.println("===============================");
				
				System.out.println(vetLinha[26]);
				
				System.out.println("===============================");
				
				System.out.println(vetLinha[33]);
				
				System.out.println("===============================");
				
				System.out.println(vetLinha[40]);
				
				System.out.println("===============================");
				
				linha = buffer.readLine();
			}
			buffer.close();
			leFluxo.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo inválido");
		}
	}
}