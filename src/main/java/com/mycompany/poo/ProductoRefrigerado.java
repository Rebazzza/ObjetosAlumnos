
package com.mycompany.poo;

public class ProductoRefrigerado extends Producto{
    protected String codigoDigesa;
    
    public ProductoRefrigerado(String nombreP, String fechaP, int numeroP, String c){
        super(nombreP, fechaP, numeroP);
        this.codigoDigesa = c;
    }
    
    public void setCodigoDigesa(String c){
        this.codigoDigesa = c;
    }
    public String getCodigoDigesa(){
        return this.codigoDigesa;
    }
    
    @Override
    public String toString(){
        return "Producto Refrigerado {" + "\nNombre: " + super.getNombre() + "\nfecha de caducidad: " 
                + super.getFechaDeCaducidad() + "\nnumero de lote: " + super.getNumeroDeLote()
                + "\ncodigo digesa: " + this.codigoDigesa + "}";
    }
}
