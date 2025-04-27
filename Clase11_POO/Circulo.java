package Clase11_POO;

public class Circulo {
   
    //Atributos
    private float radio;
 
    //Constructor de la clase: nos permite inicializar la clase
    //El método constructor se llama igual que la clase
    public Circulo(double r){
        this.radio = (float) r; //this es una autoreferencia al atributo de la clase
    }
 
    //Métodos
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
 
    public double calcularArea(){
        return Math.PI * (radio * radio); // Math.PI * Math.pow(radio,2)
    }
}