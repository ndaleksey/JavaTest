package com.generics;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Shishkov A.V. on 27.04.2014.
 */
public class WildcardDemo {
    public static void main(String[] args) {
        List<?> list = Arrays.<Integer>asList();

    }
}
