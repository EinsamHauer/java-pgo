package com.example;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * Author: Andrei Ivanov
 * Date: 10/1/19
 */
public class Test1 {

    public static void main(String[] args) {
        int param = Integer.parseInt(args[0]);

        double result = 0;
        Stopwatch sw = Stopwatch.createStarted();

        for (int i = 0; i < 1_000_000; i++) {
            result += f(param, i);
        }

        sw.stop();
        System.out.println("Invoked with argument: " + param);
        System.out.println("Elapsed: " + sw.elapsed(TimeUnit.MILLISECONDS) / 1000. + "s");
        System.out.println("Result: " + result);
    }


    private static double f(int param1, int param2) {
        double result = 0;
        for (int i = 0; i < 1_000; i++) {
            result += Math.sqrt(i);
        }

        if (param1 != 42)
            return result + param2;
        else
            return 0;
    }
}
