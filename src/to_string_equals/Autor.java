package to_string_equals;

import java.util.Objects;

public class Autor {

    private String name;
    private String email;
    private char gender;
    
    public Autor(String n, String e, char g) {
        name = n;
        email = e;
        gender = g;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
    
    @Override
    public String toString() {
        return "Nome: " + name + "|\t" + "Gênero: " + gender + "\tEmail: " + email;
    }

    @Override
    public boolean equals(Object obj) {
        // Verifica se são a mesma instância
        if (this == obj) {
            return true;
        }

        // Verifica se o objeto passado é nulo ou não é uma instância de Autor
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Converte o objeto passado para um Autor
        Autor outroAutor = (Autor) obj;

        // Compara as propriedades gender, name e email
        boolean nomesIguais = Objects.equals(name, outroAutor.name);
        boolean emailsIguais = Objects.equals(email, outroAutor.email);
        boolean generosIguais = gender == outroAutor.gender;

        // Retorna true se todas as propriedades forem iguais
        return nomesIguais && emailsIguais && generosIguais;
    }


}
