package com.datastructure.java.pattern;

public class Pattern {
    public static void main(String[] args) {
        sloppattern();
//        System.out.println();
//       brikspattern();
//        System.out.println();
//        backslop();
//        System.out.println();
//        sidepyramid(5);
//        System.out.println();
//         leftsideslop(5);
//        System.out.println();
//         daimod(10);
//        System.out.println("odd print");
//        oddprint(6);
//        System.out.println("odd print down");
//        oddprintdown(5);
//        System.out.println();
//        demopattern(6);
        System.out.println();
      //  innerspace(5);


    }
    static void sloppattern(){
        for(int row=0;row<4;row++){
            for(int col=0;col<=row;col++){
                System.out.print(col);//change * if needed
            }
            System.out.println();
        }
    }
    static void brikspattern(){
        for(int row=0;row<6;row++){
            for(int col=0;col<6;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void backslop(){
        for(int row=0;row<7;row++){
            for(int col=1;col<7-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void sidepyramid(int n){
        for(int i=0;i<n*2;i++){
            int totalcol=i<n?i:n*2-i;
            for(int col=0;col<totalcol;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void leftsideslop(int n){
        for(int row=0;row<n;row++){
            int space=n-row-1;
            for(int spaced=0;spaced<space;spaced++){
                System.out.print(" ");
            }
            for(int col=0;col<row+1;col++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }

    }
    static void daimod(int n){
        for(int row=1;row<n*2;row++){
            int totalspace=row<=n?n-row+1:row-n+1;
            int totalcol=row<=n?row:n*2-row;
            for(int space=1;space<totalspace;space++){
                System.out.print(" ");
            }
            for(int col=1;col<totalcol;col++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void oddprint(int n){
        for(int row=1;row<=n;row++){
            for(int space=n-row;space>0;space--){
                System.out.print(" ");
            }
            for(int col=row*2-1;col>0;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void oddprintdown(int n){
        for(int row=1;row<=n;row++){
            for(int space=1;space<row;space++){
                System.out.print(" ");
            }
            for(int col=row*2-1;col<n*2;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
 static void demopattern(int n){
        for(int row=1;row<=n;row++){
            for(int space=row-1;space>0;space--){
                System.out.print(" ");
            }
            for(int col=n-row+1;col>0;col--){
                System.out.print("*");
            }
            System.out.println();
        }
     }
     static void innerspace(int n){
        for(int row=1;row<=n;row++){
            int outerspace=n-row;
            for(int space=1;space<=outerspace;space++){
                System.out.print(" ");
            }
            int leftcol=(row!=n)?1:n;
            for(int leftcolval=0;leftcolval<leftcol;leftcolval++){
                System.out.print("*");
            }
            int totinnerspace=0;
            if(row!=n){
                totinnerspace=(row*2)<n?row:row+1;
            }else{
                totinnerspace=1;
            }
            for(int inspace=1;inspace<totinnerspace;inspace++){
                System.out.print(" ");
            }
            int rightcol=0;
            if(row!=0){
                rightcol=(row!=n)?1:n-1;
            }
            for(int rightcolval=0;rightcolval<rightcol;rightcolval++){
                System.out.print("*");
            }
            System.out.println();
        }
     }
}
