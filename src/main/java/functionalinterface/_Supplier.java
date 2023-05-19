package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDbConnectionUrl());
        System.out.println(getDbConnectionUrlSupplier.get());

    }
    static String getDbConnectionUrl(){
        return "jdbc//5432//user";
    }
    static Supplier<List<String>>getDbConnectionUrlSupplier= ()->
            List.of(
            "1","2"
            );

}
