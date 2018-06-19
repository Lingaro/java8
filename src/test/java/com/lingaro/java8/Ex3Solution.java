package com.lingaro.java8;

import com.lingaro.java8.github.MockData;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex3Solution extends Ex3 {

    @Override
    List<String> getUserNames() {
        return MockData.USERS
                .stream()
                .map(user -> user.name)
                .sorted(Comparator.comparing(String::toLowerCase))
                .collect(Collectors.toList());
    }

}
