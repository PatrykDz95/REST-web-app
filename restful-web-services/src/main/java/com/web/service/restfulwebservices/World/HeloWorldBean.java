package com.web.service.restfulwebservices.World;

public class HeloWorldBean {

    private String message;

    public HeloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HeloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
