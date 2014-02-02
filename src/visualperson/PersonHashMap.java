/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualperson;

import java.util.HashMap;

/**
 *
 * @author fmi
 */
public class PersonHashMap {
    private HashMap<String,Person> myMap = new HashMap<String,Person>();
    
    public void addPerson (Person p){
    myMap.put(p.getMail(),p);
    }
    
    public void removePerson (String key){
        myMap.remove(key);
    }
    
    public void printPerson (String key){
        Person temp = myMap.get(key);
            if(temp != null){
                System.out.println(temp.getFirstName());
                System.out.println(temp.getLastName());
                System.out.println(temp.getSex());
                System.out.println(temp.getAge());
            }else{
                System.out.println("No result");
            }
        }
        
    
}
