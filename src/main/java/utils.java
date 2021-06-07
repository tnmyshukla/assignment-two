import java.util.List;

public class utils {
  public static boolean checkNull(final List<String> arg){
    for (String c:arg) {
      if(c==null)return true;
    }
    return false;
  }
  public static boolean checkBlank(final List<String> arg){
    for (String c:arg) {
      if(c.isBlank())return true;
    }
    return false;
  }
  public static boolean checkEmpty(final List<String> arg){
    for (String c:arg) {
      if(c.isBlank())return true;
    }
    return false;
  }
}
