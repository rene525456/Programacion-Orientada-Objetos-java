
package proyectopolimorfismo;


public class Ejecutor {


    public static void main(String[] args) {
        Jefatura rrhh = new Jefatura("Pablo", 2700, 2023, 4, 12);
        rrhh.setIncentivo(340);
        
        Empleado docente1 = new Empleado("Rene", 1600, 2023, 11, 31);
        Empleado docente2 = new Empleado("Karina", 2200, 2023, 11, 31);
        Empleado docente3 = new Empleado("Janina", 1800, 2023, 11, 31);
        Empleado docente4 = new Empleado("Patricia", 1600, 2023, 11, 31);
        
        Empleado [] listaEmpleados = new Empleado[5];
        listaEmpleados[0] = docente1;
        listaEmpleados[1] = docente2;
        listaEmpleados[2] = docente3;
        listaEmpleados[3] = docente4;
        listaEmpleados[4] = rrhh;
        
        for (Empleado empleado : listaEmpleados) {
            empleado.subirSueldo(5);
        }
        
        for (Empleado empleado : listaEmpleados) {
            System.out.println("Nombre: " + empleado.getNombre() + " " + empleado.getSueldo());
        }
    }
    
}
