package ProjetoFinal;

public class Gafanhoto extends Pessoa{
    private String login;
    private int totAssistindo;

    public Gafanhoto(String name, int idade, char sexo, String login) {
        super(name, idade, sexo);
        this.login = login;
        this.totAssistindo = 0;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getTotAssistindo() {
        return totAssistindo;
    }
    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }


    
    public void viuMaisUm(){

    }
    @Override
    public String toString(){
        return "Gafanhoto: \n" + super.toString() + ", login: " + login;
    }
}