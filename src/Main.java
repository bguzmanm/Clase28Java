public class Main {
  public static void main(String[] args) {
    Configurador conf = Configurador.getConfig();

    conf.setNumero(4);
    conf.setDescripcion("Este es un texto descriptivo");

    funcion();
    System.out.println(conf.getNumero());

  }
  public static void funcion(){
    Configurador confite = Configurador.getConfig();
    System.out.println(confite.getNumero());
    System.out.println(confite.getDescripcion());

    confite.setNumero(8);
  }
}