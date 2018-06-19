package com.lingaro.java8;

import com.lingaro.java8.github.dto.User;
import org.junit.Test;

import java.util.AbstractMap.SimpleEntry;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class Ex5 {

    Map<String, Integer> repoCountOver200ByLogin() {
//        return MockData.USERS
//                .stream()
//                .filter(user -> user.publicRepos > 200)
        return Collections.emptyMap();
    }

    Map<String, Set<User>> below100ByFirstLetter() {
//        return MockData.USERS
//                .stream()
//                .filter(user -> user.publicRepos < 100)
        return Collections.emptyMap();
    }

    @Test
    public void testRepoCountByLogin() {
        assertThat(repoCountOver200ByLogin(), equalTo(Stream.of(
                new SimpleEntry<>("erikvold", 273),
                new SimpleEntry<>("arunoda", 216)
        ).collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue))));
    }

    @Test
    public void testGroupByRepoCount() {
        assertThat(below100ByFirstLetter().toString(), equalTo("{" +
                "a=[adrianolaru], " +
                "c=[coto, croaky], " +
                "d=[DmitryBaranovskiy], " +
                "e=[ericflo, egoldblum], " +
                "f=[figital, fzzzy], " +
                "g=[GarrettS], " +
                "i=[igstan], " +
                "j=[johnmichel, jdalton], " +
                "m=[matthackedit], " +
                "n=[nuxodin], " +
                "p=[plutoniix], " +
                "r=[rauchg, rasmusfl0e, rlr], " +
                "s=[samsonjs], " +
                "t=[thejefflarson], " +
                "w=[wavded]" +
                "}"));
    }
}
