package com.dis.notification.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id", scope = Notification.class)
public class Notification implements Serializable {

    // {
    //     title: string;
    //     message: string;
    //     date: string: Date.toString();
    //     priority: string: low, medium, high;
    //     type: string: reminder, alert, message;
    // }

    private String title;
    private String message;
    private String timestamp;
    private String priority;
    private String type;

    public Notification(String title, String message, String timestamp, String priority, String type) {
        this.title = title;
        this.message = message;
        this.timestamp = timestamp;
        this.priority = priority;
        this.type = type;
    }

    public Notification() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Notification{" + "title='" + title + '\'' + ", message='" + message + '\'' + ", timestamp='" + timestamp + '\'' + ", priority='" + priority + '\'' + ", type='" + type + '\'' + '}';
    }
}
