module golf.golf_group {
  requires javafx.controls;
  requires javafx.fxml;


  opens golf.golf_group to javafx.fxml;
  exports golf.golf_group;
}