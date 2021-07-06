import java.util.regex.*;

public class StringAndRegexActions {
	public static boolean matchStringByRegex(String text, String pattern) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		return m.matches();
	}

	public static String getValueByRegex(String text, String pattern, int group) {
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(text);
		m.find();
		return m.group(group);
	}
}