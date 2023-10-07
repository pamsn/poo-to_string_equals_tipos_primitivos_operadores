package to_string_equals;

public class ProgramaAutor {

	public static void main(String[] args) {
        Autor a1 = new Autor("Paulo", "paulo@xxx.com", 'M');
        Autor a2 = new Autor("Maria", "maria@xxx.com", 'F');
        Autor a3 = new Autor("Paulo", "paulo@xxx.com", 'M');
        Autor a4 = a1;



        System.out.println(a1);
        
        
        
        System.out.println(a1.equals(a3));
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a4));
    }

}
