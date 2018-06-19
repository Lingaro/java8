package com.lingaro.java8;

import com.lingaro.java8.github.Utils;
import com.lingaro.java8.github.dto.Follower;
import com.lingaro.java8.github.dto.User;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex9Solution extends Ex9 {

    @Override
    List<User> getTop10Followers() {
        Follower[] followers = Utils.fetch("https://rzymek.github.io/rzymekon/BrendanEich/followers", Follower[].class);
        return Stream.of(followers)
                .parallel()
                .map(follower -> follower.url)
                .map(url -> Utils.fetch(url, User.class))
                .filter(user -> user.publicRepos > 50)
                .sorted(Comparator.comparing((User user) -> user.publicRepos).reversed())
                .collect(Collectors.toList());
    }
}

