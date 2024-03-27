package hapi.fhir.client.utils;

import java.time.LocalDate;
import java.util.Random;

public class RandomGenerator {
	private static final String[] FIRST_NAMES = { "Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Thomas",
			"Florian", "Lexi", "Alice", "Eva" };
	private static final String[] LAST_NAMES = { "Smith", "Johnson", "Brown", "Davis", "Miller", "Redmann", "Wagner",
			"Lillier" };
	private static final String[] STREET_NAMES = { "Hauptstraße", "Bahnhofstraße", "Berliner Straße", "Goethestraße",
			"Mozartstraße" };
	private static final String[] STREET_TYPES = { "Straße", "Allee", "Weg", "Platz", "Gasse" };
	private static final String[] CITIES = { "Berlin", "Munich", "Hamburg", "Frankfurt", "Cologne" };
	private static final String COUNTRY = "Germany";

	private static final String[] IMAGES = { "person1.jpeg", "person2.jpeg", "person3.jpeg", "person4.jpeg",
			"person5.jpeg", "person6.jpeg", "person7.jpeg", "person8.jpeg", "person9.jpeg", "person10.jpeg" };

	private RandomGenerator() {
	}

	public static String[] generateRandomName() {
		Random random = new Random();
		String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
		String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
		String[] randomName = { firstName, lastName };
		return randomName;
	}

	public static String generateRandomEmail() {
		Random random = new Random();

		String[] domains = { "gmail.com", "yahoo.com", "hotmail.com", "outlook.com", "example.com" };

		// Generate a random username (8 characters)
		String username = generateRandomString(8);

		// Select a random domain from the available options
		String domain = domains[random.nextInt(domains.length)];

		// Concatenate the username, '@', and domain to form the email address
		return username + "@" + domain;
	}

	private static String generateRandomString(int length) {
		String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder stringBuilder = new StringBuilder();
		Random random = new Random();

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(characters.length());
			char randomChar = characters.charAt(randomIndex);
			stringBuilder.append(randomChar);
		}

		return stringBuilder.toString();
	}

	public static String generateRandomID() {
		Random random = new Random();
		// Generate a random letter (uppercase)
		char letter = (char) (random.nextInt(26) + 'A');
		// Generate random numbers (9 digits)
		String numbers = String.format("%09d", random.nextInt(1000000000));
		// Concatenate the letter and numbers to form the ID
		return letter + numbers;
	}

	public static String generateRandomPhoneNumber() {
		Random random = new Random();

		int areaCode = random.nextInt(900) + 100; // Generates a random 3-digit area code (100-999)
		int firstPart = random.nextInt(900) + 100; // Generates a random 3-digit number (100-999)
		int secondPart = random.nextInt(9000) + 1000; // Generates a random 4-digit number (1000-9999)

		return String.format("%03d-%03d-%04d", areaCode, firstPart, secondPart);
	}

	public static String generateRandomBirthdate() {
		Random random = new Random();

		// Generate a random year between 1900 and 2023
		int year = random.nextInt(124) + 1900;

		// Generate a random month between 1 and 12
		int month = random.nextInt(12) + 1;

		// Generate a random day between 1 and the maximum number of days in the
		// selected month and year
		int day = random.nextInt(getMaxDayOfMonth(year, month)) + 1;

		// Format the date as "yyyy-MM-dd"
		return String.format("%04d-%02d-%02d", year, month, day);
	}

	private static int getMaxDayOfMonth(int year, int month) {
		return LocalDate.of(year, month, 1).lengthOfMonth();
	}

	public static String generateRandomAddress() {
		Random random = new Random();

		// Generate random street number
		int streetNumber = random.nextInt(100) + 1;

		// Randomly select street name and type
		String streetName = STREET_NAMES[random.nextInt(STREET_NAMES.length)];
		String streetType = STREET_TYPES[random.nextInt(STREET_TYPES.length)];

		// Randomly select city
		String city = CITIES[random.nextInt(CITIES.length)];

		// Generate random postal code (5 digits)
		String postalCode = String.format("%05d", random.nextInt(100000));

		// Construct the address string
		String address = streetName + " " + streetNumber + " " + streetType + ", " + postalCode + " " + city + ", "
				+ COUNTRY;

		return address;
	}

	public static String getRandomImage() {
		Random random = new Random();
		return IMAGES[random.nextInt(IMAGES.length)];
	}

}
