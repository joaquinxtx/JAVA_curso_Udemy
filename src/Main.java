import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona persona1=new Persona("fernando","herrera");
        Persona persona2=new Persona("camilo","vega");
        Persona persona3=new Persona("eduardo","diaz");
        Persona persona4=new Persona("alvaro","sandoval");
        Persona persona5=new Persona("veronica","hernandez");

        List<Persona> listaDePersonas = new ArrayList<>();
        listaDePersonas.add(persona1);
        listaDePersonas.add(persona2);
        listaDePersonas.add(persona3);
        listaDePersonas.add(persona4);
        listaDePersonas.add(persona5);


        imprimirPersonas(listaDePersonas);
        System.out.println("------------ Nombres alfabeticamente-------------");
        listaDePersonas.sort(Comparator.comparing(Persona::getNombre));
        imprimirPersonas(listaDePersonas);

        System.out.println("------------ Apellidos alfabeticamente-------------");
        listaDePersonas.sort(Comparator.comparing(Persona::getApellido));
        imprimirPersonas(listaDePersonas);
    }
        public static void  imprimirPersonas(List<Persona>listaDePersonas){
        for (int i = 0; i < listaDePersonas.size() ; i++) {
            System.out.println(listaDePersonas.get(i).getNombre()+" "+listaDePersonas.get(i).getApellido());
        }


    }
}