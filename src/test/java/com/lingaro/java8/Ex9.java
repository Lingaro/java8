package com.lingaro.java8;

import com.lingaro.java8.github.Utils;
import com.lingaro.java8.github.dto.Follower;
import com.lingaro.java8.github.dto.User;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class Ex9 {

    /**
     * TODO:
     * Fetch info of every follower of BrendanEich (@see {@link Follower#url} )
     * List the ones that have over 50 public repos. In descending order, by repo count;
     */
    List<User> getTop10Followers() {
        Follower[] followers = Utils.fetch("https://rzymek.github.io/rzymekon/BrendanEich/followers", Follower[].class);

        return Stream.of(new User("?", "?", 0))
                .collect(toList());
    }

    @Test
    public void test() {
        List<User> result = getTop10Followers();
        assertThat(result, contains(
                new User("erikvold", "Erik Vold", 273),
                new User("arunoda", "Arunoda Susiripala", 216),
                new User("jlongster", "James Long", 185),
                new User("cheeaun", "Lim Chee Aun", 144),
                new User("jcoglan", "James Coglan", 123),
                new User("darwin", "Antonin Hildebrand", 108),
                new User("zaach", "Zach Carter", 104),
                new User("misfo", "Trent Ogren", 100),
                new User("darkwing", "David Walsh", 100),
                new User("rauchg", "Guillermo Rauch", 94),
                new User("samsonjs", "Sami Samhuri", 88),
                new User("rlr", "ricky rosario", 81),
                new User("wavded", "Marc Harter", 73),
                new User("igstan", "Ionuț G. Stan", 60),
                new User("thejefflarson", "Jeff Larson", 56)
        ));
    }
}
