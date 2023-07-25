
package modelo;

public class AguaMineral extends Bebida{
    private boolean isManantial;
    public final double DESCUENTO = 0.10;

    public AguaMineral(int id, double cantidad, double precio, String marca, boolean isManantial) {
        super(id, cantidad, precio, marca);
        this.isManantial = isManantial;
    }

    @Override
    public String toString() {
        return super.toString() + " Agua Mineral " + " Manantial:" + isManantial; 
    }

    @Override
    public double getPrecio() {
        if (isManantial)
            return super.getPrecio() - DESCUENTO; 
        else
            return super.getPrecio();
    }

    /**
     * @return the isManantial
     */
    public boolean isIsManantial() {
        return isManantial;
    }

    /**
     * @param isManantial the isManantial to set
     */
    public void setIsManantial(boolean isManantial) {
        this.isManantial = isManantial;
    }
    
    
    
}
