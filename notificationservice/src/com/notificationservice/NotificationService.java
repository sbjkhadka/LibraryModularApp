package com.notificationservice;

public interface NotificationService {
    // This is an abstract of any notification so user can implement it accordingly
    String getName();
    void sendNotification(String message);
}
