package sample;

import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;

public class PersonViewModel {

    private StringProperty nameProperty = new SimpleStringProperty();

    private BooleanProperty nameOkProperty = new SimpleBooleanProperty(true);

    private StringProperty surnameProperty = new SimpleStringProperty();

    private BooleanProperty disableSurnameProperty = new SimpleBooleanProperty();

    private BooleanProperty surnameOkProperty = new SimpleBooleanProperty();

    private IntegerProperty yearProperty = new SimpleIntegerProperty();

    private BooleanProperty confirmProperty = new SimpleBooleanProperty();

    private StringProperty ageProperty = new SimpleStringProperty();

    private BooleanProperty buttonProperty = new SimpleBooleanProperty();

    private IntegerProperty actualYearProperty = new SimpleIntegerProperty();

    public StringProperty getNameProperty() {
        return nameProperty;
    }


    public StringProperty getSurnameProperty() {
        return surnameProperty;
    }

    public BooleanProperty getDisableSurnameProperty() {
        return disableSurnameProperty;
    }

    public IntegerProperty getYearProperty() {
        return yearProperty;
    }

    public BooleanProperty getConfirmProperty() {
        return confirmProperty;
    }

    public StringProperty getAgeProperty(){
        return ageProperty;
    }

    public BooleanProperty getNameOkProperty() {
        return nameOkProperty;
    }


    public BooleanProperty getSurnameOkProperty() {
        return surnameOkProperty;
    }

    public BooleanProperty getButtonProperty(){
        return  buttonProperty;
    }

}
