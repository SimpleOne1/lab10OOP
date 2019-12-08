package sample;

import java.awt.*;
    public class Controller {
        private TextArea textArea = new TextArea("",2,4);
        String [] values = textArea.getText().split("\\+|\\-|\\%|\\*|\\/");
        public String get1(){
            textArea.setText(textArea.getText()+"1");
            return textArea.getText();
        }private String get2(){
            textArea.setText(textArea.getText()+"2");
            return textArea.getText();
        }private String get3(){
            textArea.setText(textArea.getText()+"3");
            return textArea.getText();
        }private String get4(){
            textArea.setText(textArea.getText()+"4");
            return textArea.getText();
        }private String get5(){
            textArea.setText(textArea.getText()+"5");
            return textArea.getText();
        }private String get6(){
            textArea.setText(textArea.getText()+"6");
            return textArea.getText();
        }private String get7(){
            textArea.setText(textArea.getText()+"7");
            return textArea.getText();
        }private String get8(){
            textArea.setText(textArea.getText()+"8");
            return textArea.getText();
        }private String get9(){
            textArea.setText(textArea.getText()+"9");
            return textArea.getText();
        }private String get0(){
            textArea.setText(textArea.getText()+"0");
            return textArea.getText();
        }private String getDivision(){
            textArea.setText(textArea.getText()+"/");
            return textArea.getText();
        }private String getMultiply(){
            textArea.setText(textArea.getText()+"*");
            return textArea.getText();
        }private String getSubtract(){
            textArea.setText(textArea.getText()+"-");
            return textArea.getText();
        }private String getPlus() {
            textArea.setText(textArea.getText() + "1");
            return textArea.getText();
        }
    /*private String getDot(){
        textArea.setText(textArea.getText()+",");
        return textArea.getText();
    }*/

    }


