import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.application.Application;
import javafx.geometry.*;


public class main extends Application {
    
    @Override
    public void start(Stage ms){
     
        FlowPane root = new FlowPane();
        
        Label la1 = new Label("Number 1: ");
        Label la2 = new Label("Number 2: ");
        Label la3 = new Label("Results: ");
        
        TextField textf1 = new TextField();
        TextField textf2 = new TextField();
        TextField textf3 = new TextField();
        textf3.setEditable(false);
        textf3.setPrefColumnCount(15);
        
        Button btAdd = new Button("Add");
        Button btSub = new Button("Subtract");
        Button btMul = new Button("Multiply");
        Button btDiv = new Button("Divide");
        
        root.setAlignment(Pos.CENTER);
        root.setVgap(5);
        root.setHgap(2);
        
        root.getChildren().addAll(la1,textf1,la2,textf2,la3,textf3);
        root.getChildren().addAll(btAdd,btSub,btMul,btDiv);
        
        btAdd.setOnAction(e -> textf3.setText(Double.parseDouble(textf1.getText())+
                Double.parseDouble(textf2.getText())+""));
        
        btSub.setOnAction(e -> textf3.setText(Double.parseDouble(textf1.getText())-
                Double.parseDouble(textf2.getText())+""));
        
        btMul.setOnAction(e -> textf3.setText(Double.parseDouble(textf1.getText())*
                Double.parseDouble(textf2.getText())+""));
        
        btDiv.setOnAction(e -> textf3.setText(Double.parseDouble(textf1.getText())/
                Double.parseDouble(textf2.getText())+""));
        
        Scene s1 = new Scene(root,250,150);
        ms.setScene(s1);
        ms.setTitle("Calculator");
        ms.show();
    }
    
    public static void main(String[]args){
        
        Application.launch(args);
    }
}
    