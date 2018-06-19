package com.lingaro.java8.github.dto;

import java.util.Objects;

public class Follower {
    public final String login;
    public final String url;
    public final Integer id;

    public Follower(String login, String url, Integer id) {
        this.login = login;
        this.url = url;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Follower follower = (Follower) o;
        return Objects.equals(login, follower.login) &&
                Objects.equals(url, follower.url) &&
                Objects.equals(id, follower.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, url, id);
    }

    @Override
    public String toString() {
        return login;
    }
}
