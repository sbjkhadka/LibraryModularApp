module inventory {
    // If any module requires inventory then, that module will automatically get access to bookapi
    requires transitive bookapi;

    // com.inventory package is made available to use outside of this module
    exports com.inventory;

    // makes com.inventory available to reports in the runtime (not so frequent in exams)
    opens com.inventory to reports;
}