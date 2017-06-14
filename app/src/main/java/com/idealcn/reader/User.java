package com.idealcn.reader;

import java.io.Serializable;

/**
 * Created by ideal on 17-6-14.
 */

public class User implements Serializable {
    public String name;
    public boolean isMan;
    public String phone;

    public User(String name) {
        this.name = name;
    }
}
