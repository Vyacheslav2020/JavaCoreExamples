package usingStatic;

class UseStatic {
    private static int a = 10;
    private static int b;
    private static int c;
    private int notSt;

    static {
        b = a * 2;
    }

    UseStatic() {
        c = a + b;
        notSt = c;
    }

    static void method() {
        b++;
        new UseStatic().notSt++;
    }

    void notStMethod() {
        method();
        c++;
    }

    static class Nested {
        static void nestedMethod() {
            method();
            c++;
            new UseStatic().notStMethod();
        }

        void nestedNotStMethod(UseStatic useStatic) {
            method();
            c++;
            useStatic.notSt++;
        }
    }
}
