public class HumanTest {
    public static void main(String[] args) {
        Human humano1 = new Human();
        Human humano2 = new Human();
        humano1.attack(humano2);
        humano1.attack(humano2);
        humano1.attack(humano2);
    }
}
//javac HumanTest.java
//java HumanTest