package study.racing.util;

import org.apache.commons.lang3.RandomStringUtils;

public class RandomNameGenerator implements RandomGenerator<String> {
    private final static int DEFAULT_MINIMUM_LENGTH = 1;
    private final static int DEFAULT_MAXIMUM_LENGTH = 4;

    private RandomNameGenerator() { }

    public static RandomNameGenerator getInstance() {
        return LazyHolder.instance;
    }
    @Override
    public String generate() {
        return RandomStringUtils.randomAlphabetic(DEFAULT_MINIMUM_LENGTH, DEFAULT_MAXIMUM_LENGTH);
    }

    private static class LazyHolder {
        private static final RandomNameGenerator instance = new RandomNameGenerator();
    }
}
