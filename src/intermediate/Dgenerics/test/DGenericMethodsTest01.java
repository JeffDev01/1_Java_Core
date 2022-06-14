package intermediate.Dgenerics.test;

import intermediate.Dgenerics.domain.Boat;

import java.util.List;

public class DGenericMethodsTest01 {

    public static void main(String[] args) {
    createArrayWithOneObject(new Boat("Big Iate"));

    }


    private static <T> void createArrayWithOneObject(T t){
        List<T> list = List.of(t);
        System.out.println(list);
    }

    
//    private static <T> List<T> void createArrayWithOneObject(T t){
//        return List.of(t);
//    }

}

