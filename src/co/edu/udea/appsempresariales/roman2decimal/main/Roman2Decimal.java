package co.edu.udea.appsempresariales.roman2decimal.main;

import java.util.HashMap;
import java.util.Map;

public class Roman2Decimal {
	
	private Map<String, Integer> getRomanMap(){
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		return map;
	}

	public int convert(String roman) {
		roman = roman.toUpperCase();
		Map<String, Integer> map = getRomanMap();
		int result = 0;
		int i = 0;
		while (i < roman.length()) {
			int current = map.get(String.valueOf(roman.charAt(i)));
			int next;
			if (i<roman.length()-1){
				next = map.get(String.valueOf(roman.charAt(i+1)));
				if(next>current){
					result += next-current;
					i+=2;
				}else{
					result += current;
					i++;
				}
			}else{
				result += current;
				i++;
			}
		}
		return result;
	}

}
