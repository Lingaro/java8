package com.lingaro.java8;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class Ex6Solution extends Ex6 {

    @Override
    int getRepoCountByLogin(String login) {
        return findUserByLogin(login)
                .map(user -> user.publicRepos)
                .orElseGet(() -> getDefaultValueFor(login));
    }

    @Test
    public void optional() {
        assertThat(getRepoCountByLogin("rzymek"), equalTo(0));
        assertThat(getRepoCountByLogin("zaach"), equalTo(104));
    }


}
