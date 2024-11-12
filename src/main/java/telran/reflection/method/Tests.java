package telran.reflection.method;

public class Tests {
    public void test1(String param) {
        System.out.println("test1 with param" + param);
    }

    @SuppressWarnings("unused")
    private void test2(String param) {
        System.out.println("test2 with param" + param);
    }
}
