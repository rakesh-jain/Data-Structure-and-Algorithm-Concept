package com.datastructure.java.recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfh(5,'A','C','B');
       // System.out.println("\uD83D\uDC88");
    }

    private static void towerOfh(int n, char from, char to, char helper) {
        if(n==1){
            System.out.println("take \uD83D\uDCC0 disk 1 from rod \uD83D\uDC88 "+from+" to rod \uD83D\uDC88" +to);
            return;
        }
        towerOfh(n-1,from,helper,to);
        System.out.println("take \uD83D\uDCC0 disk "+ n +" from rod \uD83D\uDC88 "+from+" to rod \uD83D\uDC88" +to);
        towerOfh(n-1,helper,to,from);
    }
}
