package FOO;

public class Carro {
    //Atributos
    private String marca;
    private String modelo;
    private String color;
    private int puertas;
    private int cilindros;
    private int anio;
    private String placas;
    private float kmRecorrido;
    private float litiosGa;
    //Metodos
    public String getMarca() {return marca;}
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public double getKmRecorrido() {
        return kmRecorrido;
    }

    public void setKmRecorrido(float kmRecorrido) {
        this.kmRecorrido = kmRecorrido;
    }

    public double getLitiosGa() {
        return litiosGa;
    }

    public void setLitiosGa(float litiosGa) {
        this.litiosGa = litiosGa;
    }
}
