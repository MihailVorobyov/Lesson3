/*
2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 */

import java.util.*;

public class PhoneBook {
	Map<String, Set<String>> map;

	public PhoneBook () {
		 map = new HashMap<>();
	}

	public void add (String lastName, String phoneNumber) {

		if(!map.containsKey(lastName)) {
			map.put(lastName, new HashSet<>());
		}
		map.get(lastName).add(phoneNumber);
	}

	public void get (String lastName) {
		if (map.containsKey(lastName)) {
			System.out.println(lastName + ": " + map.get(lastName));
		} else {
			System.out.println("Not found");
		}

	}
}
