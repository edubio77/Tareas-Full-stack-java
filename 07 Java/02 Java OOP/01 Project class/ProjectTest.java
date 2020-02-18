class ProjectTest {
    public static void main(String[] args) {
    	Project testProject = new Project("ProyectoX", "Esta es la descripcion del proyectoX", 10.0);
        testProject.setNombreProyecto("ProyectoZ");
        testProject.setDescripcionProyecto("Descripcion proyecto Z");
        testProject.setIntialCostProyecto(20.0);
        System.out.println(testProject.elevatorPitch());
    }
}
//javac ProjectTest.java
//java ProjectTest