/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package entornos.git;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public int sumar(int n1, int n2) {
        int sm = n1 + n2;
        return sm;
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
