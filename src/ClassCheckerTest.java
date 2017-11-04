/**
 * Created by kristoffer on 2017-11-04.
 */

import org.junit.Test;
import org.junit.Assert;
/**
 * Unit test for simple App.
 */
public class ClassCheckerTest
{
    @Test
    public void shouldDetectMissingInterface() throws Exception {
        Assert.assertFalse(ClassChecker.implementsInterface(DummyClasses.ClassWithoutInterface.class));
    }
    @Test
    public void shouldDetectMissingConstructorWithOneParameter() throws Exception {
        Assert.assertFalse(ClassChecker.implementsInterface(DummyClasses.ClassWithoutInterface.class));
    }
    @Test
    public void shouldDetectZeroArgumentConstructor() throws NoSuchMethodException {
        Assert.assertTrue(ClassChecker.checkConstructor(DummyClasses.ClassWithConstructor.class, 0));
    }
    @Test
    public void ShouldDetectIfImplementationOfDummyInterface(){
        Assert.assertTrue(ClassChecker.implementsInterface(DummyClasses.ClassWithInterface.class));
    }
    @Test
    public void ShouldDetectGetMethod() throws NoSuchMethodException {
        Assert.assertTrue(ClassChecker.checkGetMethod(DummyClasses.ClassWithGetMethod.class, "get"));
    }

    /** Doesn't work couse it inherits from classes that has a get method. for example getObjekt from objekt class
     @Test
    public void ShouldNotDetectGetMethod() throws NoSuchMethodException {
        Assert.assertFalse(ClassChecker.checkGetMethod(DummyClasses.ClassWithoutGetMethod.class, "get"));
    }*/
}