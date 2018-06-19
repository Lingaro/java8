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

public class Ex1 {

    @SuppressWarnings("Duplicates")
    String getDashboard() {
        List<User> users = new ArrayList<>(MockData.USERS);
        Collections.sort(users, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.publicRepos - o2.publicRepos;
            }
        });
        Collections.reverse(users);
        StringBuilder result = new StringBuilder();
        for (User user : users) {
            if(user.publicRepos > 100) {
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
    public void run() {
        String dashboard = getDashboard();
        System.out.println(dashboard);
        assertThat(dashboard, equalTo(
                "Erik Vold: 273,\n" +
                "Arunoda Susiripala: 216,\n" +
                "James Long: 185,\n" +
                "Lim Chee Aun: 144,\n" +
                "James Coglan: 123,\n" +
                "Antonin Hildebrand: 108,\n" +
                "Zach Carter: 104"
        ));
    }
}
