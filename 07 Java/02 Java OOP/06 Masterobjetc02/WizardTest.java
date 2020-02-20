public class WizardTest {
    public static void main(String[] args) {
        Wizard mago = new Wizard();
        Wizard humano = new Wizard();
        mago.heal(humano);
        mago.fireBall(humano);
        mago.fireBall(humano);
    }
}
//javac WizardTest.java
//java WizardTest