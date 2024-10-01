package com.datastructure.java.core.thiskeyword;

public class ThisKeyword {
    //1......................
    String name;
    ThisKeyword(String name){
        //this can be used to refer the current class instance variable
        this.name=name;//example
    }

    //2.....................
    private void display1(){
        System.out.println("hello i am display 1, invoked from via this keyword ");
    }
    private void display2(){
        System.out.println("this keyword is used to invoke the current class method ");
        this.display1();
    }
    //3.......................
    public ThisKeyword() {
        System.out.println("this keyword is used to invoke the current class constructor");
    }
    ThisKeyword(String name, int i){
        //this keyword is used to invoke the current class constructor
        this();
        System.out.println(name+" "+i);
    }
    //4......................
     private  void method( ThisKeyword thisKeyword){
         System.out.println(thisKeyword.name+"rule 4");
         System.out.println("this keyword  is used to pass the argument in the method");
     }
     private void method1(){
         method(this);
         System.out.println("rule 4");
     }
     //5.....................
      private static class B{
      A a;
      B(A a){
          this.a=a;
      }
      protected void dis(){
          System.out.println(a.number+" this keyword is used to pass the argument in the constructor call");
      }
     }
     private static class A{
        int number=10;
        A(){
            B b=new B(this);
            b.dis();
        }

     }

    public static void main(String[] args) {
       ThisKeyword thisKeyword=new ThisKeyword("this keyword");
        String name1 = thisKeyword.name;
        System.out.println(name1);//method one
        System.out.println(thisKeyword.name);//method two
        thisKeyword.display2();
        ThisKeyword thisKeyword1 =new ThisKeyword("thiskeyword rule",3 );

        thisKeyword.method(thisKeyword);//rule 4

        A a =new A();//5

    }
}
