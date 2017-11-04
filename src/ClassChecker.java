/**
 * Created by kristoffer on 2017-11-04.
 */
import java.lang.reflect.*;

public class ClassChecker {
    /**
     * This method checks if a given class implements the DummyInterface.
     */
    public static boolean implementsInterface(Class<?> testClass) {
        return DummyInterface.class.isAssignableFrom(testClass);
    }
    /**
     * This method checks if a given class has a constructor that takes the given number of parameters.
     *
     * @throws IllegalArgumentException if nrOfParameters is negative.
     */
    public static boolean checkConstructor(Class<?> testClass, int nrOfParameters) throws NoSuchMethodException {
        Constructor<?>[] c = testClass.getConstructors();
        for(int i = 0; i < c.length; i++){
            if(nrOfParameters == c[i].getParameterCount()){
                return true;
            }
        }
        return false;
    }
    public static boolean checkGetMethod(Class<?> testClass, String string) throws NoSuchMethodException {
        Method m[] = testClass.getMethods();
        for(int i = 0; i < m.length; i++){
            if(m[i].toString().contains(string)) {
                System.out.println("hej " + m[i].toString());
                return true;
            }
        }
        return false;
    }
}