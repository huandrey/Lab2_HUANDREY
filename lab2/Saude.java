package lab2;

public class Saude {
  private String saudeMental = "boa";
  private String saudeFisica = "boa";

  public Saude() {

  }

  public void defineSaudeMental(String valor) {
    this.saudeMental = valor;
  }

  public void defineSaudeFisica(String valor) {
    this.saudeFisica = valor;
  }

  public String getStatusGeral() {
    if (this.saudeMental == this.saudeFisica && this.saudeMental == "boa") 
      return "boa";
    else if (this.saudeMental != this.saudeFisica)
      return "ok";
    else 
      return "fraca";      
    }
  }

