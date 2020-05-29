package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.NodeOrientation;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class Main extends Application {

    double totalCost;
    int timePressed=0;

    //adding HBox
    HBox hb_Container=new HBox();
    HBox hb_Buttons =new HBox();
    HBox hb_Items1 =new HBox();
    HBox hb_Items2=new HBox();
    HBox hb_Items3=new HBox();

    //Adding Buttons
    Button btn_Exit=new Button("Exit");;
    Button btn_Total=new Button("Total");
    Button btn_Reset=new Button("Reset");;
    Button btn_Receipt=new Button("Receipt");

    //Adding Check Boxes
    CheckBox cb1=new CheckBox("Item1");
    CheckBox cb2=new CheckBox("Item2");
    CheckBox cb3=new CheckBox("Item3");
    CheckBox cb4=new CheckBox("Item4");
    CheckBox cb5=new CheckBox("Item5");
    CheckBox cb6=new CheckBox("Item6");
    CheckBox cb7=new CheckBox("Item7");
    CheckBox cb8=new CheckBox("Item8");
    CheckBox cb9=new CheckBox("Item9");
    CheckBox cb10=new CheckBox("Item10");
    CheckBox cb11=new CheckBox("Item11");
    CheckBox cb12=new CheckBox("Item12");
    CheckBox cb13=new CheckBox("Item13");
    CheckBox cb14=new CheckBox("Item14");
    CheckBox cb15=new CheckBox("Item15");
    CheckBox cb16=new CheckBox("Item16");
    CheckBox cb17=new CheckBox("Item17");
    CheckBox cb18=new CheckBox("Item18");
    CheckBox cb19=new CheckBox("Item19");
    CheckBox cb20=new CheckBox("Item20");

    //Adding Text Fields
    TextField txt1=new TextField("0");
    TextField txt2=new TextField("0");
    TextField txt3=new TextField("0");
    TextField txt4=new TextField("0");
    TextField txt5=new TextField("0");
    TextField txt6=new TextField("0");
    TextField txt7=new TextField("0");
    TextField txt8=new TextField("0");
    TextField txt9=new TextField("0");
    TextField txt10=new TextField("0");
    TextField txt11=new TextField("0");
    TextField txt12=new TextField("0");
    TextField txt13=new TextField("0");
    TextField txt14=new TextField("0");
    TextField txt15=new TextField("0");
    TextField txt16=new TextField("0");
    TextField txt17=new TextField("0");
    TextField txt18=new TextField("0");
    TextField txt19=new TextField("0");
    TextField txt20=new TextField("0");

    TextField txtTotal=new TextField();


    Label lbl_Title=new Label("    Online Grocery Store    ");
    Label lbl_Item=new Label("Item");
    Label lbl_Quantity=new Label("Quantity");

    VBox vb_Items1 =new VBox();
    VBox vb_Items2=new VBox();
    VBox vb_Inputs1 =new VBox();
    VBox vb_Inputs2=new VBox();

    BorderPane a=new BorderPane();
    BorderPane b=new BorderPane();

    SplitPane root=new SplitPane(a, b);

    Scene shoppingScene, loginScene;

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Grocery Store");
        primaryStage.setHeight(700);
        primaryStage.setWidth(1300);

        Label loginMsg=new Label("Login to Continue");
        //loginScene=new Scene();

        //Set Buttons
        setButtons();

        //Set HBox
        setHBox();

        //set Check Boxes
        setCheckBoxes();

        //Set Label
        setLabels();

        //set VBox
        setVBox();

        //set Text Fields
        setTextFields();

        //Set panes
        setPanes();

        //add widgets
        addWidgets();

        //Actions
        ActionPerformed_Buttons();
        ActionPerformed_CheckBoxes();

        shoppingScene=new Scene(root, 1300, 700);
        primaryStage.setScene(shoppingScene);

        primaryStage.show();
    }

    public void setButtons(){
        btn_Exit.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-border-color: black; -fx-border-width: 3px;");
        btn_Exit.setPrefWidth(100);
        btn_Total.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-border-color: black; -fx-border-width: 3px; ");
        btn_Total.setPrefWidth(100);
        btn_Reset.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-border-color: black; -fx-border-width: 3px;");
        btn_Reset.setPrefWidth(100);
        btn_Receipt.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-border-color: black; -fx-border-width: 3px;");
        btn_Receipt.setPrefWidth(100);
    }

    public void setCheckBoxes(){
        cb1.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb1.setPrefWidth(100);
        cb1.setPrefHeight(20);

        cb2.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb2.setPrefWidth(100);
        cb2.setPrefHeight(20);

        cb3.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb3.setPrefWidth(100);
        cb3.setPrefHeight(20);

        cb4.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb4.setPrefWidth(100);
        cb4.setPrefHeight(20);

        cb5.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb5.setPrefWidth(100);
        cb5.setPrefHeight(20);

        cb6.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb6.setPrefWidth(100);
        cb6.setPrefHeight(20);

        cb7.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb8.setPrefWidth(100);
        cb9.setPrefHeight(20);

        cb10.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb10.setPrefWidth(100);
        cb10.setPrefHeight(20);

        cb11.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb11.setPrefWidth(100);
        cb11.setPrefHeight(20);

        cb12.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb12.setPrefWidth(100);
        cb12.setPrefHeight(20);

        cb13.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb13.setPrefWidth(100);
        cb13.setPrefHeight(20);

        cb14.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb14.setPrefWidth(100);
        cb14.setPrefHeight(20);

        cb15.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb15.setPrefWidth(100);
        cb15.setPrefHeight(20);

        cb16.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb16.setPrefWidth(100);
        cb16.setPrefHeight(20);

        cb17.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb17.setPrefWidth(100);
        cb17.setPrefHeight(20);

        cb18.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb18.setPrefWidth(100);
        cb18.setPrefHeight(20);

        cb19.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb19.setPrefWidth(100);
        cb19.setPrefHeight(20);

        cb20.setStyle("-fx-font-weight: bold; -fx-font-size: 15; -fx-wrap-text: true");
        cb20.setPrefWidth(100);
        cb20.setPrefHeight(20);
    }

    public void setLabels(){
        lbl_Title.setAlignment(Pos.TOP_CENTER);
        lbl_Title.setFont(new Font("Times New Roman", 50));
        lbl_Title.setStyle("-fx-background-color: black; -fx-text-fill: white; -fx-border-color: darkgray; -fx-border-width: 5");

        lbl_Item.setFont(new Font("Times New Roman", 20));
        lbl_Item.setStyle("-fx-font-weight: bold");

        lbl_Quantity.setFont(new Font("Times New Roman", 20));
        lbl_Quantity.setStyle("-fx-font-weight: bold; -fx-wrap-text: true");
        lbl_Quantity.setPrefWidth(100);
    }

    public void setHBox(){

        hb_Container.setPadding(new Insets(10));
        hb_Container.setSpacing(7);
        hb_Container.setPrefHeight(400);
        hb_Container.setPrefWidth(1250);


        hb_Items3.setPadding(new Insets(10));
        hb_Items3.setSpacing(1);
        hb_Items3.setPrefHeight(400);
        hb_Items3.setPrefWidth(400);
        hb_Items3.setStyle("-fx-border-color: darkgray; -fx-border-width: 5;");

        hb_Items1.setPadding(new Insets(10));
        hb_Items1.setSpacing(1);
        hb_Items1.setPrefHeight(400);
        hb_Items1.setPrefWidth(400);
        hb_Items1.setStyle("-fx-border-color: darkgray; -fx-border-width: 5;");

        hb_Items2.setPadding(new Insets(10));
        hb_Items2.setSpacing(1);
        hb_Items2.setPrefHeight(400);
        hb_Items2.setPrefWidth(400);
        hb_Items2.setStyle("-fx-border-color: darkgray; -fx-border-width: 5;");

        hb_Buttons.setAlignment(Pos.BOTTOM_LEFT);
        hb_Buttons.setPrefWidth(450);
        hb_Buttons.setPrefHeight(50);
        hb_Buttons.setPadding(new Insets(10, 10, 10, 10));
        hb_Buttons.setStyle("-fx-border-color: darkgray; -fx-border-width: 5;");
        hb_Buttons.setSpacing(50);

    }

    public void setVBox(){
        //setting vb_Items
        vb_Items1.setAlignment(Pos.CENTER_LEFT);
        vb_Items1.setPrefHeight(400);
        vb_Items1.setPrefWidth(400);
        vb_Items1.setSpacing(10);
        vb_Items1.setPadding(new Insets(10));

        vb_Items2.setAlignment(Pos.CENTER_LEFT);
        vb_Items2.setPrefHeight(400);
        vb_Items2.setPrefWidth(400);
        vb_Items2.setSpacing(10);
        vb_Items2.setPadding(new Insets(10));

        //Setting vb_Inputs
        vb_Inputs1.setAlignment(Pos.CENTER_RIGHT);
        vb_Inputs1.setPrefHeight(400);
        vb_Inputs1.setPrefWidth(250);
        vb_Inputs1.setSpacing(6);
        vb_Inputs1.setPadding(new Insets(10));

        vb_Inputs2.setAlignment(Pos.CENTER_RIGHT);
        vb_Inputs2.setPrefHeight(400);
        vb_Inputs2.setPrefWidth(250);
        vb_Inputs2.setSpacing(6);
        vb_Inputs2.setPadding(new Insets(10));
    }

    public void setTextFields() {
        txt1.setPrefWidth(100);
        txt1.setPrefHeight(20);
        txt1.setDisable(true);

        txt2.setPrefWidth(100);
        txt2.setPrefHeight(20);
        txt2.setDisable(true);

        txt3.setPrefWidth(70);
        txt3.setPrefHeight(20);
        txt3.setDisable(true);

        txt4.setPrefWidth(70);
        txt4.setPrefHeight(20);
        txt4.setDisable(true);

        txt5.setPrefWidth(70);
        txt5.setPrefHeight(20);
        txt5.setDisable(true);

        txt6.setPrefWidth(70);
        txt6.setPrefHeight(20);
        txt6.setDisable(true);

        txt7.setPrefWidth(100);
        txt7.setPrefHeight(20);
        txt7.setDisable(true);

        txt8.setPrefWidth(100);
        txt8.setPrefHeight(20);
        txt8.setDisable(true);

        txt9.setPrefWidth(100);
        txt9.setPrefHeight(20);
        txt9.setDisable(true);

        txt10.setPrefWidth(100);
        txt10.setPrefHeight(20);
        txt10.setDisable(true);

        txt11.setPrefWidth(100);
        txt11.setPrefHeight(20);
        txt11.setDisable(true);

        txt12.setPrefWidth(100);
        txt12.setPrefHeight(20);
        txt12.setDisable(true);

        txt13.setPrefWidth(100);
        txt13.setPrefHeight(20);
        txt13.setDisable(true);

        txt14.setPrefWidth(100);
        txt14.setPrefHeight(20);
        txt14.setDisable(true);

        txt15.setPrefWidth(100);
        txt15.setPrefHeight(20);
        txt15.setDisable(true);

        txt16.setPrefWidth(100);
        txt16.setPrefHeight(20);
        txt16.setDisable(true);

        txt17.setPrefWidth(100);
        txt17.setPrefHeight(20);
        txt17.setDisable(true);

        txt18.setPrefWidth(100);
        txt18.setPrefHeight(20);
        txt18.setDisable(true);

        txt19.setPrefWidth(100);
        txt19.setPrefHeight(20);
        txt19.setDisable(true);

        txt20.setPrefWidth(100);
        txt20.setPrefHeight(20);
        txt20.setDisable(true);


        txtTotal.setEditable(false);
    }

    public void setPanes(){
        a.setPrefSize(400, 600);
        b.setPrefSize(500, 600);
        root.setDividerPositions(0.058);
        root.setOrientation(Orientation.VERTICAL);
        root.setPadding(new Insets(10));
        a.setNodeOrientation(NodeOrientation.INHERIT);
        b.setNodeOrientation(NodeOrientation.INHERIT);

    }

    public void addWidgets(){
        hb_Buttons.getChildren().addAll(btn_Total, btn_Reset, btn_Receipt, btn_Exit);

        vb_Inputs1.getChildren().addAll(lbl_Quantity, txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10);
        vb_Items1.getChildren().addAll(lbl_Item, cb1, cb2,cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10);
        vb_Items2.getChildren().addAll(lbl_Item, cb11, cb12, cb13, cb14, cb15, cb16, cb17, cb18, cb19, cb20);
        vb_Inputs2.getChildren().addAll(lbl_Quantity, txt11, txt12, txt13, txt14, txt15, txt16, txt17, txt18, txt19, txt20);

        hb_Items1.getChildren().addAll(vb_Items1, vb_Inputs1);
        hb_Items2.getChildren().addAll(vb_Items2, vb_Inputs2);

        hb_Container.getChildren().addAll(hb_Items1, hb_Items2, hb_Items3);

        a.setTop(lbl_Title);
        b.setCenter(hb_Container);
        b.setBottom(hb_Buttons);

    }

    public void ActionPerformed_Buttons(){

        ItemInfo itemCost=new ItemInfo();
        btn_Exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        btn_Reset.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                resetAction(txt1, cb1);
                resetAction(txt2, cb2);
                resetAction(txt3, cb3);
                resetAction(txt4, cb4);
                resetAction(txt5, cb5);
                resetAction(txt6, cb6);
                resetAction(txt7, cb7);
                resetAction(txt8, cb8);
                resetAction(txt9, cb9);
                resetAction(txt10, cb10);
                resetAction(txt11, cb11);
                resetAction(txt12, cb12);
                resetAction(txt13, cb13);
                resetAction(txt14, cb14);
                resetAction(txt15, cb15);
                resetAction(txt16, cb16);
                resetAction(txt17, cb17);
                resetAction(txt18, cb18);
                resetAction(txt19, cb19);
                resetAction(txt20, cb20);
                totalCost=0;
                itemCost.totalAmount=0;

                for (int i=0; i<=5; i++){
                    itemCost.cost[i]=0;
                }
            }
        });


        btn_Total.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                timePressed++;
                double previousAmount=totalCost;
                itemCost.cost[0]=itemCost.ItemPrice[0] * Double.parseDouble(txt1.getText());
                itemCost.cost[1]=itemCost.ItemPrice[1] * Double.parseDouble(txt2.getText());
                itemCost.cost[2]=itemCost.ItemPrice[2] * Double.parseDouble(txt3.getText());
                itemCost.cost[3]=itemCost.ItemPrice[3] * Double.parseDouble(txt4.getText());
                itemCost.cost[4]=itemCost.ItemPrice[4] * Double.parseDouble(txt5.getText());
                itemCost.cost[5]=itemCost.ItemPrice[5] * Double.parseDouble(txt6.getText());
                itemCost.cost[6]=itemCost.ItemPrice[6] * Double.parseDouble(txt7.getText());
                itemCost.cost[7]=itemCost.ItemPrice[7] * Double.parseDouble(txt8.getText());
                itemCost.cost[8]=itemCost.ItemPrice[8] * Double.parseDouble(txt9.getText());
                itemCost.cost[9]=itemCost.ItemPrice[9] * Double.parseDouble(txt10.getText());
                itemCost.cost[10]=itemCost.ItemPrice[10] * Double.parseDouble(txt11.getText());
                itemCost.cost[11]=itemCost.ItemPrice[11] * Double.parseDouble(txt12.getText());
                itemCost.cost[12]=itemCost.ItemPrice[12] * Double.parseDouble(txt13.getText());
                itemCost.cost[13]=itemCost.ItemPrice[13] * Double.parseDouble(txt14.getText());
                itemCost.cost[14]=itemCost.ItemPrice[14] * Double.parseDouble(txt15.getText());
                itemCost.cost[15]=itemCost.ItemPrice[15] * Double.parseDouble(txt16.getText());
                itemCost.cost[16]=itemCost.ItemPrice[16] * Double.parseDouble(txt17.getText());
                itemCost.cost[17]=itemCost.ItemPrice[17] * Double.parseDouble(txt18.getText());
                itemCost.cost[18]=itemCost.ItemPrice[18] * Double.parseDouble(txt19.getText());
                itemCost.cost[19]=itemCost.ItemPrice[19] * Double.parseDouble(txt20.getText());

                totalCost=itemCost.getTotal();

                if(timePressed==0){
                    txtTotal.setText("Rs. "+String.valueOf(totalCost));
                }

                else
                    txtTotal.setText("Rs. "+String.valueOf(totalCost-previousAmount));
            }
        });
    }

    public void resetAction(TextField txt, CheckBox cb){
        txt.setText("0");
        txt.setDisable(true);
        cb.setSelected(false);
        txtTotal.clear();
    }

    public void checkbox_Disable(TextField txt, CheckBox cb){
        if(cb.isSelected()==true){
            txt.setDisable(false);
            txt.clear();
        }

        else
            txt.setDisable(true);
    }

    public void ActionPerformed_CheckBoxes(){

        cb1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt1, cb1);
            }
        });

        cb2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt2, cb2);
            }
        });

        cb3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt3, cb3);
            }
        });

        cb4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt4, cb4);
            }
        });

        cb5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt5, cb5);
            }
        });

        cb6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt6, cb6);
            }
        });
        cb7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt7, cb7);
            }
        });
        cb8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt8, cb8);
            }
        });
        cb9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt9, cb9);
            }
        });
        cb10.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt10, cb10);
            }
        });
        cb11.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt11, cb11);
            }
        });
        cb12.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt12, cb12);
            }
        });
        cb13.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt13, cb13);
            }
        });
        cb14.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt14, cb14);
            }
        });
        cb15.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt15, cb15);
            }
        });
        cb16.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt16, cb16);
            }
        });
        cb17.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt17, cb17);
            }
        });
        cb18.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt18, cb18);
            }
        });
        cb19.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt19, cb19);
            }
        });
        cb20.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                checkbox_Disable(txt20, cb20);
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }
}

