package Unactual.junit5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GroupedAssertionsTest {

    @Test
    void groupedAssertions() {
        Customer customer = new Customer("Artem", "Sokovets");
        assertAll("Проверка имя и фамилии", //Задан лейбл, т.к методов assertAll может быть несколько
                () -> assertEquals("Artem", customer.name),
                () -> assertEquals("Artem Sokovets", "ArtSok"),
                () -> assertEquals("Sokovets", customer.lastName));

    }

    private final static class Customer {
        private final String name;
        private final String lastName;

        Customer(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }
    }
}
