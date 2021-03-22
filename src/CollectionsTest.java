import java.util.*;

public class CollectionsTest {
	public static void main(String[] args) {
		go();
	}

	private static void go() {
		// Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
		String[] words = {"Аппаратура", "Безалаберный", "Волнообразный", "Воспалиться", "Газоубежище", "Королек",
				"Крыша", "Рогастый", "Тукать", "Тщедушный", "Аппаратура", "Безалаберный", "Рогастый", "Газоубежище",
				"Тщедушный", "Газоубежище"};

		// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
		Map<String, Integer> map = new HashMap<>();

		for (String word : words) {
			map.computeIfPresent(word, (key, val) -> val = val + 1);
			map.putIfAbsent(word, 1);
		}
		System.out.println(map.keySet());

		// Посчитать сколько раз встречается каждое слово.
		System.out.println(map);
	}

}

