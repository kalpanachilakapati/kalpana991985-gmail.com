import java.util.Arrays;
import java.util.List;

public class ArrayToList {
	public static void main(String[] args) {
		String[] alphabets= {"a","b","c","d","e","f","g"};
		List<String> alphabetList=Arrays.asList(alphabets);
		System.out.println(alphabetList);
	}
}
