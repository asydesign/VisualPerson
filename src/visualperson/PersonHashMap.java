/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package visualperson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

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
     public void printAllPerson (){
        Collection<Person> coll = myMap.values();
        Iterator<Person> it = coll.iterator();
        Person temp;
      while(it.hasNext()){
         temp = it.next();
         System.out.println("-------------------");
         printPerson(temp.getMail());
         System.out.println("-------------------");
      }
           
        }   
    public void sortedPrint(){
        ArrayList<Person> unsorted = new ArrayList<Person>();
        ArrayList<Person> sorted = new ArrayList<Person>(); 
        unsorted.addAll(myMap.values());
       
        for (int i=0; i<unsorted.size(); i++){
           for (int j=0; j<sorted.size(); j++){
                if(unsorted.get(i).getAge() < sorted.get(j).getAge()){
                    sorted.add(j,unsorted.get(i));
                }
            }
        }
        
        
        
    }
}
