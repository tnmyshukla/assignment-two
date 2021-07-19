import java.util.List;

/**
 * The type Utils.
 */
public class utils {
  /**
   * Check null boolean.
   *
   * @param arg the arg
   * @return the boolean
   */
  public static boolean checkNull(final List<String> arg) {
    for (String c : arg) {
      if (c == null) return true;
    }
    return false;
  }

  /**
   * Check blank boolean.
   *
   * @param arg the arg
   * @return the boolean
   */
  public static boolean checkBlank(final List<String> arg) {
    for (String c : arg) {
      if (c.isBlank()) return true;
    }
    return false;
  }

  /**
   * Check empty boolean.
   *
   * @param arg the arg
   * @return the boolean
   */
  public static boolean checkEmpty(final List<String> arg) {
    for (String c : arg) {
      if (c.isBlank()) return true;
    }
    return false;
  }
}
