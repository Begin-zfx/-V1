import java.util.List;
import java.util.Map;

public class jsonAndmap {

    public static void main(String[] args) {
        test1();
    }
    static void test1(){
        int code = staticTest.TEST_ONE.getCode();
        String name = staticTest.getName(2);
        System.out.println(code+"zfx");
        System.out.println(name+"zfx22");
    }
    static void test2(Map<String,Object> map){
        List<Object> list = (List<Object>) map.get("aa");
        for (Object o :list){
            System.out.println(o);
        }
    }
}
//class D {
////    static {
////        i = 2;
////        System.out.println("D : 静态代码块1");
////    }
//    static {
//        i = 6;
//        System.out.println("D : 静态代码块2");
//    }
//    static int i;
//}
