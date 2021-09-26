/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_1_4periodo;

/**
 *
 * @author Luis
 */
public class trapezio {
    private float altura,baseMaior, baseMenor;
    
    //CONSTRUTOR
    public trapezio(float altura, float baseMaior, float baseMenor ){
        this.altura = altura;
        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
    }
    public trapezio(){
    };
    
    //GET'S AND SET'S
    public float getAltura(){
        return altura;
    }
    public float getBaseMenor(){
        return baseMenor;
    }
    public float getBaseMaior(){
        return baseMaior;
    }
    public void setAltura(float altura){
        this.altura = altura;
    }
    public void setBaseMenor(float baseMenor){
        this.baseMenor = baseMenor;
    }
    public void setBaseMaior(float baseMaior){
        this.baseMaior = baseMaior;
    }
    
    //METODOS
    
    public float area(){
        //area = ((baseMaior+baseMenor)* altura)/2;
        return ((baseMaior+baseMenor) * altura)/2;
    }//mE = (baseMaior-baseMenor)/2;
    public float euler(){
        return (baseMaior-baseMenor) / 2;
    }
}


/*

    float altura, baseMaior, baseMenor, mE, area;
    Scanner input = new Scanner(System.in);
    System.out.print("Informe a altura do trapézio: ");
    altura = input.nextFloat();
    System.out.print("Informe a base maior do trapézio: ");
    baseMaior = input.nextFloat();
    System.out.print("Informe a base menor do trapézio: ");
    baseMenor = input.nextFloat();
    area = ((baseMaior+baseMenor)* altura)/2;
    mE = (baseMaior-baseMenor)/2;
    System.out.println("A area é: " + area);
    System.out.println("A mediana de Euler é: " + mE);

*/