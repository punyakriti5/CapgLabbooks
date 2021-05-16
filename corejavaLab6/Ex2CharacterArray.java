package capg.lab6;


import java.util.HashMap;
import java.util.Map;

public class Ex2CharacterArray {

	public static void main(String[] args) {
		char[] arr = { 'a','b','c','d','a','b','c','d','a','b'};

		Map<Character,Integer> charcount = countChars(arr);
		
		System.out.println(charcount);
	}

	
	static Map<Character,Integer> countChars(char[] arr)
	{
		Map<Character,Integer> mapchar = new HashMap<>();
		
		for(int i = 0;i< arr.length;i++)
		{
			if(mapchar.containsKey(arr[i]))
			{
				mapchar.put(arr[i], mapchar.get(arr[i]) + 1);
			}
			else
			{
				mapchar.put(arr[i], 1);
			}
		}
		
		return mapchar;
	}

}
