public class Task2 {
	public static void main(String[] args) {

		String emailPattern = "[A-Za-z0-9.\\-_]{3,25}@[A-Za-z]{3,5}\\.[A-Za-z]{3,}";
		String ipAddressPattern = "\\d{3}\\.\\d{3}\\.\\d{1,3}\\.\\d{1,3}";
		String bankCardPattern = "(\\d{16}|\\d{4}\\s\\d{4}\\s\\d{4}\\s\\d{4})";

		System.out.println("Is value matching a regular expression? - " + StringAndRegexActions.matchStringByRegex
				("Alevtina_Bakai@epam.com", emailPattern));
		System.out.println("Is value matching a regular expression? - " + StringAndRegexActions.matchStringByRegex
				("Alevtina Bakai@epam.com", emailPattern));
		System.out.println("Is value matching a regular expression? - " + StringAndRegexActions.matchStringByRegex
				("Email.Address_198-@gmail.com", emailPattern));

		System.out.println("Is value matching a regular expression? - " + StringAndRegexActions.matchStringByRegex
				("309.567.43.9", ipAddressPattern));
		System.out.println("Is value matching a regular expression? - " + StringAndRegexActions.matchStringByRegex
				("5095.444.444.444", ipAddressPattern));
		System.out.println("Is value matching a regular expression? - " + StringAndRegexActions.matchStringByRegex
				("509.444.444.444", ipAddressPattern));

		System.out.println("Is value matching a regular expression? - " + StringAndRegexActions.matchStringByRegex
				("0987654321098765", bankCardPattern));
		System.out.println("Is value matching a regular expression? - " + StringAndRegexActions.matchStringByRegex
				("4444 5555 4444 6666", bankCardPattern));
		System.out.println("Is value matching a regular expression? - " + StringAndRegexActions.matchStringByRegex
				("4444 5555 4444 66667", bankCardPattern));
	}
}
