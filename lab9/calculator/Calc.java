//1. WAP in java to create a Package Calculator in which a class CALC having various functions like add, subtract, multiplication, division, mod operations are performed. Now create another package called Let_Me_Calculate having a class called Calculate with main function. Create an object of CALC and call all the functions of the Calculator.

package calculator;

public class Calc {
    public float add(float x, float y){
        return x+y;
    }

    public float sub(float x, float y){
        return x-y;
    }

    public float multiplication(float x, float y){
        return x*y;
    }

    public float division(float x, float y){
        return x/y;
    }

    public float mod(float x, float y){
        return x%y;
    }
}
