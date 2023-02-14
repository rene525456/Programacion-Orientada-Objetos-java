
package conversiones;


public class Tiempo {
    
    public void calcularSemana(int horas){
        int semanas = horas / (24 * 7);
        System.out.println("Semana: " + semanas);
    }
    
    public void calcularDias(int horas){
        int dias = horas % (24 * 7) / 24;
        System.out.println("Dias:" + dias);
    }
    
    public void calcularHoras(int horas){
        int horitas = horas % 24;
        System.out.println("Horas: " + horas);
    }
}
