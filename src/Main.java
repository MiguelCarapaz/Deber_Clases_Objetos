public class Main {
    public static void main(String[] args) throws Exception {
        //HP
        Impresora HP = new Impresora();
        System.out.println("Marca:"+HP.getMarca());
        System.out.println("Tipo de hojas:"+HP.getHojas());
        System.out.println("Bandeja de salida:"+HP.getBandeja_de_salida());
        System.out.println("Cartuchos de tinta:"+HP.getCartuchos_tinta());
        System.out.println("Modelo:"+HP.getModelo());
        System.out.println();

        //EPSON
        Impresora EPSON = new Impresora();

        EPSON.setMarca("EPSON");
        EPSON.setCartuchos_tinta(6);
        EPSON.setBandeja_de_salida("EPSON Deskjet");
        EPSON.setModelo("L3110");


        System.out.println("Marca:"+EPSON.getMarca());
        System.out.println("Tipo de hojas:"+EPSON.getHojas());
        System.out.println("Bandeja de salida:"+EPSON.getBandeja_de_salida());
        System.out.println("Cartuchos de tinta:"+EPSON.getCartuchos_tinta());
        System.out.println("Modelo:"+EPSON.getModelo());
        System.out.println();

        //CANON
        Impresora CANON = new Impresora();

        CANON.setMarca("CANON");
        CANON.setCartuchos_tinta(4);
        CANON.setBandeja_de_salida("CANON TS8220");
        CANON.setModelo("mp250");


        System.out.println("Marca:"+CANON.getMarca());
        System.out.println("Tipo de hojas:"+CANON.getHojas());
        System.out.println("Bandeja de salida:"+CANON.getBandeja_de_salida());
        System.out.println("Cartuchos de tinta:"+CANON.getCartuchos_tinta());
        System.out.println("Modelo:"+CANON.getModelo());
        System.out.println();




    }
}