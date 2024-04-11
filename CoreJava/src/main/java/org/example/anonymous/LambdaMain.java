package org.example.anonymous;

public class LambdaMain {
    public static void main(String[] args) {
        Progammer pythonProgrammer = new Progammer() {
            @Override
            public void code(String ide) {
                System.out.println("I code In Python "+ ide);
            }
        };
        pythonProgrammer.code("PyCharm");
        Progammer javaProgrammer=(ide) -> System.out.println("I code in Java "+ide);
        javaProgrammer.code("Intellij");
    }
}
