package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDateTest() {
        Date expected = new Date();

        Dog dog = new Dog(null, new Date(2020, 04, 03), 476);
        dog.setBirthDate(expected);

        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void speakTest() {
        String expected = "bark!";

        Dog dog = new Dog("Fido", new Date(2020, 03, 06), 455);
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatFoodTest() {
        Dog dog = new Dog(null, null, 568);
        Food food = new Food();
        int initialMealsEaten = dog.getNumberOfMealsEaten();
        int expected = initialMealsEaten + 1;

        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getIdTest() {
        Dog dog = new Dog(null, null, 568);
        int expected = 568;
        int actual = dog.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritance() {
        Dog dog = new Dog(null, null, 568);

        boolean outcome = dog instanceof Animal;

        Assert.assertTrue(outcome);
    }

    @Test
    public void mammalInheritance() {
        Dog dog = new Dog(null, null, 568);

        boolean outcome = dog instanceof Mammal;

        Assert.assertTrue(outcome);
    }

}
