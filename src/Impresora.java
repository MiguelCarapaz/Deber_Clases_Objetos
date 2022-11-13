public class Impresora {
    //ATRIBUTOS
    String marca, hojas, bandeja_de_salida, modelo;
    int cartuchos_tinta;
    //CONSTRUCTOR
    public Impresora(){
        marca="HP";
        hojas="A4";
        bandeja_de_salida="HP LaserJet";
        cartuchos_tinta = 4;
        modelo="D1468";
    }
    // METODOS
    public void Copia_Blanco_Negro(){}
    public void Copia_Color(){}
    public void Escaner(){}
    public void Impresion(){}
    public void Numero_Impresiones(){}
    public void Encendido_Apagado(){}

    //GETTER AND SETTER
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getHojas() {
        return hojas;
    }

    public void setHojas(String hojas) {
        this.hojas = hojas;
    }

    public String getBandeja_de_salida() {
        return bandeja_de_salida;
    }

    public void setBandeja_de_salida(String bandeja_de_salida) {
        this.bandeja_de_salida = bandeja_de_salida;
    }

    public int getCartuchos_tinta() {
        return cartuchos_tinta;
    }

    public void setCartuchos_tinta(int cartuchos_tinta) {
        this.cartuchos_tinta = cartuchos_tinta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}