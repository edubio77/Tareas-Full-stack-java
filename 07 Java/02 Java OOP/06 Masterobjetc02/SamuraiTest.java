public class SamuraiTest {
    public static void main(String[] args) {
        Samurai samurai = new Samurai();
        Samurai humano = new Samurai();
        samurai.deathBlow(humano);
        samurai.meditate();
    }
}
//javac SamuraiTest.java
//java SamuraiTest