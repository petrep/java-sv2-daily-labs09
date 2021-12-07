package day02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class StringListsTest {

	@Test
	void shortestWordsTest() {
		StringLists sl = new StringLists();
		List<String> words = Arrays.asList(new String[] {"alma", "az", "körte", "fa", "ég"});

		List<String> shortWordList = sl.shortestWords(words);
//		System.out.println(shortWordList.toString());

		List<String> expectedWordList = Arrays.asList("az", "fa", "ég");
		Assertions.assertArrayEquals(expectedWordList.toArray(), shortWordList.toArray());
	}
}