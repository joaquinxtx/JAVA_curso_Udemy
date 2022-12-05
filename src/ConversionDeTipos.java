public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numero int: "+numeroInt);

        String realStr ="900.76";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("RealDouble: "+realDouble);

        int otroNumeroInt = 100 ;

        System.out.println("otro numero int:"+ otroNumeroInt);

        String otroNumeroStr= Integer.toString(otroNumeroInt);

        System.out.println("otro numero string :" + otroNumeroStr);

        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println(otroNumeroStr);
    }
}
