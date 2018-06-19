package com.lingaro.java8;

import com.lingaro.java8.github.MockData;
import com.lingaro.java8.github.dto.User;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

public class Ex3 {

    /**
     * @return sorted user names (case insensitive)
     */
    List<String> getUserNames() {
        List<User> users = MockData.USERS;
        // TODO
        return Collections.emptyList();
    }

    @Test
    public void test() {
        assertThat(getUserNames(), contains(
                "Adrian Olaru",
                "Antonin Hildebrand",
                "Arunoda Susiripala",
                "Coto",
                "Dan Croak",
                "David Walsh",
                "Dmitry Baranovskiy",
                "Donovan Preston",
                "Eric Florenzano",
                "Erik Vold",
                "Ethan Goldblum",
                "figital",
                "Garrett Smith",
                "Guillermo Rauch",
                "Ionuț G. Stan",
                "James Coglan",
                "James Long",
                "Jeff Larson",
                "John Michel",
                "John-David Dalton",
                "Lim Chee Aun",
                "Marc Harter",
                "Matt Hackett",
                "plutoniix",
                "Rasmus Fløe",
                "ricky rosario",
                "Sami Samhuri",
                "Tobias Buschor",
                "Trent Ogren",
                "Zach Carter"
        ));
    }
}
