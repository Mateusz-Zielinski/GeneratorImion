package utils;

import org.apache.commons.text.RandomStringGenerator;

public class StringGenerator1 {

    public void generateFirstAndLastNameAndDisplay() {

    int firstNameLength = 8;
    int lastNameLength = 14;

    RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('a', 'z').build();
    String firstName = generator.generate(firstNameLength);
    String lastName = generator.generate(lastNameLength);

        System.out.println("1. " + firstName + " " + lastName);

    }
}
