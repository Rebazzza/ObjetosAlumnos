
package com.mycompany.poo;

public class ProductoFresco extends Producto{
    protected String fechaDeEnvasado;
    protected String paisDeOrigen;
    
    public ProductoFresco(String nombreP, String fechaP, int numeroP, String f, String p){
        super(nombreP, fechaP, numeroP);
        this.fechaDeEnvasado = f;
        this.paisDeOrigen = p;
    }
    
    public void setFechaDeEnvasado(String f){
        this.fechaDeEnvasado = f;
    }
    public String getFechaDeEnvasado(){
        return this.fechaDeCaducidad;
    }
    
    public void setPaisDeOrigen(String p){
        this.paisDeOrigen = p;
    }
    public String getPaisDeOrigen(){
        return this.paisDeOrigen;
    }
    
    @Override
    public String toString(){
        return "Producto Fresco {" + "\nNombre: " + super.getNombre() + "\nfecha de caducidad:"
                + super.getFechaDeCaducidad() + "\nnumero de lote: " + super.getNumeroDeLote()
                + "\nfecha de envasado: " + this.getFechaDeCaducidad() + "\npais de origen: "
                + this.getPaisDeOrigen() + "}";
    }
}
