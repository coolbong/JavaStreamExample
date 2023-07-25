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

    String result = "0x" + params.stream()
            .collect(Collectors.joining(":0x"));

    System.out.println(result);
}

    public static void main(String[] args) {
        StringAppendExample example = new StringAppendExample();
        example.stringAppendExample1();
    }
}
