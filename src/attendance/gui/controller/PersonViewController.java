/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance.gui.controller;

import attendance.gui.util.StringLibrary;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author Adam
 */
public abstract class PersonViewController implements Initializable
{

    @FXML
    private AnchorPane anchorPane;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }

    @FXML
    private void handleLogOut(ActionEvent event)
    {
        try
        {
            Stage stage;
            Parent root;
            stage = (Stage) anchorPane.getScene().getWindow();
            root = FXMLLoader.load(getClass().getClassLoader().getResource(StringLibrary.LOGIN_VIEW_PATH));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e)
        {
            //TODO catch
        }
    }
}
