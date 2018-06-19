package com.lingaro.java8;

import com.lingaro.java8.github.MockData;
import com.lingaro.java8.github.dto.User;
import org.junit.Test;

import java.util.List;

public class Ex4 extends Ex1 {

    /**
     * TODO: Make Ex1.getDashboard() functional
     * Exercise for participant
     */
    @Override
    String getDashboard() {
        List<User> users = MockData.USERS;
        return "TODO";
    }

    @Test
    public void run() {
        super.run();
    }
}
