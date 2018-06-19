package com.lingaro.java8;

import com.lingaro.java8.github.MockData;
import com.lingaro.java8.github.dto.User;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

public class Ex5Solution extends Ex5 {

    @Override
    Map<String, Integer> repoCountOver200ByLogin() {
        return MockData.USERS
                .stream()
                .filter(user -> user.publicRepos > 200)
                .collect(Collectors.toMap(
                        user -> user.login,
                        user -> user.publicRepos
                ));
    }

    @Override
    Map<String, Set<User>> below100ByFirstLetter() {
        return MockData.USERS
                .stream()
                .filter(user -> user.publicRepos < 100)
                .collect(Collectors.groupingBy(
                        user -> user.login.substring(0, 1).toLowerCase(),
                        TreeMap::new,
                        toSet()
                ));
    }
}
