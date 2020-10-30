package Question4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class Frequence {
public static void main(String[] args) {
		
		Map<String, Integer> hMap = new HashMap<String, Integer>();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("story.txt"));
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		
		String line = null;
		try {
			while((line = br.readLine()) != null) {
				String[] tokens = line.split(" ");
				for(String token: tokens) {
					if(hMap.containsKey(token)) {
						int value = hMap.get(token);
						hMap.put(token, ++value);
						
					} else {
						hMap.put(token, 1);
					}
				}
				
			}
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		Set<Entry<String, Integer>> entrySet = hMap.entrySet();
		for(Entry<String, Integer> setItem : entrySet) {
			System.out.println(setItem.getKey() + " appear " + setItem.getValue() + " times ");
		}
	}
}
