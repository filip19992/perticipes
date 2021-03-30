package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;

public class Controller {
    @FXML
    private Label yourAgeIs;

    @FXML
    private TextField nameTextField;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField surnameTextField;

    @FXML
    private Label surnameLabel;

    @FXML
    private TextField yearTextField;

    @FXML
    private CheckBox confirmCheckBox;

    @FXML
    private Button logginButton;

    @FXML
    private Label ageLabel;

    private PersonViewModel personViewModel = new PersonViewModel();

    @FXML
    public void initialize(){
        nameTextField.textProperty().bindBidirectional(personViewModel.getNameProperty());
        surnameTextField.textProperty().bindBidirectional(personViewModel.getSurnameProperty());

        surnameTextField.disableProperty().bind(personViewModel.getDisableSurnameProperty());

        StringConverter converter = new NumberStringConverter();

        yearTextField.textProperty().bindBidirectional(personViewModel.getYearProperty(), converter);

        confirmCheckBox.selectedProperty().bindBidirectional(personViewModel.getConfirmProperty());

        ageLabel.textProperty().bindBidirectional(personViewModel.getAgeProperty());

        nameLabel.visibleProperty().bind(personViewModel.getNameOkProperty());
        surnameLabel.visibleProperty().bind(personViewModel.getSurnameOkProperty());

        logginButton.disableProperty().bind(personViewModel.getButtonProperty());


    }

}
