package utils;

import org.apache.commons.text.RandomStringGenerator;

public class StringGenerator2 {

    public String generateFirstAndLastName() {

        int firstNameLength = 8;
        int lastNameLength = 14;

        RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('a', 'z').build();
        String firstName = generator.generate(firstNameLength);
        String lastName = generator.generate(lastNameLength);

        return firstName + " " + lastName;

    }

}
