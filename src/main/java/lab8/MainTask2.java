package lab8;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.util.ArrayList;

public class MainTask2 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        ArrayList<Double> grades = new ArrayList<>();
        grades.add(80.00);
        grades.add(90.00);
        grades.add(95.00);

        GradeAnalyzer ga = new GradeAnalyzer(grades);
        Class<?> getobj = ga.getClass();
        Field[] fields = getobj.getDeclaredFields();

        for(Field field : fields){
            field.setAccessible(true);
            System.out.println("Name: " + field.getName() + " and value: " + field.get(grades));
        }
        // Method is also a class like FIeld, and u can use it to search thru methods just like you search thru fields (iterate that is ig? lol)
        Method[] methods = getobj.getDeclaredMethods();
        for(Method method : methods){
            method.setAccessible(true);
            if(method.getName().startsWith("calculate") || method.getName().startsWith("print")){
                System.out.println("Name: " + method.getName() + "and the result: " + method.invoke(grades));
            }
        }

    }
}
