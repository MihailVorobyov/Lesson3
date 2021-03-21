package phonebook;
/*
2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PhoneBook {
	private Set<String[]> phoneBook = new HashSet<>(100);

	public void add (String lastName, String phoneNumber) {
		String[] toAdd = {lastName, phoneNumber};
		phoneBook.add(toAdd);
	}

	public ArrayList<String> get (String lastName) {
		ArrayList<String> output = new ArrayList<>();

		for (String[] record: phoneBook) {
			if (lastName.equalsIgnoreCase(record[0])) {
				output.add(record[0] + " : " + record[1]);
			}
		}

		return output;
	}
}
