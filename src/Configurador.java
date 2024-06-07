public class Configurador {
  private static Configurador config;

  private int numero;
  private String descripcion;

  private Configurador() {
  }
  public static Configurador getConfig() {
    if (config == null) {
      synchronized (Configurador.class){
        if (config == null) {
          System.out.println("Instanciando la clase");
          config = new Configurador();
        }
      }
    }
    System.out.println("Retornando instancia");
    return config;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }
}
