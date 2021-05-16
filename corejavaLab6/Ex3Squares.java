package capg.lab6;



import java.util.HashMap;
import java.util.Map;

public class Ex3Squares {

	public static void main(String[] args) {
		int[] Array = {1,2,3,4,5};

		Map<Integer,Integer> numSquares = getSquares(Array);
		
		System.out.println(numSquares);
	}

	
	static Map<Integer,Integer> getSquares(int[] Array)
	{
		Map<Integer,Integer> mapSquares = new HashMap<>();
		
		for(int i = 0;i< Array.length;i++)
		{
			mapSquares.put(Array[i], Array[i]*Array[i]);
		}
		
		return mapSquares;

	}

}
