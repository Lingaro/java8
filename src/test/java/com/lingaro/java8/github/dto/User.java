package com.lingaro.java8.github.dto;

import java.util.Objects;

public class User {
    public final String login;
    public final String name;
    public final Integer publicRepos;

    public User(String login, String name, Integer publicRepos) {
        this.login = login;
        this.name = name;
        this.publicRepos = publicRepos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) &&
                Objects.equals(name, user.name) &&
                Objects.equals(publicRepos, user.publicRepos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, name, publicRepos);
    }

    @Override
    public String toString() {
        return login;
    }
}
