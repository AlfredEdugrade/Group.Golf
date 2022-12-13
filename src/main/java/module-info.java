module golf.golf_group {

  requires javafx.controls;
  requires javafx.fxml;
  requires java.persistence;

  opens golf.golf_group to javafx.fxml;
  exports golf.golf_group;
  exports golf.golf_group.Classes;
  opens golf.golf_group.Classes to javafx.fxml;
}