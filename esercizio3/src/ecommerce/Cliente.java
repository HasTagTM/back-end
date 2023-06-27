package ecommerce;

public class Cliente {
    private String codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private Cliente clienteAssociato;
    private Carrello carrello;
    private double totaleCostoArticoli;

    public Cliente(String codiceCliente, String nome, String cognome, String email) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.carrello = new Carrello();
        this.totaleCostoArticoli = 0.0;
    }


}

