/**
 * The calculator class contains methods for performing addition, subtraction, multiplication, and
 * division operations on two float numbers.
 */
class calculator extends extend{
    /**
     * The function "addition" takes two float numbers as input and returns their sum.
     * 
     * @param a The first number to be added.
     * @param b The parameter "b" is a float type variable.
     * @return the sum of the two input numbers, a and b.
     */
    float addition(float a,float b){
            return(a+b);
    }
    /**
     * The function "subtraction" takes two float numbers as input and returns their difference.
     * 
     * @param a The first number to be subtracted.
     * @param b The parameter "b" is a float value that represents the second number in the subtraction
     * operation.
     * @return the result of subtracting `b` from `a`.
     */
    float subtraction(float a,float b){
        return(a-b);
}
/**
 * The function "multiplication" takes two float numbers as input and returns their product.
 * 
 * @param a The first number to be multiplied.
 * @param b The parameter "b" is a float value that represents the second number in the multiplication
 * operation.
 * @return the product of the two input numbers, a and b.
 */
float multiplication(float a,float b){
    return(a*b);
}
/**
 * The division function takes two float numbers as input and returns their quotient.
 * 
 * @param a The first parameter "a" is a float value that represents the numerator in the division
 * operation.
 * @param b The parameter "b" is the divisor in the division operation.
 * @return the result of dividing the value of 'a' by the value of 'b'.
 */
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
    System.out.println("Addition Result:"+add_result);

    float sub_result=cal.subtraction(a, b);
    System.out.println("Subtraction Result:"+sub_result);

    float pro_result=cal.multiplication(a,b);
    System.out.println("Multiplication Result:"+pro_result);

    float div_result=cal.division(a,b);
    System.out.println("Division Result:"+div_result);

    float sqa_result=cal.sqaure(a);
    System.out.println("Sqaure Result:"+sqa_result);

    float cub_result=cal.cube(a);
    System.out.println("Cube Result="+cub_result);

    float mod_result=cal.modulus(a,b);
    System.out.println("Modulus Result="+mod_result);
}
}