package Zpadroesdeprojeto.builder.dominio;

public class Person {
    private String email;
    private String nome;
    private String senha;
    private String telefone;

    private Person(String email, String nome, String senha, String telefone) {
        this.email = email;
        this.nome = nome;
        this.senha = senha;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }


    public static final class PersonBuilder {
        private String email;
        private String nome;
        private String senha;
        private String telefone;

        public PersonBuilder() {
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PersonBuilder senha(String senha) {
            this.senha = senha;
            return this;
        }

        public PersonBuilder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Person build() {
            return new Person(email, nome, senha, telefone);
        }
    }
}
