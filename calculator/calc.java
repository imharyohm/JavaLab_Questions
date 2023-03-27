package calculator;
public class calc {
    float num1;
    float num2;
    calc(float a, float b){
        num1=a;
        num2=b;
    }
    float add(){
        float sum=num1+num2;
        return sum;
    }

    float sub(){
        float subtact=num1-num2;
        return subtact;
    }

    float multiply(){
        float product=num1*num2;
        return product;
    }

    float divide(){
        float que=num1/num2;
        return que;
    }

    float mod(){
        float rem=num1%num2;
        return rem;
    }
}

