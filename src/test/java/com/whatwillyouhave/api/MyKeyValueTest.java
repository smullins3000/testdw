package com.whatwillyouhave.api;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyKeyValueTest {
    private MyKeyValue MY_KEY_VALUE = null;
    private final String KEY = "key";
    private final String VALUE = "value";

    @BeforeEach
    public void setUp() {
        System.out.println("Setting up");
        MY_KEY_VALUE = new MyKeyValue(KEY, VALUE);
    }

    @Test
    public void testEquals() throws Exception {
        MyKeyValue testKV = new MyKeyValue("key", "value");

        Assertions.assertThat(testKV.equals(MY_KEY_VALUE));

        testKV.setKey("Not the key");

        Assertions.assertThat(testKV).isNotEqualTo(MY_KEY_VALUE);
    }

    @Test
    public void testHash() throws Exception {
        MyKeyValue testKV = new MyKeyValue("key", "value");

        Assertions.assertThat(testKV).isNotNull();
        Assertions.assertThat(MY_KEY_VALUE).isNotNull();

        Assertions.assertThat(testKV.hashCode()).isEqualTo(MY_KEY_VALUE.hashCode());

        testKV.setKey("Not the key");

        Assertions.assertThat(testKV.hashCode()).isNotEqualTo(MY_KEY_VALUE.hashCode());
    }
}
