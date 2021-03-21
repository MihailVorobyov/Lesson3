import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CollectionsTest {
	public static void main(String[] args) {
		go();
	}

	private static void go() {
		// Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
		ArrayList<String> alWords = new ArrayList<>();
		alWords.add("Аппаратура");
		alWords.add("Безалаберный");
		alWords.add("Волнообразный");
		alWords.add("Воспалиться");
		alWords.add("Газоубежище");
		alWords.add("Королек");
		alWords.add("Крыша");
		alWords.add("Рогастый");
		alWords.add("Тукать");
		alWords.add("Тщедушный");
		alWords.add("Аппаратура");
		alWords.add("Безалаберный");
		alWords.add("Рогастый");
		alWords.add("Газоубежище");
		alWords.add("Тщедушный");
		alWords.add("Газоубежище");

		// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
		Set<String> hsWords = new HashSet<>(alWords);
		System.out.println(hsWords);

		// Посчитать сколько раз встречается каждое слово.
		int count;
		for (String hs : hsWords) {
			count = 0;
			for (String word : alWords) {
				if (word.equals(hs)) {
					count++;
				}
			}
			System.out.println("Слово \"" + hs + "\" встречается в ArrayList<String> strings " + count + " раз.");
		}
	}
}
