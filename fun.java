package com.example.javafxproject;
import javafx.application.Application;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
public class fun extends Application {
 public static void main(String[] args){
 launch(args);
 }
 public void start(Stage stage1){
 ToggleGroup tgcolor = new ToggleGroup();
 RadioButton clrred = new RadioButton("Red");
 RadioButton clrylw = new RadioButton("Yellow");
 RadioButton clrblk = new RadioButton("Black");
 RadioButton clrorg = new RadioButton("Orange");
 RadioButton clrgrn = new RadioButton("Green");
 clrred.setToggleGroup(tgcolor);
 clrylw.setToggleGroup(tgcolor);
 clrblk.setToggleGroup(tgcolor);
 clrorg.setToggleGroup(tgcolor);
 clrgrn.setToggleGroup(tgcolor);
 HBox hb1 = new HBox();
 hb1.getChildren().addAll(clrred, clrylw, clrblk, clrorg, clrgrn);
 hb1.setSpacing(5);
 hb1.setPadding(new Insets(5));
 Label lb1 = new Label("Programming is FUN");
 lb1.setFont(Font.font(20));
 lb1.setLayoutX(40);
 lb1.setLayoutY(20);
 clrred.setOnAction(e -> {
 lb1.setTextFill(Color.RED);
 });
 clrylw.setOnAction(e -> {
 lb1.setTextFill(Color.YELLOW);
 });
 clrblk.setOnAction(e -> {
 lb1.setTextFill(Color.BLACK);
 });
 clrorg.setOnAction(e -> {
 lb1.setTextFill(Color.ORANGE);
 });
 clrgrn.setOnAction(e -> {
 lb1.setTextFill(Color.GREEN);
 });
 Button btleft = new Button("<–");
 Button btright = new Button("–>");
 btleft.setOnAction(e -> {
 lb1.setPadding(new Insets(lb1.getPadding().getTop(),
 lb1.getPadding().getRight(),
 lb1.getPadding().getBottom(),
 lb1.getPadding().getLeft() - 10));
 });
 btright.setOnAction(e -> {
 lb1.setPadding(new Insets(lb1.getPadding().getTop(),
 lb1.getPadding().getRight(),
 lb1.getPadding().getBottom(),
 lb1.getPadding().getLeft()+ 10));
 });
 HBox hb2 = new HBox();
 hb2.getChildren().addAll(btleft, btright);
 hb2.setAlignment(Pos.CENTER);
 hb2.setSpacing(10);
 hb2.setPadding(new Insets(5));
 VBox vb1 = new VBox();
 vb1.getChildren().addAll(hb1, lb1, hb2);
 vb1.setSpacing(5);
 vb1.setPadding(new Insets(5, 5, 5, 5));
 Scene scene1 = new Scene(vb1);
 stage1.setTitle("Assignment3(a)");
 stage1.setScene(scene1);
 stage1.show();
 }
}
