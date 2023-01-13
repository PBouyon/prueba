module com.example.mongo {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mongodb.bson;
    requires org.mongodb.driver.core;
    requires org.mongodb.driver.sync.client;

    opens com.example.mongo to javafx.fxml;
    exports com.example.mongo;
}