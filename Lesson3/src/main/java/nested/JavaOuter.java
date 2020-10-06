package nested;

public class JavaOuter {//Внешний
    public class JavaInternal{}//Внутренний
    public static class JavaNested{}//Вложенный

    public static void main(String[] args) {

        JavaOuter outer = new JavaOuter();
        JavaInternal internal = outer.new JavaInternal();
        JavaNested nested = new JavaOuter.JavaNested();
    }
}
