package Module1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CallAttendant extends Application {
	private Label Seat1 = new Label("Seat 1 Light Off");
	private Label Seat2 = new Label("Seat 2 Light Off");
	private Label Seat3 = new Label("Seat 3 Light Off");
	private Label Seat4 = new Label("Seat 4 Light Off");
	private Label Seat5 = new Label("Seat 5 Light Off");
	private Button Seat_1 = new Button("Seat 1");
	private Button Seat_2 = new Button("Seat 2");
	private Button Seat_3 = new Button("Seat 3");
	private Button Seat_4 = new Button("Seat 4");
	private Button Seat_5 = new Button("Seat 5");
	private Button AttButton = new Button("Attendants");



	@Override
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		gridPane.setHgap(5);
		gridPane.setVgap(5);
		gridPane.add(Seat_1, 0, 0);
		gridPane.add(Seat1, 1, 0);
		gridPane.add(Seat_2, 0, 1);
		gridPane.add(Seat2, 1, 1);
		gridPane.add(Seat_3, 0, 2);
		gridPane.add(Seat3, 1, 2);
		gridPane.add(Seat_4, 0, 3);
		gridPane.add(Seat4, 1, 3);
		gridPane.add(Seat_5, 0, 4);
		gridPane.add(Seat5, 1, 4);
		gridPane.add(AttButton, 0, 5);
		
		
		Seat_1.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				Seat1Light();
				
			}
			
		});
		
		Seat_2.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				Seat2Light();
				
			}
			
		});
		Seat_3.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				Seat3Light();
				
			}
			
		});
		Seat_4.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				Seat4Light();
				
			}
			
		});
		Seat_5.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				Seat5Light();
				
			}
			
		});
		AttButton.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent arg0) {
				AttLightButton();
				
			}
			
		});
		
		
		Scene scene = new Scene(gridPane, 300, 200);
		primaryStage.setTitle("Call Attendant Buttons");
		primaryStage.setScene(scene);
		primaryStage.show();		
		
	
		
	}
		protected void Seat1Light() {
			CallAttendant seatlight1 = new CallAttendant();
			String seat1light;
			if (Seat1.getText() == null || Seat1.getText().length() >= 0) {
				Seat1.setText("Seat 1 Light On");
				
			}
			
	}
		protected void Seat2Light() {
			CallAttendant seatlight2 = new CallAttendant();
			String seat2light;
			if (Seat2.getText() == null || Seat2.getText().length() >= 0) {
				Seat2.setText("Seat 2 Light On");
			}
		}
		protected void Seat3Light() {
			CallAttendant seatlight3 = new CallAttendant();
			String seat3light;
			if (Seat3.getText() == null || Seat3.getText().length() >= 0) {
				Seat3.setText("Seat 3 Light On");
			}
		}
		protected void Seat4Light() {
			CallAttendant seatlight4 = new CallAttendant();
			String seat4light;
			if (Seat4.getText() == null || Seat4.getText().length() >= 0) {
				Seat4.setText("Seat 4 Light On");
			}
		}
		protected void Seat5Light() {
			CallAttendant seatlight5 = new CallAttendant();
			String seat5light;
			if (Seat5.getText() == null || Seat5.getText().length() >= 0) {
				Seat5.setText("Seat 5 Light On");
			}
		}
		protected void AttLightButton() {			
			if (Seat1.getText() == null || Seat1.getText().length() > 0) {
				Seat1.setText("Seat 1 Light Off");
			}
			if (Seat2.getText() == null || Seat2.getText().length() > 0) {
				Seat2.setText("Seat 2 Light Off");
			}
			if (Seat3.getText() == null || Seat3.getText().length() > 0) {
				Seat3.setText("Seat 3 Light Off");
			}
			if (Seat4.getText() == null || Seat4.getText().length() > 0) {
				Seat4.setText("Seat 4 Light Off");
			}
			if (Seat5.getText() == null || Seat5.getText().length() > 0) {
				Seat5.setText("Seat 5 Light Off");
			}
		}
		public static void main(String[] args) {
			Application.launch(args);
		
		
	}
	
		
		
	
}