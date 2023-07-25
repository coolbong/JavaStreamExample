package io.github.coolbong;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringAppendExample {


    public void stringAppendExample1() {

        List<String> params = new ArrayList<>();
        params.add("CA");
        params.add("FE");
        params.add("BA");
        params.add("BE");
        params.add("DE");
        params.add("AD");
        params.add("BE");
        params.add("EF");

        String result = params.stream()
                .collect(Collectors.joining(""));

        System.out.println(result);
    }

    public void stringAppendExample1Diff() {

        List<String> params = new ArrayList<>();
        params.add("CA");
        params.add("FE");
        params.add("BA");
        params.add("BE");
        params.add("DE");
        params.add("AD");
        params.add("BE");
        params.add("EF");

        StringBuilder sb = new StringBuilder();
        for (String str : params) {
            sb.append(str);
        }

        System.out.println(sb);
    }

    public void stringAppendExample1Diff2() {

        List<String> params = new ArrayList<>();
        params.add("CA");
        params.add("FE");
        params.add("BA");
        params.add("BE");
        params.add("DE");
        params.add("AD");
        params.add("BE");
        params.add("EF");

        String result = String.join("", params);
        System.out.println(result);
    }


    public void stringAppendExample2() {

        List<String> params = new ArrayList<>();
        params.add("CA");
        params.add("FE");
        params.add("BA");
        params.add("BE");
        params.add("DE");
        params.add("AD");
        params.add("BE");
        params.add("EF");

        String result = "0x" + params.stream()
                .collect(Collectors.joining(":0x"));

        System.out.println(result);
    }

    public static void main(String[] args) {

        long start, finish, timeElapsed;

        StringAppendExample example = new StringAppendExample();

        start = System.nanoTime();
        example.stringAppendExample1();
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("time: " + timeElapsed);

        start = System.nanoTime();
        example.stringAppendExample1Diff();
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("time: " + timeElapsed);

        start = System.nanoTime();
        example.stringAppendExample1Diff2();
        finish = System.nanoTime();
        timeElapsed = finish - start;
        System.out.println("time: " + timeElapsed);

        //example.stringAppendExample2();

    }
}
