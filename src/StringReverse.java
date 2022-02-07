public class StringReverse {

    /*Implement reverse recursively. Do not worry about the inefficiency of string concatenation.*/
    String reverse(String str){
        if(str.equals("")){
            return "";
        }
        else return str.substring(str.length()-1) + reverse(str.substring(0, str.length()-1));
    }
}
