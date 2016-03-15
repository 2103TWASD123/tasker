package Controllers;

import java.io.IOException;

import org.jdom2.JDOMException;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class MainGUIController {
	
    @FXML 
    public CommandLineController commandLineController;  
    @FXML 
    public ListInterfaceController todoListController;   
    @FXML 
    public ClassController classListController;
    @FXML 
    public TitleInterfaceController titleController;
    @FXML
    public SupportFeatureController supportFeatureController;
    
    @FXML 
    public AnchorPane mainAnchorPane;
    
    public void initialize() throws IOException, JDOMException {
       commandLineController.init(this);
       classListController.init(this);
       titleController.init(this);
       todoListController.init(this);
       supportFeatureController.init(this);
    }
    
    public void refreshClassList() {
    	classListController.loopClassList();
    }
    
    public void clearCompleted() {
    	classListController.clearCompletedClassList();
    }
    
    public void loadCompleted() {
    	classListController.initCompletedClassList();
    }
    
    public void refreshToDoList() throws IOException, JDOMException {
    	todoListController.loopTaskList();
    }
    
    public void removeMainPane() {
    	supportFeatureController.removeMainPane();
    }
    
    public void openMainPane() {
    	supportFeatureController.showMainPane();
    }
    
    public boolean isClassEmpty() {
    	return classListController.getClasses().isEmpty();
    }
    
    public boolean isToDoListEmpty() {
    	return todoListController.getTasks().isEmpty();
    }
    
    public boolean isCompletedEmpty() {
    	return todoListController.getCompleted().isEmpty();
    }
    
    public boolean isMainPaneManaged() {
    	return supportFeatureController.getMainPane().isManaged();
    }
}