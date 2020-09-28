package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Person person = new Person("jan");
        System.out.println(person.toString());

        Class c1 = Class.forName("classex.Person");
        Person person1 = (Person)c1.newInstance();
        System.out.println(person1);

        Class[] parameterTypes = {String.class};
        Constructor cons = c1.getConstructor(parameterTypes);

        Object[] initargs = {"김유신"};
        Person person2 = (Person)cons.newInstance(initargs);
        System.out.println("person2 = " + person2);

    }
}
