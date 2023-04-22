package org.kyu.seven;

/*https://www.codewars.com/kata/57a93f93bb9944516d0000c1/train/java*/

import java.util.Objects;

public class InteractiveDictionary {
    private String key;
    private String value;
    public InteractiveDictionary() {
    }

    public void newEntry(String key, String value){
        setKey(key);
        setValue(value);
    }

    public String look(String key){
        if(!Objects.equals(this.key, key)) {
            return "Cant find entry for " + key;
        }
        return getValue();
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
