package com.example;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * Author: Andrei Ivanov
 * Date: 10/1/19
 */
public class Test1 {

    public static void main(String[] args) {
        int param = Integer.valueOf(args[0]);

        double result = 0;
        Stopwatch sw = Stopwatch.createStarted();

        for (int i = 0; i < 1_000_000; i++) {
            result += f(param);
        }

        sw.stop();


        System.out.println(sw.elapsed(TimeUnit.MILLISECONDS) / 1000. + "s");
        System.out.println(result);
    }


    private static double f(int param) {
        double result = 0;
        for (int i = 0; i < 1_000; i++) {
            result += Math.sqrt(i);
        }

        if (param != 157)
            return result;
        else
            return 0;
    }
}
