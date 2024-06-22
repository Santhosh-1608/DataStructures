package POTD;
// You are given a string str containing two fractions a/b and c/d, compare them and return the greater. If they are equal, then return "equal".
// Note: The string str contains "a/b, c/d"(fractions are separated by comma(,) & space( ))
public class Fractions {
    static String compareFrac(String str) {
        // Code here
       String[] exp = str.split(",");
       String[] exp1 = exp[0].split("/");
       double a = Double.parseDouble(exp1[0]);
       double b = Double.parseDouble(exp1[1]);
       String[] exp2 = exp[1].split("/");
       double c = Double.parseDouble(exp2[0]);
       double d = Double.parseDouble(exp2[1]);
       double res = a / b;
       double res2 = c / d;
       String[] ans = exp[1].split(" ");
       if(res > res2){
           return exp[0];
       }
       else if(res2>res){
           return ans[1];
       }
       else return "equal";
    }
    public static void main(String[] args) {
        System.out.println(compareFrac("5/6, 11/45"));
    }
}

