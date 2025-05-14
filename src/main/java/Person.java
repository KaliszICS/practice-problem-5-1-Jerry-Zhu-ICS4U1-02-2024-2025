/**
	* The Person class allows you to create a person with a String name and int age. There are getter and setter methods for all local variables;
	* @author Jerry Zhu
	* @version 1.0.0
	*/

class Person{
    String name;
    int age;

    /**
     * This constuctor makes a Person object wtih parameters name and age
     * @param name A String that represents the name of the person
     * @param age The age of the person in years
     */
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    /**
     * This method gets the name of the current object Person
     * @return Returns the name of the person as a String
     */
    public String getName(){
        return this.name;
    }
    
    
    /**
     * This method gets the age of the current object Person
     * @return Returns the age of the person as an int
     */
    public int getAge(){
        return this.age;
    }

    /**
     * This method sets the age of the current object Person
     * @param newName A String that the old name is to be replaced with
     */
    public void setName(String newName){
        this.name = newName;
    }
    /**
     
    
    * This method sets the age of the current object Person
     * @param newName the age that the old name is to be replaced with
     */
    public void setAge(int newAge){
        this.age = newAge;
    }


}