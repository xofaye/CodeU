package set1;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map.Entry;

public class Set3Ex2 {
	
	public static Integer hasMajority(ArrayList input){
		HashMap<Integer, Integer> valueCount = new HashMap<Integer, Integer>();
		for(int i = 0; i < input.size(); i++){
			if(valueCount.containsKey(input.get(i))){
				int count = valueCount.get(input.get(i));
				valueCount.put((Integer) input.get(i), count + 1);
			}else{
				valueCount.put((Integer) input.get(i), 1);
			}
		}
		Entry<Integer, Integer> maxEntry = null;

		for (Entry<Integer, Integer> entry : valueCount.entrySet())
		{
		    if (maxEntry == null || ((Comparable<Integer>) entry.getValue()).compareTo(maxEntry.getValue()) > 0){
		        maxEntry = entry;
		    }
		}
		Integer maxCount = maxEntry.getValue();
		if(maxCount > input.size() / 2){
			return maxEntry.getKey();
		}else{
			return null;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> test1 = new ArrayList<Integer>();
		test1.add(5);
		test1.add(3);
		test1.add(9);
		test1.add(4);
		test1.add(3);
		test1.add(3);
		test1.add(8);
		test1.add(3);
		test1.add(3);
		System.out.println(hasMajority(test1));
		
		ArrayList<Integer> test2 = new ArrayList<Integer>();
		test2.add(5);
		test2.add(3);
		test2.add(9);
		test2.add(4);
		test2.add(3);
		test2.add(3);
		test2.add(8);
		test2.add(3);
		System.out.println(hasMajority(test2));
	}
	

}
