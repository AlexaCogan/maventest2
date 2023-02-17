package maventest2.Hamcrest;

import maventest2.PojoBean;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static  org.hamcrest.Matchers.*;

public class CoreMatchersTest {
    private String efsName = "ЕФС - Единая Фронтальная Система";

    @Test
    void stringShouldContainSpecCharacters(){
        assertThat(efsName, Matchers.containsString("ЕФС"));

    }

    /*логические матчеры - принимают в качестве аргумента другие матчеры*/

    @Test
    void  shouldWorkHamcrestMatcherAllOf() {
        assertThat(efsName, allOf(startsWith("ЕФС"), containsString("Фронтальная")));
    }

    @Test
    void shouldWorkHamcrestMatcherAnyOf() {
        assertThat(efsName, anyOf(startsWith("ЕФС"), containsString("Троль")));
    }

    @Test
    void shouldWorkHamcrestMatcherBoth() {
        assertThat(efsName, both(startsWith("ЕФС")).and(instanceOf(String.class)));
    }

    @Test
    void shouldWorkHamcrestMatcherNot() {
        assertThat(efsName, not(startsWith("ППРБ")));
    }
/*syntax matchers - для более удобного чтения*/
    @Test
    void shouldWorkHamcrestMatcherIs(){
        assertThat("ППРБ", equalTo("ППРБ"));
        assertThat("ППРБ", is(equalTo("ППРБ")));
        assertThat("ППРБ", is("ППРБ"));
    }

    @Test
    void shouldWorkHamcrestMatcherAnything(){
        assertThat(efsName, anything());
    }

    /*матчеры проверки свойств объектов классов*/

    @Test
    void shouldWorkHamcrestHasProperty() {
        PojoBean bean = new PojoBean("Alex", 29); //создаем объект с определенными параметрами
        System.out.println("Name: "+ bean.getName() + bean.getAge());
        assertThat(bean, allOf(
                hasProperty("name", is("Alex")),
                hasProperty("age")));
    }


    @Test
    void shouldWorkSamePropertyValuesAs() {
        PojoBean bean1 = new PojoBean("Mark", 29);
        PojoBean bean2 = new PojoBean("Mark", 29);
        assertThat(bean1, samePropertyValuesAs(bean2));
    }

    @Test
    void pojoBeanSouldHaveCorrectToStringMethod(){
        PojoBean pojoBean3= new PojoBean("Vadim", 41);
        assertThat(pojoBean3, hasToString("[Name: Vadim, Age: 41]"));
    }

    @Test
    void pojoBeanShouldHaveRightType(){
        PojoBean pojoBean4 = new PojoBean("Mark", 23);
        assertThat(pojoBean4.getClass(), is(instanceOf(PojoBean.class)));
    }

    @Test
    void pojoBeanShouldBeNull() {
        PojoBean pojoBean5 = null;
        assertThat("Объект не null", pojoBean5, is(nullValue()));
    }

    @Test
    void shouldWorkCloseTo() {
        assertThat(200.24, is(closeTo(202, 10)));
    }
    @Test
    void shouldWorkGreaterThan(){
        assertThat(100, greaterThan(18));
    }
    @Test
    void souldWorkEveryItemInListGreaterThanOrEqualToNumber(){
        IntStream ages = IntStream.of(21, 25, 30, 18);
        assertThat(ages.boxed().collect(Collectors.toList()), everyItem(greaterThanOrEqualTo(18)));
    }


    @Test
    void shouldWorkStringContainsInOrder(){
        assertThat("xUnit is't test framework", stringContainsInOrder("x", "test", "framework"));
    }

    @Test
    void stringShouldBeEmpty(){
        assertThat("", isEmptyString());
        assertThat(null, isEmptyOrNullString());
    }

    @Test
    void textShouldBeWithSpecialString(){
        String text = "Kotlin Appium Andriod";
        assertThat(text, containsString("Appium"));
        assertThat(text, startsWith("Kotlin"));
        assertThat(text, endsWith("Andriod"));
    }

    @Test
    void textShouldBeEquals(){
        assertThat("Charlies Angels", equalToIgnoringCase("charlies angels"));
        assertThat(" charlies  angels", equalToIgnoringWhiteSpace("charlies angels"));
    }

    @Test
    void singleElementShouldBeInCollection(){
        List<String> collection=asList("Артем", "Ольга", "Анатолий");
        assertThat("Коллекция не содержит требуемое значение", collection, hasItem("Артем"));
        assertThat("Коллекция содержит требуемое значение", collection, not(hasItem("Дмитрий")));
    }

    @Test
    void multipleElementShouldBeInCollection(){
        List<String> collection=asList("Артем", "Ольга", "Анатолий");
        assertThat("Коллекция не содержит требуемое значение", collection, hasItems("Анатолий", "Ольга"));
    }
    @Test
    void multipleElementWithStrictOrder(){
        List<String> collection=asList("Дмитрий", "Роман", "Давлет");
        assertThat(collection, contains("Дмитрий", "Роман", "Давлет"));
    }

    @Test
    void multipleElementWithAnyOrderButAll(){
        List<String> collection=asList("Дмитрий", "Роман", "Давлет");
        assertThat(collection, containsInAnyOrder("Роман", "Дмитрий", "Давлет"));
    }

    @Test
    void collectionShouldBeEmpty(){
        List<String> collection= Collections.emptyList();
        assertThat("коллекция не пустая", collection.isEmpty());
    }

    @Test
    void everyElementShouldBeGreaterSpecialNumber(){
        List<Integer> collection=asList(150, 201, 11, 12);
        assertThat(collection, everyItem(greaterThan(10)));
    }

    @Test
    void ListWithSpecialElementShouldHaveSpecialSize(){
        List<String> collection = asList("Allure", "Kotlin", "Appium");
        assertThat(collection, hasSize(3));
    }

    @Test
    void mapShouldHaveSpecialKey() {
        Map<String, String> map = new HashMap<>();
        map.put("Artem", "30");
        map.put("Olga", "25");
        map.put("Anatoly", "33");
        assertThat(map, hasKey("Olga"));
    }

    @Test
    void mapSholdHaveSpecialValue(){
        Map<String, String> map=new HashMap<>();
        map.put("Kotlit", "1.2.60");
        assertThat(map, hasValue("1.2.60"));
    }

    @Test
    void mapShouldHaveSpecialEntry(){
        Map<String, String> map = new HashMap<>();
        map.put("Artem", "Sokovets");
        assertThat(map, hasEntry("Artem", "Sokovets"));
    }

}
