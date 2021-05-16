package capg.lab6;


import java.util.HashMap;
import java.util.Map;

public class Ex4Scholarship {

	public static void main(String[] args) {
Map<Integer,Integer> marks = new HashMap<>();
		
		marks.put(201, 90);
		marks.put(202, 81);
		marks.put(203, 75);
		marks.put(204, 67);
		marks.put(205, 65);
		marks.put(206, 53);
		marks.put(207, 77);
		marks.put(208, 95);
		marks.put(209, 84);
		marks.put(210, 34);
		
		Map<Integer,String> stumedal = getStudents(marks);
		
		System.out.println(stumedal);
	}
	
	static Map<Integer,String>getStudents(Map<Integer,Integer> stud)
	{   
		Map<Integer,String> medal = new HashMap<>();
		
		for(Map.Entry<Integer,Integer> entry: stud.entrySet())
		{
			if(entry.getValue()>90)
			{
				medal.put(entry.getKey(), "Gold");
			}
			else if(entry.getValue()>=80 && entry.getValue()<90)
			{
				medal.put(entry.getKey(), "Silver");
			}
			else if(entry.getValue()>=70 && entry.getValue()<80)
			{
				medal.put(entry.getKey(), "Bronze");
			}
		}
		
		return medal;

	}

}
