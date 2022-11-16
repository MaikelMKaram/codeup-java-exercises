import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args){

//        int[] numbers = {1, 2, 3, 4, 5, 6};
//        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
//        for (int i = 0; i < numbers.length; i++){
//        System.out.println(numbers[i]);
//        }

//============ Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element. Iterate through the array and print out the name of each person in the array. ============

//        String[] Person = {"Jim", "James", "Jack"};
//        for (int i = 0; i < Person.length; i++) {
//            System.out.println(Person[i]);
//        }

//============ Create a static method named addPerson. ============
        Person[] peeps = new Person[4];
        peeps[0] = new Person("Johnny");
        peeps[1] = new Person("Jimmy");
        peeps[2] = new Person("Jacky");
        peeps[3] = new Person("Jamey");

        peeps = addPerson(peeps, new Person("Jameson"));
        for (int i = 0; i < peeps.length; i++){
            System.out.println(peeps[i].getName());
        }
    }

//============ Create a static method named addPerson. It should accept an array of Person objects, as well as a single person object to add to the passed array. It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array. ============

    public static Person[] addPerson(Person[] peopleArr, Person person){
        Person[] people = Arrays.copyOf(peopleArr, peopleArr.length + 1);
        people[people.length - 1] = person;
        return people;
    }
}
