package com.lingaro.java8;

import com.lingaro.java8.github.Utils;
import com.lingaro.java8.github.dto.Follower;
import com.lingaro.java8.github.dto.User;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class GenerateCode {

    @Test
    public void users() {
        String result = getFollowers()
                .map(follower -> follower.url)
                .map(url -> Utils.fetch(url, User.class))
                .map(this::toUserSrc)
                .collect(Collectors.joining(",\n"));
        System.out.println(result);
    }

    private String toUserSrc(User user) {
        return "new User(\"" + user.login + "\",\"" + user.name + "\"," + user.publicRepos + ")";
    }

    @Test
    public void followers() {
        String result = getFollowers()
                .map(it -> "new Follower(\"" + it.login + "\",\"" + it.url + "\"," + it.id + ")")
                .collect(Collectors.joining(",\n"));
        System.out.println(result);
    }

    private Stream<Follower> getFollowers() {
        return Stream.of(Utils.fetch("https://rzymek.github.io/rzymekon/BrendanEich/followers", Follower[].class));
    }

    @Test
    public void userNames() {
        String result = new Ex3Solution().getUserNames().stream().map(n -> '"' + n + '"').collect(joining(",\n"));
        System.out.println(result);
    }

    @Test
    public void ex9() {
        String result = new Ex9Solution().getTop10Followers().stream().map(this::toUserSrc).collect(joining(",\n"));
        System.out.println(result);
    }

}
