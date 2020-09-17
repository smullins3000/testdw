package com.whatwillyouhave.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class MyKeyValue {
    private String key;
    private String value;

    @JsonProperty
    @NotNull
    public String getKey() {
        return key;
    }

    @JsonProperty
    @NotNull
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty
    @NotNull
    public String getValue() {
        return value;
    }

    @JsonProperty
    @NotNull
    public void setValue(String value) {
        this.value = value;
    }

    public MyKeyValue(@NotNull String key, @NotNull String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public int hashCode() {
        String allStrings = key+value;

        return allStrings.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof MyKeyValue)) {
            return false;
        }
        MyKeyValue other = (MyKeyValue)obj;

        return this.key.equals(other.getKey()) && this.value.equals(other.getValue());
    }
}
