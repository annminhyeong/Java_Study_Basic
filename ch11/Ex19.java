package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ex19 {
	public static void main(String[] args) {
		String[] data = {"A","K","A","K","D","K","A","K","K","K","Z","D"};
		HashMap map = new HashMap();
		
		for(String str : data) {
			if(map.containsKey(str)) {
				int value = (int)map.get(str);
				map.put(str, value+1);
			}else {
				map.put(str, 1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Entry) it.next();
			int value = (int) entry.getValue();
			System.out.println(entry.getKey()+":"+printBar('#',value)+" "+value);
		}
	}

	public static String printBar(char c, int value) {
		String str = "";
		for(int i=0; i<value; i++) {
			str += c;
		}
		return str;
	}
}
