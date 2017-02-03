class Mammal{
 public void run(){
      //some operation
    }
 }

class Elephant extends Mammal{
   private void run(){
       //some operation
   }
 }

 class Test {
 	Mammal Dumbo = new Elephant();
 	Dumbo.run(); //Runtime error
 }