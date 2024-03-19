
package com.example.lib;
class dog implements Animal{
    public void makeSound(){
        System.out.println("wolf");
    }
}
class cat implements Animal{
    public void makeSound(){
        System.out.println("mewo");
    }
}

public class Interface {
    public static void main(String[] args)
    {
         cat Cat =new cat();
         dog Dog= new dog();
         Cat.makeSound();
         Dog.makeSound();
    }

}
