import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class Utilizador {
    
    private String email;
    private String password;
    private String nome;
    private Character genero;
    private short altura;
    private Double peso;
    private LocalDate dataNascimento;
    private LocalDate dataRegisto;
    private Atividade desportoFavorito;
    private Set<Atividade> atividades;


    public Utilizador ()
    {

    }

    public Utilizador (Utilizador copia)
    {
        this.email = copia.email;
        this.password = copia.password;
        this.nome = copia.nome;
        this.genero = copia.genero;
        this.altura = copia.altura;
        this.peso = copia.peso;
        this.dataNascimento = LocalDate.of(copia.dataNascimento.getYear(), copia.dataNascimento.getMonth(), copia.dataNascimento.getDayOfMonth());
        this.dataRegisto = LocalDate.of(copia.dataRegisto.getYear(), copia.dataRegisto.getMonth(), copia.dataRegisto.getDayOfMonth());
        this.atividades = copia.atividades.stream().collect(Collectors.toSet());
    }

    @Override
    public Utilizador clone()
    {

    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public Character getGenero() {
        return genero;
    }


    public void setGenero(Character genero) {
        this.genero = genero;
    }


    public short getAltura() {
        return altura;
    }


    public void setAltura(short altura) {
        this.altura = altura;
    }


    public Double getPeso() {
        return peso;
    }


    public void setPeso(Double peso) {
        this.peso = peso;
    }


    public LocalDate getDataNascimento() {
        return dataNascimento;
    }


    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public LocalDate getDataRegisto() {
        return dataRegisto;
    }


    public void setDataRegisto(LocalDate dataRegisto) {
        this.dataRegisto = dataRegisto;
    }


    public Atividade getDesportoFavorito() {
        return desportoFavorito;
    }


    public void setDesportoFavorito(Atividade desportoFavorito) {
        this.desportoFavorito = desportoFavorito;
    }


    public Set<Atividade> getAtividades() {
        return atividades;
    }


    public void setAtividades(Set<Atividade> atividades) {
        this.atividades = atividades;
    }
}
