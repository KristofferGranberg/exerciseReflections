/**
 * Created by kristoffer on 2017-11-04.
 */
public class DummyClasses {

    public class ClassWithoutInterface {
    }
    public class ClassWithInterface implements DummyInterface{

    }
    public class ClassWithConstructor{

        public ClassWithConstructor(){

        }
    }
    public class ClassWithGetMethod{
        public boolean letValue(){
            return true;
        }
    }
    public class ClassWithoutGetMethod{
        public boolean aMethod(){
            return true;
        }
    }

}
