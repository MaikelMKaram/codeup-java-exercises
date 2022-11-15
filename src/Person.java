public class Person {

    private String name;

    public Person(){
    }

    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("name = " + name);
    }

}





//Notes
//public class Person {
//    //Fill out a character sheet
//    //Name
//    //Hair color
//    //Age
//
//    //Set up our first fields:
//    String name;
//    String hairColor;
//    int age;
//
//    //We can set up a method as a field as well
//    public void sayHi(){
//        System.out.printf("Hey it's %s! He's %d years old", name, age);
//    }
//
//    //To 'make' an instance of a person object, we need a CONSTRUCTOR [method]. Must be same as class name. This is the mandatory default blank constructor. Other constructors containing fields can be added after.
//    public Person(){
//    };
//
//    public static void main(String[] args){
//        //instantiate a NEW PERSON OBJECT [with a variable name of mike]
//    Person mike = new Person();
//
//    //Assigned the fields with dot notations:
//    mike.name = "Michael";
//    mike.hairColor = "brown";
//    mike.age = 36;
//
//    System.out.println("mike.name = " + mike.name);
//    System.out.println("mike.hairColor = " + mike.hairColor);
//    System.out.println("mike.age = " + mike.age);
//
//    mike.sayHi();
//
//    };
//}
