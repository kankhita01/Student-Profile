module com.tutorialproject.student_profile_maker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.tutorialproject.student_profile_maker to javafx.fxml;
    exports com.tutorialproject.student_profile_maker;
}