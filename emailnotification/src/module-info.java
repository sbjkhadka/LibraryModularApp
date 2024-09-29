// This module does not need to be exported as this is a concrete implementation of NotificationService
module emailnotification {
    // Depends on NotificationService
    requires notificationservice;

    // Provides concrete implementation of NotificationService
    provides com.notificationservice.NotificationService with com.emailnotification.EmailNotification;
}
