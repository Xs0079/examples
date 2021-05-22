package com.xs.test;

import java.util.Arrays;

/**
 * Created by Xu Sheng on 2021/5/21.
 */

public class Test1 {
    public static void main(String[] args) {
        String s = "2021 2020 2019 2018 2017 2016 2015 2014 2013 2012 2011 2000-2010 90年代 80年代 70年代 更早";
        String[] strArr = s.split(" ");
        Arrays.stream(strArr).forEach(System.out::println);
    }
}
