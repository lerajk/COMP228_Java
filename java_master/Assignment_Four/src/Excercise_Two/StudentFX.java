package Excercise_Two;

/**
 * Created by Leonardo on 11/15/16.
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.scene.Scene;

import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class StudentFX extends Application {
    private BorderPane borderPane;
    private GridPane empPanel;
    private Label lblFirstName, lblLastName, lblEmail, lblpostal, lblcity, lblprovince, lblphone;
    private TextField txtFirstName, txtLastName, txtEmail, txtpostal, txtcity, txtprovince, txtphone;
    private Button btnDisplay, btnChangeStyle;
    private VBox lngBox;
    private VBox lngBox2;

    private static final String[] names2 =
            {"Java", "Python", "C#"};
    private static final String[] names =
            {"Finance", "Accounting", "Marketing"};

    private TextArea tArea;
    private ToggleGroup group;
    private RadioButton rb1, rb2;

    //obserble list to store values in combobox
    ObservableList<String> options =
            FXCollections.observableArrayList(names);

    // creating combobox
    ComboBox comboBox = new ComboBox(options);

    // list view to store selected value from combobox
    ListView<String> lv = new ListView<>(FXCollections.observableArrayList());

    public StudentFX() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        borderPane = new BorderPane();
        //create the grid pane for entries
        empPanel = new GridPane();
        empPanel.setHgap(5);
        empPanel.setVgap(5);


        //create labels
        lblFirstName = new Label("First Name:");
        lblLastName = new Label("Last Name:");
        lblEmail = new Label("Email:");
        lblpostal = new Label("Postal:");
        lblcity = new Label("City:");
        lblprovince = new Label("Province:");
        lblphone = new Label("Phone:");

        //create text fields
        txtFirstName = new TextField();
        txtLastName = new TextField();
        txtEmail = new TextField();
        txtpostal = new TextField();
        txtcity = new TextField();
        txtprovince = new TextField();
        txtphone = new TextField();

        //create buttons
        btnDisplay = new Button("Display");
        btnChangeStyle = new Button("Change Style");

        //add controls to grid pane on left side
        empPanel.add(lblFirstName, 0, 0);
        empPanel.add(txtFirstName, 1, 0);
        empPanel.add(lblLastName, 0, 1);
        empPanel.add(txtLastName, 1, 1);
        empPanel.add(lblEmail, 0, 2);
        empPanel.add(txtEmail, 1, 2);

        empPanel.add(lblpostal, 0, 3);
        empPanel.add(txtpostal, 1, 3);
        empPanel.add(lblcity, 0, 4);
        empPanel.add(txtcity, 1, 4);
        empPanel.add(lblprovince, 0, 5);
        empPanel.add(txtprovince, 1, 5);
        empPanel.add(lblphone, 0, 6);
        empPanel.add(txtphone, 1, 6);


        empPanel.add(btnChangeStyle, 0, 7);
        empPanel.add(btnDisplay, 1, 7);

        //align buttons in grid pane
        GridPane.setHalignment(btnDisplay, HPos.RIGHT);
        GridPane.setHalignment(btnChangeStyle, HPos.LEFT);

        //create the toggle group to group radio buttons
        group = new ToggleGroup();

        //create radio buttons and add them to the toggle group
        rb1 = new RadioButton("Business");
        rb1.setToggleGroup(group);

        //rb1.setSelected(true);
        rb2 = new RadioButton("Computer");
        rb2.setToggleGroup(group);


        //checkboxes
        CheckBox council = new CheckBox("Student Council");
        CheckBox vol = new CheckBox("Volunteer");

        //create the text area
        tArea = new TextArea();

        //setting rows for combo box
        comboBox.setVisibleRowCount(3);



        // populating the right combo box according to the radio buttons
        rb2.setOnAction(e -> {
            if (rb2.isSelected()) {
                lv.getItems().clear();
                comboBox.setItems(FXCollections.observableArrayList(names2));

            }
        });

        rb1.setOnAction(e -> {
            if (rb1.isSelected()) {

                lv.getItems().clear();
                comboBox.setItems(FXCollections.observableArrayList(names));
            }
        });

        //event for combo box and list view
        comboBox.setOnAction(e -> {
            if (comboBox.getValue() != null && !lv.getItems().contains(comboBox.getValue())) {

                lv.getItems().add((String) comboBox.getValue());

            }
        });


        // Create a scroll pane to hold the text area
        ScrollPane scrollPane = new ScrollPane(tArea);

        //handle click events
        btnDisplay.setOnAction(e -> displayEntries(council, vol));
        btnChangeStyle.setOnAction(e -> changeAppearance(tArea));


        //place grid pane in the left of border pane
        borderPane.setLeft(empPanel);


        lngBox = new VBox();
        lngBox2 = new VBox();


        //set the style
        lngBox.setStyle("-fx-padding: 5;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: black;");

        //set the style
        lngBox2.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: black;");

        //set the title of box pane

        lngBox.getChildren().addAll(rb1, rb2, comboBox, lv);
        borderPane.setRight(lngBox);

        lngBox2.getChildren().addAll(council, vol);
        borderPane.setCenter(lngBox2);

        //set the scroll pane to the bottom of border pane
        borderPane.setBottom(scrollPane);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 700, 500);
        primaryStage.setTitle("Student Info"); // Set title
        primaryStage.setScene(scene); // Place the scene in the stage
        primaryStage.show(); // Display the stage

    }

    // display entries in text area
    public void displayEntries(CheckBox a, CheckBox b) {
        //
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String email = txtEmail.getText();
        String postal = txtpostal.getText();
        String city = txtcity.getText();
        String province = txtprovince.getText();
        String phone = txtphone.getText();
        String vol = " ";
        String con = " ";

        // for check boxes
        if (b.isSelected()) {
            vol = b.getText();
        }

        if (a.isSelected()){
            con = a.getText();
        }

        //for the list and combobox

        String d = rb2.isSelected() ? " Computer" : " Business";
        for (String c : lv.getItems())
        {
            d += "  " + c;
        }


        tArea.appendText(firstName + "\n" +
                lastName + "\n" + email + "\n" + postal + "\n" + city + "\n" + province + "\n" + phone + "\n" + vol + "\n" + con + "\n" + d);


    }

    public void changeAppearance(Control control) {

        control.setStyle(
                "-fx-font: 16px Serif;" +
                        "-fx-font-weight: bold;" +
                        "-fx-text-fill: blue;" +
                        "-fx-background-color: #CCFF99;");

    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);

    }

}
