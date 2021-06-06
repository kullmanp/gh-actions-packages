package ch.kup.gh_actions_packages;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


class HelloTest {

    @Test
    void test() {
        assertThat(new Hello().sayHello(), is("Hello"));
    }
}