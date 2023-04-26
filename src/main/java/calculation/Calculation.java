package calculation;

public class Calculation {
    //working with static methods;

    /**
    NOTES ON STATIC METHODS AND STATIC VARIABLES
    When a class method is declared as static, it means the method belongs to the class itself rather than to
    any specific instance of the class. This means there is only one copy of the variable in memory, regardless
    of how many instances of the class are created.

    It works same for static variables. When a value is given to a static variable by an instance of a class,
    the same value is displayed when another instance of the class accesses the value of that same variable.
*/

    public static int add(int a, int b){
        return a+b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int subtract(int a, int b){
        return a-b;
    }

    public static float divide(float a, float b){
        return a/b;
    }

    public static int modulo(int a, int b){
        return a%b;
    }
}
