package GeneratorImionINazwisk;

import org.apache.commons.text.RandomStringGenerator;
import utils.*;


public class App 
{
    public static void main( String[] args )
    {

        // StringGenerator1 - Uruchomienie
        StringGenerator1 gen1 = new StringGenerator1();
        gen1.generateFirstAndLastNameAndDisplay();


        // StringGenerator2 - Uruchomienie ; przypisanie wyniku do zmiennej ; wyswietlenie
        StringGenerator2 gen2 = new StringGenerator2();
        String generator2 = gen2.generateFirstAndLastName();
        System.out.println("2. " + generator2);


        // StringGenerator3
        StringGenerator3 zmiennaFirst = new StringGenerator3();
        String firstName = zmiennaFirst.generateFirstName();

        StringGenerator3 zmiennaLast = new StringGenerator3();
        String lastName = zmiennaLast.generateLastName();

        System.out.println("3. " + firstName + " " + lastName);


        // StringGenerator4 - Static
        String staticFirstName = StringGenerator4.generateFirstName();
        String staticLastName = StringGenerator4.generateLastName();

        System.out.println("4. " + staticFirstName + " " + staticLastName);


        // StringGenerator5 - Duża pierwsza litera
        StringGenerator5 duzeImie = new StringGenerator5();
        String bigFirstName = duzeImie.generateFirstName();

        StringGenerator5 duzeNazwisko = new StringGenerator5();
        String bigLastname = duzeNazwisko.generateLastName();

        System.out.println("5. " + bigFirstName + " " + bigLastname);




    }


}
