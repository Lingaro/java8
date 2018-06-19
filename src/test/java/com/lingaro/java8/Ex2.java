package com.lingaro.java8;

import com.lingaro.java8.github.MockData;
import com.lingaro.java8.github.dto.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class Ex2 extends Ex1 {

    @Override
    String getDashboard() {
        List<User> users = new ArrayList<>(MockData.USERS);
        // TODO convert to Comparator.comparingInt using Idea
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.publicRepos - o2.publicRepos;
            }
        });
        Collections.reverse(users);
        return join(users);
    }

    String getFollwersDashboard() {
        // return join(MockData.FOLLOWERS, f -> f.id < 10000, f -> f.login + ": " + f.id);
        return "TODO";
    }

    /*
     * TODO: generalize join() to accept
     * - Predicate<T> condition,
     * - Function<T, String> toString
     */
    @SuppressWarnings("Duplicates")
    private String join(List<User> items) {
        StringBuilder result = new StringBuilder();
        for (User user : items) {
            if (user.publicRepos > 100) {
                String line = user.name + ": " + user.publicRepos;
                if (result.length() > 0) {
                    result.append(",\n");
                }
                result.append(line);
            }
        }
        return result.toString();
    }


    @Test
    public void followers() {
        String dashboard = getFollwersDashboard();
        System.out.println(dashboard);
        assertThat(dashboard, equalTo(
                "croaky: 198,\n" +
                "ericflo: 1228,\n" +
                "cheeaun: 2296,\n" +
                "zaach: 3903,\n" +
                "jdalton: 4303,\n" +
                "darwin: 5453,\n" +
                "jcoglan: 9265"
        ));
    }
}
