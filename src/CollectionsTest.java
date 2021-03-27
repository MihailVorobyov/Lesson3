import java.util.*;

public class CollectionsTest {
	public static void main(String[] args) {
		go();
	}

	private static void go() {
		// 1
		// Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
		String[] words = {"Аппаратура", "Безалаберный", "Волнообразный", "Воспалиться", "Газоубежище", "Королек",
				"Крыша", "Рогастый", "Тукать", "Тщедушный", "Аппаратура", "Безалаберный", "Рогастый", "Газоубежище",
				"Тщедушный", "Газоубежище"};

		// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
		Map<String, Integer> map = new HashMap<>();

		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		System.out.println(map.keySet());

		// Посчитать сколько раз встречается каждое слово.
		System.out.println(map);

		// 2
		PhoneBook book = new PhoneBook();

		book.add("Иванов", "84951234567");
		book.add("Фёдоров", "89159151617");
		book.add("Архипова", "+7(999)555-55-55");
		book.add("Петрова", "+74968555666");
		book.add("Бирюков", "84887889898");
		book.add("Иванов", "+79876543210");
		book.add("Белый", "8 (456) 123-45-67");

		book.get("Иванов");
		book.get("Фёдоров");
		book.get("Филиппов");
	}

}

