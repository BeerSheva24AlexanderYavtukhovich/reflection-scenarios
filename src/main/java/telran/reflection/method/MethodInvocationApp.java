package telran.reflection.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodInvocationApp {

    public static void main(String[] args) {

        Tests tests = new Tests();
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException(
                        "There should be two arguments: method name, specific parametr value ");
            }
            Method method = Tests.class.getDeclaredMethod(args[0], String.class); // Response.class request.class
            method.setAccessible(true);
            method.invoke(tests, args[1]);

        } catch (NoSuchMethodException e) {
            System.out.println(args[0] + " Not found");
        } catch (IllegalArgumentException | SecurityException | IllegalAccessException | InvocationTargetException e) {
            System.out.println(e.getMessage());
        }

    }
}
