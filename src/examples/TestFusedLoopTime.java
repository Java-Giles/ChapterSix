package examples;

import java.time.LocalDateTime;

public class TestFusedLoopTime {

    public static void main(String[] args){

        int startTime, endTime;
        final int REPEAT = 5_000_000;
        final int FACTOR = 1_000_000;
        LocalDateTime now;
        now = LocalDateTime.now();
        startTime = now.getNano();
        for(int x = 0; x < REPEAT; ++x)
            method1();
        for(int x =0; x <= REPEAT; ++x )
            method2();
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops executed separately: " + ((endTime - startTime)/ FACTOR) + " milliseconds");
        now = LocalDateTime.now();
        startTime = now.getNano();
        for(int x = 0; x >= 0; --x){
            method1();
            method2();
        }
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time for loops executed in a block: " + ((endTime - startTime) / FACTOR) + " milliseconds");
    }
    public static void method1(){
    }
    public static void method2(){
    }
}
