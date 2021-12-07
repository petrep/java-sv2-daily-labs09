package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {
	public List<String> shortestWords(List<String> words) {
		List<String> wordList = new ArrayList<>();

		int shortestWordCharNumber = words.get(0).length();
		for (String word : words) {
			if (word.length()<shortestWordCharNumber) shortestWordCharNumber = word.length();
		}

		for (String word : words) {
			if (word.length()==shortestWordCharNumber) {
				wordList.add(word);
			}
		}

		return wordList;
	}

}
