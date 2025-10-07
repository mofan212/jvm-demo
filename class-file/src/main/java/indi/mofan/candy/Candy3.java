package indi.mofan.candy;


import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author mofan
 * @date 2025/10/7 15:20
 */
public class Candy3 {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        // 实际调用的是 List#add(Object e)
        list.add(10);
        // 实际调用的是 Object obj = List#get(int index)
        Integer x = list.get(0);

        parseGenericType();
    }

    public Set<Integer> test(List<String> list, Map<Integer, Object> map) {
        return null;
    }

    public static void parseGenericType() throws Exception {
        Method test = Candy3.class.getMethod("test", List.class, Map.class);
        Type[] types = test.getGenericParameterTypes();
        for (Type type : types) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                System.out.println("原始类型 - " + parameterizedType.getRawType());
                Type[] arguments = parameterizedType.getActualTypeArguments();
                for (int i = 0; i < arguments.length; i++) {
                    System.out.printf("泛型参数[%d] - %s\n", i, arguments[i]);
                }
            }
        }
    }
}
