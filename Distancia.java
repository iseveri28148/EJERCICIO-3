import java.util.Scanner;

/**
 * Programa para hallar distacia entre 2 ciudades
 * 
 * @author ISRAEL SEVERICHE 
 * @version 20190811
 */
public class Distancia
{
    public static void main(String[] args)
    {
        double t1,g1,t2,g2,dist,sent1,sent2,cost1,cost2,cosg1,arcos,t1rad,g1rad,t2rad;
        
        Scanner Teclado = new Scanner (System.in);
        
        System.out.println("Ingresar la latitud de la primera ciudad");
        t1 = Teclado.nextDouble();
        
        System.out.println("Insertar la longitud de la primera ciudad");
        g1 = Teclado.nextDouble();
        
        System.out.println("Insertar la latitud de la seggunda ciudad");
        t2 = Teclado.nextDouble();
        
        System.out.println("Insertar la longitud de la segunda ciudad");
        g2 = Teclado.nextDouble();
        
        //calculos de grados a radianes
        t1rad = Math.toRadians(t1);
        g1rad = Math.toRadians(g1);
        t2rad = Math.toRadians(t2);
        sent1 = Math.sin(t1rad);
        sent2 = Math.sin(t2rad);
        cost1 = Math.cos(t1rad);
        cost2 = Math.cos(t2rad);
        cosg1 = Math.cos(g1rad);
        arcos = Math.acos(sent1);
        
        //calculo de distancia
        dist =6371.07*arcos*sent2+cost1*cost2*cosg1-g2;
        
        System.out.println("La distancia entre las ciudades en KMs es " + dist);
    }
}
