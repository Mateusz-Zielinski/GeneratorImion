package utils;

import org.apache.commons.text.RandomStringGenerator;

public class StringGenerator4 {

    public static String generateFirstName() {

        int firstNameLength = 8;
        return generateData(firstNameLength);

    }

    public static String generateLastName() {

        int lastNameLength = 14;
        return generateData(lastNameLength);

    }

    private static String generateData(int length) {
        RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('a', 'z').build();
        return generator.generate(length);
    }

}
