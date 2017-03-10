import java.util.*;
public class IteratorDemo {
 
  public static void main(String args[]){
    ArrayList names = new ArrayList();
    names.add("Michael");
    names.add("Steve");
    names.add("Jack");
 
    Iterator it = names.iterator();
 
    while(it.hasNext()) {
      String obj = (String)it.next();
      System.out.println(obj);
    }

    Iterator<String> it2 = names.iterator();
 
    while(it2.hasNext()) {
      String obj = it2.next();
      System.out.println(obj);
    }

    ListIterator lit = names.listIterator();

    while(lit.hasPrevious()) {
      String obj = (String)it.previous();
      System.out.println(obj);
    }
  }
}