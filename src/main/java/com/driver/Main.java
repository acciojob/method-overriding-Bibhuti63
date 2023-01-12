package com.driver;

public class Main {
  public static void main(String[] args) {
   A obj1=new A();
   obj1.meth();
//    System.out.println(obj1.meth());

   B obj2=new B();
   obj2.meth();
//    System.out.println(obj2.meth());
  }
}
class A{
    public String meth(){
        String str="Invoking method from class A";
        return str;
    }
}
class B extends A{
    public String meth(){
        String str="Method is overridden in Extendend class B";
        return str;
    }

}