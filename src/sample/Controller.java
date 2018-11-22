package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    Button addButton;
    @FXML
    Button subButton;
    @FXML
    Button multiButton;
    @FXML
    Button divideButton;
    @FXML
    Button equalsButton;
    @FXML
    Button clearButton;
    @FXML
    Button sqButton;
    @FXML
    Button sqrtButton;
    @FXML
    Button dotButton;

    @FXML
    Label outputLabel;

    @FXML
    Button button1;
    @FXML
    Button button2;
    @FXML
    Button button3;
    @FXML
    Button button4;
    @FXML
    Button button5;
    @FXML
    Button button6;
    @FXML
    Button button7;
    @FXML
    Button button8;
    @FXML
    Button button9;
    @FXML
    Button button0;


    private String a;
    private String b;
    private String operator;

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @FXML
    public void processAddButton(ActionEvent event) {
        if(a != null) {
            setOperator("+");
            setB(outputLabel.getText());
            outputLabel.setText("");
        }
    }
    @FXML
    public void processSubButton(ActionEvent event) {
        if(a != null) {
            setOperator("-");
            setB(outputLabel.getText());
            outputLabel.setText("");
        }
    }
    @FXML
    public void processMultiButton(ActionEvent event) {
        if(a != null) {
            setOperator("*");
            setB(outputLabel.getText());
            outputLabel.setText("");
        }
    }
    @FXML
    public void processDivideButton(ActionEvent event) {
        if(a != null) {
            setOperator("/");
            setB(outputLabel.getText());
            outputLabel.setText("");
        }
    }
    @FXML
    public void processSqButton(ActionEvent event) {
        if(a != null) {
            setB(outputLabel.getText());
            double result;
            double numB = Double.parseDouble(b);
            result = numB*numB;
            outputLabel.setText(String.valueOf(result));
        }
    }
    @FXML
    public void processSqrtButton(ActionEvent event) {
        if(a != null) {
            setB(outputLabel.getText());
            double result;
            double numB = Double.parseDouble(b);
            result = Math.sqrt(numB);
            outputLabel.setText(String.valueOf(result));

        }
    }

    @FXML
    public void processEqualsButton(ActionEvent event) {

        if (operator != null) {


            double numA = Double.parseDouble(a);
            double numB = Double.parseDouble(b);
            double result;

            switch (operator) {
                case "+":
                    result = numB + numA;
                    outputLabel.setText(String.valueOf(result));

                    break;
                case "-":
                    result = numB - numA;
                    outputLabel.setText(String.valueOf(result));

                    break;
                case "*":
                    result = numB * numA;
                    outputLabel.setText(String.valueOf(result));

                    break;
                case "/":
                    if(numA==0) {
                        outputLabel.setText("Error");
                    }
                    else {
                        result = numB / numA;
                        outputLabel.setText(String.valueOf(result));

                    }
                        break;
                case "sq":
                    result = numB * numA;
                    outputLabel.setText(String.valueOf(result));

                        break;

            }

            setA("");
            setB("");
            setOperator("");
        }


    }
    @FXML
    public void processClearButton(ActionEvent event) {
        setOperator("");
        outputLabel.setText("");
        setA("");

    }


    @FXML
    public void processButton1(ActionEvent event){
        outputLabel.setText(outputLabel.getText()+"1");
        setA(outputLabel.getText());

    }
    @FXML
    public void processButton2(ActionEvent event){
        outputLabel.setText(outputLabel.getText()+"2");
        setA(outputLabel.getText());
    }
    @FXML
    public void processButton3(ActionEvent event){
        outputLabel.setText(outputLabel.getText()+"3");
        setA(outputLabel.getText());
    }
    @FXML
    public void processButton4(ActionEvent event){
        outputLabel.setText(outputLabel.getText()+"4");
        setA(outputLabel.getText());
    }
    @FXML
    public void processButton5(ActionEvent event){
        outputLabel.setText(outputLabel.getText()+"5");
        setA(outputLabel.getText());
    }
    @FXML
    public void processButton6(ActionEvent event){
        outputLabel.setText(outputLabel.getText()+"6");
        setA(outputLabel.getText());
    }
    @FXML
    public void processButton7(ActionEvent event){
        outputLabel.setText(outputLabel.getText()+"7");
        setA(outputLabel.getText());
    }
    @FXML
    public void processButton8(ActionEvent event){
        outputLabel.setText(outputLabel.getText()+"8");
        setA(outputLabel.getText());
    }
    @FXML
    public void processButton9(ActionEvent event){
        outputLabel.setText(outputLabel.getText()+"9");
        setA(outputLabel.getText());
    }
    @FXML
    public void processButton0(ActionEvent event){
        outputLabel.setText(outputLabel.getText()+"0");
        setA(outputLabel.getText());
    }
    @FXML
    public void processDotButton(ActionEvent event){
        if(!outputLabel.getText().contains(".")) {
            outputLabel.setText(outputLabel.getText() + ".");
            setA(outputLabel.getText());
        }
    }

}
