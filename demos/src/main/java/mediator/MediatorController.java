package mediator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;

import java.util.Optional;

public class MediatorController {

    @FXML
    private ListView<String> fromListView;

    @FXML
    private ListView<String> toListView;

    private ListMediator mediator;

    @FXML
    public void initialize() {
        ObservableList<String> from = FXCollections.observableArrayList("Java", "Python", "JavaScript", "PHP");
        fromListView.setItems(from);
        ObservableList<String> to = FXCollections.observableArrayList();
        toListView.setItems(to);
        mediator = new ListMediator(from, to);
    }

    public void addButtonHasPressed() {
        Optional.ofNullable(fromListView.getSelectionModel().getSelectedItem())
            .ifPresent(mediator::add);
    }

    public void addAllButtonHasPressed(ActionEvent actionEvent) {
        mediator.addAll();
    }

    public void removeButtonHasPressed(ActionEvent actionEvent) {
        Optional.ofNullable(toListView.getSelectionModel().getSelectedItem())
                .ifPresent(mediator::remove);
    }

    public void removeAllButtonHasPressed(ActionEvent actionEvent) {
        mediator.removeAll();
    }
}
