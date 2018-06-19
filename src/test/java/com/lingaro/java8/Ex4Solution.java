package com.lingaro.java8;

import com.lingaro.java8.github.MockData;
import com.lingaro.java8.github.dto.User;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Ex4Solution extends Ex1 {

    @Override
    String getDashboard() {
        return MockData.USERS
                .stream()
                .filter(user -> user.publicRepos > 100)
                .sorted(Comparator.comparingInt((User user) -> user.publicRepos).reversed())
                .map(user -> user.name + ": " + user.publicRepos)
                .collect(Collectors.joining(",\n"));
    }

}
