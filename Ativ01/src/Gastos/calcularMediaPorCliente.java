package Gastos;

public class calcularMediaPorCliente {
    private double mediaCliente;

    public double getMediaCliente() {
        return mediaCliente;
    }

    public void setMediaCliente(double gastoBebidas, double gastoComidas) {
        mediaCliente = (gastoBebidas + gastoComidas) / 2;
    }
}
