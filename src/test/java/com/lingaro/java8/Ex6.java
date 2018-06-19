package com.lingaro.java8;

import com.lingaro.java8.github.MockData;
import com.lingaro.java8.github.dto.User;
import org.junit.Test;

import java.util.Optional;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class Ex6 {

    private static final Logger LOG = getLogger(Ex6.class.getName());

    public static Optional<User> findUserByLogin(String login) {
        return MockData.USERS.stream()
                .filter(user -> user.login.equals(login))
                .findFirst();
    }

    int getDefaultValueFor(String login) {
        LOG.warning("Expensive default calculation for " + login);
        return 0;
    }

    int getRepoCountByLogin(String login) {
        // TODO: live coding
        return 0;
    }

    @Test
    public void optional() {
        assertThat(getRepoCountByLogin("rzymek"), equalTo(0));
        assertThat(getRepoCountByLogin("zaach"), equalTo(104));
    }


}
