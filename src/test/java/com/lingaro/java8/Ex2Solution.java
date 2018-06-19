package com.lingaro.java8;

import com.lingaro.java8.github.MockData;
import com.lingaro.java8.github.dto.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex2Solution extends Ex2 {

    @Override
    String getDashboard() {
        List<User> users = new ArrayList<>(MockData.USERS);
        Collections.sort(users, Comparator.comparingInt(o -> o.publicRepos));
        Collections.reverse(users);
        return join(users, user -> user.publicRepos > 100, user1 -> user1.name + ": " + user1.publicRepos);
    }

    @Override
    String getFollwersDashboard() {
        return join(MockData.FOLLOWERS, f -> f.id < 10000, f -> f.login + ": " + f.id);
    }

    private <T> String join(List<T> items, Predicate<T> condition, Function<T, String> toString) {
        StringBuilder result = new StringBuilder();
        for (T item : items) {
            if (condition.test(item)) {
                String line = toString.apply(item);
                if (result.length() > 0) {
                    result.append(",\n");
                }
                result.append(line);
            }
        }
        return result.toString();
    }
}
