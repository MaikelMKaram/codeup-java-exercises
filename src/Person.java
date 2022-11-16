public class Person {
    public static void main(String[] args){
        Person person1 = new Person("Matt");
//        System.out.println(person1.getName()); //Getter -- not needed due to overloaded constructor -- will still be needed to access name in other Java documents
        person1.sayHello();
    }

    private String name; //creates private property/field within person class

    public Person(){ //Default constructor
    }

    public Person(String name) { //Overloaded constructor
        this.name = name;
    }

    public String getName(){ //Getter method
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){ //Setter method
//TODO: change the name field to the passed value
        this.name = name;
    }

    public void sayHello(){ //Method
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
