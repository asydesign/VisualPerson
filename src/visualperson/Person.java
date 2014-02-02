/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualperson;

/**
 *
 * @author fmi
 */
public class Person {
   private String firstName, lastName;
   private char sex;
   private int age;
   private String mail;
   private Address address;
   
   
   public Person (String firstName, String lastName, char sex, int age, String mail){
       this.firstName = firstName;
       this.lastName = lastName;
       this.sex = sex;
       this.age = age;
       this.mail = mail;
       
   }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
   
   
}

