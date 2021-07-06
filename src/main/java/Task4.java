import static java.lang.String.format;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Task4 {
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();

			driver.get("https://www.epam.com/about/who-we-are/contact");

			String url = driver.getCurrentUrl();
			System.out.println(url);

			String address = driver.findElement(By.xpath("//b/span[@class='source-sans']")).getText();
			List<String> addressSplit = Arrays.asList(address.split("•"));

			String streetNameAndNumber = addressSplit.get(0);
			String streetNumber = StringAndRegexActions.getValueByRegex(streetNameAndNumber, "(\\d*)([\\w ]+)", 1);
			String streetName = StringAndRegexActions.getValueByRegex(streetNameAndNumber, "(\\d*)([\\w ]+)", 2).trim();

			String officeTownStatePostalCode = addressSplit.get(1);
			String office = StringAndRegexActions.getValueByRegex(officeTownStatePostalCode, "\\d+", 0);
			String town = officeTownStatePostalCode.split(",")[1].trim();
			String state = StringAndRegexActions.getValueByRegex(officeTownStatePostalCode.split
					(",")[2], "([A-Z]{2})(\\s\\d{5})", 1);
			String postalCode = StringAndRegexActions.getValueByRegex(officeTownStatePostalCode.split
					(",")[2], "([A-Z]{2})(\\s\\d{5})".trim(), 2);

			String country = addressSplit.get(2).trim();

			System.out.println(format("Street number is %s", streetNumber));
			System.out.println(format("Street name is %s", streetName));
			System.out.println(format("Office number is %s", office));
			System.out.println(format("Town name is %s", town));
			System.out.println(format("State is %s", state));
			System.out.println(format("Postal code is %s", postalCode));
			System.out.println(format("Country is %s", country));

			driver.quit();
		}
	}
