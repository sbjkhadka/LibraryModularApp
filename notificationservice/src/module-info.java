module notificationservice {
    // exports notification service package to be used by other modules
    exports com.notificationservice;

    // This module uses this service (Notice the full path of the service)
    uses com.notificationservice.NotificationService;
}
