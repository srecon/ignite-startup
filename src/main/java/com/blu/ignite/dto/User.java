package com.blu.ignite.dto;

import java.io.Serializable;

/**
 * Created by shamim on 15/02/16.
 */
public class User implements Serializable {
    private String id;
    private String uName;
    private String uTitle;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuTitle() {
        return uTitle;
    }

    public void setuTitle(String uTitle) {
        this.uTitle = uTitle;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User users = (User) o;

        if (!id.equals(users.id)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
