package modelo;

public class BebidaAzucarada extends Bebida{
    private boolean isPromocion;
    private double porcentajeAzucar;

    public BebidaAzucarada(int id, double cantidad, double precio, String marca, boolean isPromocion, double porcentajeAzucar) {
        super(id, cantidad, precio, marca);
        this.isPromocion = isPromocion;
        this.porcentajeAzucar = porcentajeAzucar;
    }

    @Override
    public double getPrecio() {
        if(isPromocion)
            return super.getPrecio() * 0.9;
        else
            return super.getPrecio();
    }

    
    
    @Override
    public String toString() {
        return super.toString() + " Bebida Azucarada " + " Promoción:" + isIsPromocion() + " Porcentaje Azucar:" + getPorcentajeAzucar(); 
    }

    /**
     * @return the isPromocion
     */
    public boolean isIsPromocion() {
        return isPromocion;
    }

    /**
     * @param isPromocion the isPromocion to set
     */
    public void setIsPromocion(boolean isPromocion) {
        this.isPromocion = isPromocion;
    }

    /**
     * @return the porcentajeAzucar
     */
    public double getPorcentajeAzucar() {
        return porcentajeAzucar;
    }

    /**
     * @param porcentajeAzucar the porcentajeAzucar to set
     */
    public void setPorcentajeAzucar(double porcentajeAzucar) {
        this.porcentajeAzucar = porcentajeAzucar;
    }

    
    
    
}
