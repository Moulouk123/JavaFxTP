package application;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class Hello extends Application {
	
	

		@Override
		public void start(Stage primaryStage) {
			primaryStage.setTitle("Authentication with Style ");
			GridPane root=new GridPane();
			Button b1=new Button("Sign In");
			Button b2=new Button("Sign Out");
			root.setAlignment(Pos.CENTER);
			Text Mess1=new Text("welcome");
			Label Mess2=new Label("Username");
			Label Mess3=new Label("Password");
			TextField In1=new TextField();
			PasswordField In2=new PasswordField();
			root.add(Mess1,0,0);
			root.add(Mess2,0,1);
			root.add(Mess3,0,2);
			root.add(In1,1,1);
			root.add(In2,1,2);
			root.add(b1,0,5);
			root.add(b2,1,5);
			root.setHgap(10);
			root.setVgap(10);
			Scene scene = new Scene(root,400,400);
			root.setPadding(new Insets(25, 25, 25, 25)) ;
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();

		}
		
		public static void main(String[] args) {
			launch(args);
		}
	}


