package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
	
	public static void main(String[]args) {
		
		String path = "C:\\temp\\in.txt";
		BufferedReader br = null;
		FileReader fr = null;
		Map<String, Integer> person = new LinkedHashMap<>();
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			
			String line = br.readLine();
			
			while(line!=null) {
				
			String[]fields = line.split(",");
			String name = fields[0];
			int voto = Integer.parseInt(fields[1]);
			line = br.readLine();
			person.put(name, voto);
			
			System.out.println(person);
			
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
	}

}
