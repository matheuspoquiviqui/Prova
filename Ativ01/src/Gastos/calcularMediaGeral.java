package Gastos;

public class calcularMediaGeral {
    private Double mediaGeral;

    public Double getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(Double totalGastos, double nClientes) {
        mediaGeral = totalGastos / nClientes;
        System.out.println("\nMédia de geral de gastos: R$ " + mediaGeral);
    }
}
