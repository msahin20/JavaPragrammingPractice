package ExtraPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

class A {
    public A (){
        System.out.println("A");
    }
}

 //class B extends A {

     ////public B() {
        // System.out.println("B");
   //  }
 //}

class C extends B {
     public C () {
         System.out.println("C");

     }

    public static void main(String[] args) {
        B b = new B ();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Time is up");

        try {
            FileInputStream file = new FileInputStream("Downloads");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }

}
