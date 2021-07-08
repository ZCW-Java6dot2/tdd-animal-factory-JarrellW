package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAdd(){
        Dog play = new Dog("fido", new Date(2020,03,05), 478);
        DogHouse dHouse = new DogHouse();
        DogHouse.add(play);
        Dog actual = DogHouse.getDogById(478);
        Dog expected = play;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testRemove(){
        Dog play = new Dog("Fido", new Date(2020,04,06), 477);
        DogHouse.add(play);
        Integer id = play.getId();

        DogHouse.remove(id);
        Dog removeDog = DogHouse.getDogById(id);
        Assert.assertNull(removeDog);
    }
    @Test
    public void testRemoveDog(){
        Dog play = new Dog("Fido", new Date(2020,04,03), 476);
        DogHouse.add(play);
        Integer id = play.getId();

        DogHouse.remove(play);
        Dog removeDog = DogHouse.getDogById(id);
        Assert.assertNull(removeDog);


    }
    @Test
    public void getDogById(){
        Dog play = new Dog("Fido", new Date(2020,04,03), 475);
        Integer id = play.getId();
        DogHouse dHouse = new DogHouse();
        DogHouse.getDogById(id);

        DogHouse.getDogById(id);
        Dog returnDog = DogHouse.getDogById(id);
        Assert.assertNull(returnDog);

    }

//    @Test
//    public void getNumberOfDogsTest(){
//        Dog dog = new Dog("Fido",new Date(2020,01,02),474);
//
//        int numberOfDogsBeforeAdd = DogHouse.getNumberOfDogs();
//        int expected = numberOfDogsBeforeAdd + 1;
//
//        DogHouse.add(dog);
//        int actual = DogHouse.getNumberOfDogs();
//
//        Assert.assertEquals(expected, actual);
//    }
}
