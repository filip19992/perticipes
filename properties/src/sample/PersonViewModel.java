package sample;

import javafx.beans.binding.When;
import javafx.beans.property.*;
import javafx.beans.value.ObservableValue;

public class PersonViewModel {

    private StringProperty nameProperty = new SimpleStringProperty();

    private BooleanProperty nameOkProperty = new SimpleBooleanProperty(false);

    private StringProperty surnameProperty = new SimpleStringProperty();

    private BooleanProperty disableSurnameProperty = new SimpleBooleanProperty(true);

    private BooleanProperty surnameOkProperty = new SimpleBooleanProperty(false);

    private IntegerProperty yearProperty = new SimpleIntegerProperty();

    private BooleanProperty confirmProperty = new SimpleBooleanProperty(false);

    private StringProperty ageProperty = new SimpleStringProperty();

    private BooleanProperty buttonProperty = new SimpleBooleanProperty(true);

    private IntegerProperty actualYearProperty = new SimpleIntegerProperty();

    private IntegerProperty yourAgeProperty = new SimpleIntegerProperty();

    public PersonViewModel() {
       nameOkProperty.bind(nameProperty.isNotEmpty());
       surnameOkProperty.bind(surnameProperty.isNotEmpty());
       disableSurnameProperty.bind(nameProperty.isEmpty());
       buttonProperty.bind(confirmProperty.not());
        ageProperty.bind(new When(yearProperty.isNotEqualTo(0))
                .then(actualYearProperty.subtract(yearProperty).asString()).otherwise(""));

    }

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
