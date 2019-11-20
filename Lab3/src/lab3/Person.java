package lab3;

import java.util.Date;


public class Person {
    
    private String name;
    
    private String age;
    
    private String number;

    public Person(String name, String age, String number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }
    
    //--------------Getter-----------------

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getNumber() {
        return number;
    }
    
    //----------------Setter-----------

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    //----------------------Others----------

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", number=" + number + '}';
    }
    
    
}