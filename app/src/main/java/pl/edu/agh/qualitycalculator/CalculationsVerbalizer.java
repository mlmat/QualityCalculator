package pl.edu.agh.qualitycalculator;

import android.text.TextUtils;

public class CalculationsVerbalizer {

    public String verbalize(Operation operation, float operand1, float operand2, float result) {
        if((operand2==0)&&(operation.equals(Operation.DIVIDE))){
            return "Error";
        }

        if(operation.equals(Operation.AVERAGE)){
            return operation.toString() + String.valueOf(result);
        }

        String verbalizedOperation = String.valueOf(operand1);
        verbalizedOperation += " " + operation.toString() + " ";
        verbalizedOperation += String.valueOf(operand2);
        verbalizedOperation += " gives value ";
        verbalizedOperation += String.valueOf(result);
        return verbalizedOperation;
    }
}
