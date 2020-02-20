public class NinjaTest {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        Ninja humano = new Ninja();
        ninja.steal(humano);
        ninja.runAway(humano);
    }
}
//javac NinjaTest.java
//java NinjaTest