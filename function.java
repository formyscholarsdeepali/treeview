package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

public class function implements Initializable{
	@FXML
	private TreeView<String> tree;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		TreeItem<String> ob=new TreeItem<>("Desktop");
		TreeItem<String> ob1=new TreeItem<>("Java");
		TreeItem<String> ob2=new TreeItem<>("pycharm");
		TreeItem<String> ob3=new TreeItem<>("Softwares");
		ob.getChildren().addAll(ob1,ob2,ob3);
		
		TreeItem<String> ob4=new TreeItem<>("p1");
		TreeItem<String> ob5=new TreeItem<>("p2");
		TreeItem<String> ob6=new TreeItem<>("p3");
		ob2.getChildren().addAll(ob4,ob5);
		tree.setRoot(ob);
		
		
		
	}

}
