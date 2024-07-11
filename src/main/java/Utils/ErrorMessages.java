package Utils;

public class ErrorMessages {
    static private String E101 = "{'error code': '101', 'error message':'Object Mapper error'}";
    static private String A113 = "{'error code': '113', 'error message':'LOL I don't know!'}";

    public static String ErrorMessages(int errorCode){
        switch(errorCode){
            case 101: return E101;
            default: return A113;
        }
    }
}
