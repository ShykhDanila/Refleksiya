import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        //MyClass my = new MyClass(54, "Petia");
        MyClass my = new MyClass();

        Class myClass = MyClass.class;

        Constructor[] declaredConstructors = myClass.getDeclaredConstructors();
        for (Constructor constructor:
             declaredConstructors) {
            System.out.println("Constructor:");
            System.out.println(constructor.getName());
            int modifiers = constructor.getModifiers();
            System.out.println(Modifier.toString(modifiers));
            System.out.println();


            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter:
                 parameters) {
                System.out.println("Parameter:");
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
                System.out.println();
            }
        }


        Method[] declaredMethods = myClass.getDeclaredMethods();
        for (Method method:
             declaredMethods) {
            System.out.println("Method:");
            System.out.println(Modifier.toString(method.getModifiers()));
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter:
                 parameters) {
                System.out.println("Parameters:");
                System.out.println(parameter.getName());
                System.out.println(parameter.getType().getName());
            }
        }
        System.out.println();

        NewClass newClass = new NewClass();

        Class newClas = NewClass.class;
        Field[] declaredFields2 = newClas.getDeclaredFields();

        Field[] declaredFields = myClass.getDeclaredFields();
        System.out.println("Modifiers:");
        for (Field field:
             declaredFields) {
            System.out.println(field.getName());
            System.out.println(field.getType().getName());
            System.out.println(Modifier.toString(field.getModifiers()));
        }
        System.out.println();
        System.out.println("NewClass");
        for (Field field2:
                declaredFields2) {
            field2.setAccessible(true);
             System.out.println(field2.getInt(newClass));
             field2.setInt(newClass,25);
            System.out.println(field2.getInt(newClass));
        }

    }
}
