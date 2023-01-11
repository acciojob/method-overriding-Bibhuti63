package com.driver;

public class Main {
  public static void main(String[] args) {
    B obj=new B();
    obj.meth();
    // System.out.println(obj.meth());
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