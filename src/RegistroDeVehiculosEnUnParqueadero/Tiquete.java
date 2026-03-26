package RegistroDeVehiculosEnUnParqueadero;

 public class Tiquete {
    private Vehiculo vehiculo;
    private int horaEntrada;
    private int minEntrada;
    private int horaSalida;
    private int minSalida;
    private double tarifaHora;
    
    Tiquete (Vehiculo vehiculo, int horaEntrada, int minEntrada, int horaSalida, int minSalida, double tarifaHora){
        this.vehiculo = vehiculo;
        this.horaEntrada = horaEntrada;
        this.minEntrada = minEntrada;
        this.horaSalida = horaSalida;
        this.minSalida = minSalida;
        this.tarifaHora = tarifaHora;
    }
     public int getHoraSalida() {
        return horaSalida;
     }
     public int getMinSalida() {
        return minSalida;
     }
     public int getHoraEntrada(){
        return horaEntrada;
     }
     public int getMinEntrada(){
        return minEntrada;
     }
      public double CalcularValor(){
  

        int totalMinutosEntrada = (horaEntrada * 60) + minEntrada;
        int totalMinutosSalida = (horaSalida * 60) + minSalida;

        int minutosTotales = totalMinutosSalida - totalMinutosEntrada;
        double horasTotales = minutosTotales / 60.0;

        double valor = horasTotales * tarifaHora;
        return Math.round(valor * 100.0) / 100.0;
      }
 }