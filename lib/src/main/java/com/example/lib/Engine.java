package com.example.lib;


    public class Engine {
        public String type;
        public Engine(String type){
            this.type=type;
        }
        public   void Start()
        {
            System.out.println("engine started"+type);

        }
        public void stop()
        {
            System.out.println("engine stopped"+type);

        }


    }
    /*
    public  class Wheel(){

      public  String wheels;
      public Wheel(String wheels)
      {
           this.wheels=wheels;

      }




    }


*/