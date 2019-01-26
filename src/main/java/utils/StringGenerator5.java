package utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.text.RandomStringGenerator;

public class StringGenerator5 {
    public String generateFirstName() {

        int firstNameLength = 8;
        return generateData(firstNameLength);

    }

    public String generateLastName() {

        int lastNameLength = 14;
        return generateData(lastNameLength);

    }

    private String generateData(int length) {
        RandomStringGenerator generator = new RandomStringGenerator.Builder().withinRange('a', 'z').build();
        String data = generator.generate(length);
        return StringUtils.capitalize(data);

    }

}
