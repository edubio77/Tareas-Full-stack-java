 public class Project{
    private String Nombre;  //creando campo-atributo nombre
    private String Descripcion; //creando campo-atributo descripcion
    private Double InitialCost; //Agregar una variable initialCost de tipo double y tenga su propio getter and setter.
 
    public String elevatorPitch(){ //creando instancia de metodo elevatorpitch
    	return Nombre+" "+"($"+InitialCost+")" +Descripcion;
    }
    
//sobrecarga del metodo constructor
    public Project() { 
    }
    public Project(String Nombre) { 
	    this.Nombre = Nombre; 
    }
    public Project(String Nombre, String Descripcion) { 
	    this.Nombre = Nombre; 
	    this.Descripcion = Descripcion; 
 	}
    public Project(String Nombre, String Descripcion, Double IntialCost) { 
	    this.Nombre = Nombre; 
	    this.Descripcion = Descripcion;
	    this.InitialCost = IntialCost;
 	}
    
//getter y setters
    // getter nombre
    public String getNombreProyecto() {
        return Nombre;
    }
    // setter
    public void setNombreProyecto(String Nombre) {
        this.Nombre = Nombre;
    }
    // getter descripcion
    public String getDescripcionProyecto() {
        return Descripcion;
    }
    // setter
    public void setDescripcionProyecto(String Nombre) {
        this.Descripcion = Descripcion;
    }
    // getter initalCost
    public Double getIntialCostProyecto() {
        return InitialCost;
    }
    // setter initialCost
    public void setIntialCostProyecto(Double IntialCost) {
        this.InitialCost = InitialCost;
    }
}
//javac Project.java
//test&cls