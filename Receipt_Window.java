package sample;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Receipt_Window {


    public static void display(){

        Stage receiptStage=new Stage();

        receiptStage.setTitle("Receipt");
        receiptStage.setHeight(500);
        receiptStage.setWidth(350);
        receiptStage.initModality(Modality.APPLICATION_MODAL);

        Label lbl_Receipt=new Label();
        lbl_Receipt.setPrefSize(300, 450);
        lbl_Receipt.setStyle("-fx-font-family: 'Courier New'; -fx-font-size: 11");

        Calendar time=Calendar.getInstance();
        time.getTime();
        SimpleDateFormat timeFormat=new SimpleDateFormat("HH:mm:ss");
        timeFormat.format(time.getTime());
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
        dateFormat.format(time.getTime());

        ItemInfo price=new ItemInfo();

        lbl_Receipt.setText("\t\tOnline Grocery Store\n\n" + "Order ID:\t\t\n\n" + "*******************************************\n" +
                " NAME   \t"+" PRICE  \t"+"  QUANTITY\n\n"+ ((Main.cb1.isSelected() == true) ? Main.cb1.getText() + "  \t\tRs. " +price.ItemPrice[0] +"\t    x" + Main.txt1.getText() + "\n" : "") +
                (Main.cb2.isSelected() == true ? Main.cb2.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt2.getText() + "\n" : "") +
                (Main.cb3.isSelected() == true ? Main.cb3.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt3.getText() + "\n" : "") +
                (Main.cb4.isSelected() == true ? Main.cb4.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt4.getText() + "\n" : "") +
                (Main.cb5.isSelected() == true ? Main.cb5.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt5.getText() + "\n" : "") +
                (Main.cb6.isSelected() == true ? Main.cb6.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt6.getText() + "\n" : "") +
                (Main.cb7.isSelected() == true ? Main.cb7.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt7.getText() + "\n" : "") +
                (Main.cb8.isSelected() == true ? Main.cb8.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt8.getText() + "\n" : "") +
                (Main.cb9.isSelected() == true ? Main.cb9.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt9.getText() + "\n" : "") +
                (Main.cb10.isSelected() == true ? Main.cb10.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt10.getText() + "\n" : "") +
                (Main.cb11.isSelected() == true ? Main.cb11.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt11.getText() + "\n" : "") +
                (Main.cb12.isSelected() == true ? Main.cb12.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt12.getText() + "\n" : "") +
                (Main.cb13.isSelected() == true ? Main.cb13.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt13.getText() + "\n" : "") +
                (Main.cb14.isSelected() == true ? Main.cb14.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt14.getText() + "\n" : "") +
                (Main.cb15.isSelected() == true ? Main.cb15.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt15.getText() + "\n" : "") +
                (Main.cb16.isSelected() == true ? Main.cb16.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt16.getText() + "\n" : "") +
                (Main.cb17.isSelected() == true ? Main.cb17.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt17.getText() + "\n" : "") +
                (Main.cb18.isSelected() == true ? Main.cb18.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt18.getText() + "\n" : "") +
                (Main.cb19.isSelected() == true ? Main.cb19.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt19.getText() + "\n" : "") +
                (Main.cb20.isSelected() == true ? Main.cb20.getText() + "  \t\tRs. " +price.ItemPrice[1] +"\t    x" + Main.txt20.getText() + "\n" : "")
                + "\nTotal\t\t\t\t  " + Main.txtTotal.getText() +
                "\n\n*******************************************\n\n" + "Date:  " + dateFormat.format(time.getTime()) +
                "\t     Time:  "+timeFormat.format(time.getTime())
        );


        Button btn=new Button("OK");
        btn.setOnAction(actionEvent -> receiptStage.close());

        VBox vb=new VBox(10);
        vb.getChildren().addAll(lbl_Receipt, btn);
        vb.setPadding(new Insets(10));
        vb.setAlignment(Pos.CENTER);

        Scene scene=new Scene(vb);
        receiptStage.setScene(scene);
        receiptStage.showAndWait();


    }

}