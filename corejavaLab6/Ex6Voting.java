package capg.lab6;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ex6Voting {

	public static void main(String[] args) throws ParseException {
		Map<Integer,String> map1 = new HashMap<>();
		map1.put(101,"2012/04/29");
		map1.put(102,"2010/12/05");
		map1.put(103,"1992/06/05");
		map1.put(104,"2002/03/27");
		map1.put(105,"2003/05/11");
		
        ArrayList<Integer> eligiblelst = votersList(map1);
        
        
        System.out.println(eligiblelst);
	}

	
	static ArrayList<Integer> votersList(Map<Integer,String> m1) throws ParseException
	{   ArrayList<Integer> eligiblelist = new ArrayList<Integer>();
		for(Map.Entry<Integer,String> entry: m1.entrySet())
		{   
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
			
			LocalDate dob = LocalDate.parse(entry.getValue(),formatter);
			Period period = Period.between(dob, LocalDate.now());
		
			
			if(period.getYears() >= 18)
				eligiblelist.add(entry.getKey());
		}
		
		return eligiblelist;
	}

}
