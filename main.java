/*UPTX - TI
Fundamentos de programación OO
Practica
Objetivo: Aplicación para llevar el registro de un coche para tener los datos de mantenimiento
y consumo de gasolina
Programadores: Hanny Iraiz Rama Perez
Modificación: 17/01/2024
*/
import FOO.Carro;

public class Main {
    public static void main(String[] args){
        //objeto 1
        Carro carro1 = new Carro();
        System.out.printf("Este es el auto 1");
        System.out.printf("\n");
        carro1.setMarca(" Nissan ");
        System.out.printf(carro1.getMarca());
        carro1.setColor("  el color es: azul ");
        System.out.printf(carro1.getColor());
        carro1.setKmRecorrido(100);
        System.out.printf("   el kilometraje es "+carro1.getKmRecorrido());
        System.out.printf("\n");
        //objeto 2
        System.out.printf("Este es el auto 2");
        System.out.printf("\n");
        Carro carro2 = new Carro();
        carro2.setMarca(" Chevrolet ");
        System.out.printf(carro2.getMarca());
        carro2.setCilindros(200);
        System.out.printf("     sus cilindros son "+carro2.getCilindros());
        carro2.setLitiosGa(1000);
        System.out.printf("     consumio     "+carro2.getLitiosGa());
        System.out.printf("\n");
        //objeto 3
        System.out.printf("Este es el auto 3");
        System.out.printf("\n");
        Carro carro3 = new Carro();
        carro3.setModelo(" jetta");
        System.out.printf("      El carro es "+carro3.getModelo());
        carro3.setAnio(2014);
        System.out.printf("     año del carro "+ carro3.getAnio());
        carro3.setPlacas(" GHIEP");
        System.out.printf("         tiene placas  "+carro3.getPlacas());
        System.out.printf("\n");
    }
}

