class CalculadoraI implements java.io.Serializable {
	double operandOne = 0.0;
	double operandTwo = 0.0;
	String operation = "";
	double resultado = 0.0;
	//GETTERS Y SETTERS
	// getter
    public String getOperation() {
        return operation;
    }
    public double getOperandOne() {
        return operandOne;
    }
    public double getOperandTwo() {
        return operandTwo;
    }
    public double getResultado() {
        return resultado;
    }
    // setter
    public void setOperation(String operation) {
        this.operation = operation;
    }
    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }
    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
	//CONSTRUTOR
    public CalculadoraI(){
    }
    public CalculadoraI(double operandOne,String operation, double operandTwo){
    	this.operation = operation;
    	this.operandOne = operandOne ;
    	this.operandTwo = operandTwo;
    }
    //METODO SUMA Y RESTA
    public void performOperation(){
    	if(getOperation().equals("+")) {
			double total = getOperandOne() + getOperandTwo();
			setResultado(total);
    	}
    	else if(getOperation().equals("-")) {
    		double total = getOperandOne() - getOperandTwo();
    		setResultado(total);
    	}
    }
    //METODO RESULTADO
    public void getResult(){
    	System.out.println("El resultado es: "+getResultado());
    }
 }
//javac CalculadoraI.java
