package com.lingaro.java8.github;

import com.lingaro.java8.github.dto.Follower;
import com.lingaro.java8.github.dto.User;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class MockData {

    public static List<User> USERS = Collections.unmodifiableList(Arrays.asList(
            new User("croaky", "Dan Croak", 22),
            new User("ericflo", "Eric Florenzano", 50),
            new User("cheeaun", "Lim Chee Aun", 144),
            new User("zaach", "Zach Carter", 104),
            new User("jdalton", "John-David Dalton", 15),
            new User("darwin", "Antonin Hildebrand", 108),
            new User("jcoglan", "James Coglan", 123),
            new User("figital", "figital", 32),
            new User("rauchg", "Guillermo Rauch", 94),
            new User("rasmusfl0e", "Rasmus Fløe", 25),
            new User("johnmichel", "John Michel", 25),
            new User("nuxodin", "Tobias Buschor", 35),
            new User("jlongster", "James Long", 185),
            new User("DmitryBaranovskiy", "Dmitry Baranovskiy", 12),
            new User("matthackedit", "Matt Hackett", 21),
            new User("coto", "Coto", 33),
            new User("wavded", "Marc Harter", 73),
            new User("erikvold", "Erik Vold", 273),
            new User("adrianolaru", "Adrian Olaru", 49),
            new User("samsonjs", "Sami Samhuri", 88),
            new User("rlr", "ricky rosario", 81),
            new User("misfo", "Trent Ogren", 100),
            new User("plutoniix", "plutoniix", 0),
            new User("fzzzy", "Donovan Preston", 43),
            new User("darkwing", "David Walsh", 100),
            new User("igstan", "Ionuț G. Stan", 60),
            new User("arunoda", "Arunoda Susiripala", 216),
            new User("thejefflarson", "Jeff Larson", 56),
            new User("GarrettS", "Garrett Smith", 23),
            new User("egoldblum", "Ethan Goldblum", 14)
    ));

    public static List<Follower> FOLLOWERS = Collections.unmodifiableList(Arrays.asList(
            new Follower("croaky", "https://rzymek.github.io/rzymekon/users/croaky", 198),
            new Follower("ericflo", "https://rzymek.github.io/rzymekon/users/ericflo", 1228),
            new Follower("cheeaun", "https://rzymek.github.io/rzymekon/users/cheeaun", 2296),
            new Follower("zaach", "https://rzymek.github.io/rzymekon/users/zaach", 3903),
            new Follower("jdalton", "https://rzymek.github.io/rzymekon/users/jdalton", 4303),
            new Follower("darwin", "https://rzymek.github.io/rzymekon/users/darwin", 5453),
            new Follower("jcoglan", "https://rzymek.github.io/rzymekon/users/jcoglan", 9265),
            new Follower("figital", "https://rzymek.github.io/rzymekon/users/figital", 10073),
            new Follower("rauchg", "https://rzymek.github.io/rzymekon/users/rauchg", 13041),
            new Follower("rasmusfl0e", "https://rzymek.github.io/rzymekon/users/rasmusfl0e", 13237),
            new Follower("johnmichel", "https://rzymek.github.io/rzymekon/users/johnmichel", 13830),
            new Follower("nuxodin", "https://rzymek.github.io/rzymekon/users/nuxodin", 16326),
            new Follower("jlongster", "https://rzymek.github.io/rzymekon/users/jlongster", 17031),
            new Follower("DmitryBaranovskiy", "https://rzymek.github.io/rzymekon/users/DmitryBaranovskiy", 22726),
            new Follower("matthackedit", "https://rzymek.github.io/rzymekon/users/matthackedit", 24601),
            new Follower("coto", "https://rzymek.github.io/rzymekon/users/coto", 25914),
            new Follower("wavded", "https://rzymek.github.io/rzymekon/users/wavded", 26638),
            new Follower("erikvold", "https://rzymek.github.io/rzymekon/users/erikvold", 27379),
            new Follower("adrianolaru", "https://rzymek.github.io/rzymekon/users/adrianolaru", 31248),
            new Follower("samsonjs", "https://rzymek.github.io/rzymekon/users/samsonjs", 32487),
            new Follower("rlr", "https://rzymek.github.io/rzymekon/users/rlr", 36629),
            new Follower("misfo", "https://rzymek.github.io/rzymekon/users/misfo", 40791),
            new Follower("plutoniix", "https://rzymek.github.io/rzymekon/users/plutoniix", 42496),
            new Follower("fzzzy", "https://rzymek.github.io/rzymekon/users/fzzzy", 46048),
            new Follower("darkwing", "https://rzymek.github.io/rzymekon/users/darkwing", 46655),
            new Follower("igstan", "https://rzymek.github.io/rzymekon/users/igstan", 49002),
            new Follower("arunoda", "https://rzymek.github.io/rzymekon/users/arunoda", 50838),
            new Follower("thejefflarson", "https://rzymek.github.io/rzymekon/users/thejefflarson", 55365),
            new Follower("GarrettS", "https://rzymek.github.io/rzymekon/users/GarrettS", 56098),
            new Follower("egoldblum", "https://rzymek.github.io/rzymekon/users/egoldblum", 64733)
    ));

    private MockData() {
    }
}
