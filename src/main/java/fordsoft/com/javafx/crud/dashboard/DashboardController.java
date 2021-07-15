/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fordsoft.com.javafx.crud.dashboard;

import fordsoft.com.javafx.crud.model.Student;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author odofintimothy
 */
public class DashboardController implements Initializable {
    
    @FXML
    private TableView<Student> tabData;
    @FXML
    private TableColumn<Student, String> namecol;
    @FXML
    private TableColumn<Student, String> emailcol;
    @FXML
    private TableColumn<Student, String> phonecol;
    @FXML
    private TableColumn<Student, String> gendercol;
    @FXML
    private TableColumn<Student, Date> datecol;
    @FXML
    private TableColumn<Student, Double> feecol;
    ObservableList<Student> list;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        list = FXCollections.observableArrayList();
        setColumnProperty();
        tabData.setItems(list);
        // TODO
    }    

    public void setColumnProperty() {
        namecol.setCellValueFactory(new PropertyValueFactory<>("name"));
        emailcol.setCellValueFactory(new PropertyValueFactory<>("email"));
        phonecol.setCellValueFactory(new PropertyValueFactory<>("phone"));
        gendercol.setCellValueFactory(new PropertyValueFactory<>("gender"));
        datecol.setCellValueFactory(new PropertyValueFactory<>("datecreated"));
        feecol.setCellValueFactory(new PropertyValueFactory<>("fee"));
        
    }
}
