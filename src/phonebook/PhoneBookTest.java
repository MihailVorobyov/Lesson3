package phonebook;

public class PhoneBookTest {
	public static void main(String[] args) {
		test();
	}

	private static void test() {
		PhoneBook book = new PhoneBook();

		book.add("Иванов", "84951234567");
		book.add("Фёдоров", "89159151617");
		book.add("Архипова", "+7(999)555-55-55");
		book.add("Петрова", "+74968555666");
		book.add("Бирюков", "84887889898");
		book.add("Иванов", "+79876543210");
		book.add("Белый", "8 (456) 123-45-67");

		String found = "иванов";
		System.out.println(book.get(found));
	}
}
