package usingStatic;

public class Main {
    public static void main(String[] args) {
        UseStatic.method();
        UseStatic.Nested.nestedMethod();

        UseStatic useStatic = new UseStatic();
        useStatic.notStMethod();

        UseStatic.Nested nested = new UseStatic.Nested();
        nested.nestedNotStMethod(useStatic);
    }
}
