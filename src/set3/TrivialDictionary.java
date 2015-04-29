package set1;

import java.util.Enumeration;
import java.util.Hashtable;

public class TrivialDictionary {
	
	private Hashtable<String, String> dict;
	
	public TrivialDictionary(){
		dict = new Hashtable<String, String>();
		
	}
	
	public boolean isInDictionary(String word){
		if(dict.contains(word)){
			return true;
		}else{
			return false;
		}
	}
	
	public String wordAt(int index){
		if(index > dict.size() - 1 || index < 0){
			return null;
			}else{
				Enumeration<String> dictKeys = dict.keys();
				int counter = 0;
				String key = dictKeys.nextElement();
				while(counter < index){
					key = dictKeys.nextElement();
					counter += 1;
				}
				return dict.get(key);
				}
		}
	
	public static void main(String[] args) {
		TrivialDictionary test1 = new TrivialDictionary();
		test1.dict.put("a", "one");
		test1.dict.put("b", "two");
		test1.dict.put("c", "three");
		test1.dict.put("d", "four");
		System.out.println(test1.isInDictionary("two"));
		System.out.println(test1.isInDictionary("five"));
		System.out.println(test1.wordAt(2));
	}
}
