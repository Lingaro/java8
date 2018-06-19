package com.lingaro.java8.github;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStreamReader;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

public final class Utils {

    static {
        System.setProperty(
                "java.util.logging.SimpleFormatter.format",
                "[%1$tH:%1$tM:%1$tS.%1$tL] %5$s%6$s%n"
        );
    }

    private static final Logger LOG = getLogger(Utils.class.getName());

    static {
//        LOG.setLevel(Level.OFF);
    }

    private static Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            .create();

    private Utils() {
    }

    public static <T> T fetch(String url, Class<T> type) {
        LOG.info(url);
        try (InputStreamReader in = new InputStreamReader(new URL(url + "?modifiedFrom=" + LocalDateTime.now())
                .openStream())) {
            return gson.fromJson(in, type);
        } catch (Exception e) {
            throw new RuntimeException(url, e);
        }
    }
}
