/**
 * The calculator class contains methods for performing addition, subtraction, multiplication, and
 * division operations on two float numbers.
 */
class calculator{
    float addition(float a,float b){
            return(a+b);
    }
    float subtraction(float a,float b){
        return(a-b);
}
float multiplication(float a,float b){
    return(a*b);
}
float division(float a,float b){
    return(a/b);
}

/**
 * The main function creates an instance of the calculator class and performs addition, subtraction,
 * multiplication, and division operations on two given numbers.
 */
public static void main(String[] args) {
    calculator cal =new calculator();
    float a=10;
    float b=5;
    float add_result=cal.addition(a, b);
    System.out.println("Result:"+add_result);

    float sub_result=cal.subtraction(a, b);
    System.out.println("Result:"+sub_result);

    float pro_result=cal.multiplication(a,b);
    System.out.println("Result:"+pro_result);

    float div_result=cal.division(a,b);
    System.out.println("Result:"+div_result);
}
}