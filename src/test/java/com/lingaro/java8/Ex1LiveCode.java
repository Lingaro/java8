package com.lingaro.java8;

import com.lingaro.java8.github.MockData;
import com.lingaro.java8.github.dto.User;

import java.util.List;

public class Ex1LiveCode extends Ex1 {

    /**
     * Return top users by repo count
     */
    @Override
    String getDashboard() {
        List<User> users = MockData.USERS;
        return users.toString();
    }
}
