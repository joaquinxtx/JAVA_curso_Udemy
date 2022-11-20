public class HolaMundo {
    static public void main(String[] args){
        System.out.println("Hola mundo java");

        double numero = 3.2015;
        int parteEntera = (int) (numero);
        float parteDecimal = (float) (numero - parteEntera);

        System.out.println("entero: "+parteEntera + " decimal: "+ parteDecimal );
    }
}
