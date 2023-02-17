package Unactual.junit5.tags;

import org.junit.jupiter.api.Test;
//
public class FunctionalWithMetaAnnotationTest {
    @Test
    void testOne() {
        System.out.println("Функциональный тест 1");
    }

    @Test
    void testTwo() {
        System.out.println("Функциональный тест 2");
    }
}
