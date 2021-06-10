import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * The type Test runner.
 */
public class TestRunner {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(final String[] args) {
    final Result result = JUnitCore.runClasses(TestUnit.class);
    for (final Failure failure : result.getFailures()) {
      System.out.println(failure.toString());
    }
    System.out.println(result.wasSuccessful());
  }
}
