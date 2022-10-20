package edu.rafa.anatomiaclasses;
public class MyClass {
    public static void main(String[] args) {
        
        System.out.print("Olá, mundo!");
        System.out.println("Olá mundo 2!"); //utilizado o atalho "sout" do IntelliJ

        String municipio = "São Paulo";
        final String PAIS = "Brasil";
        System.out.println(municipio + PAIS);

        String meuNome = "Rafael"; //tipo = string, nome = meuNome, declaração = Rafael//
        int idade = 37; //tipo = int (numero inteiro), nome = idade, declaração = 37;//

        boolean verdadeira = true; // tipo = boolean, nome = verdadeira, declaração = true - pode atribuir ou não um valor para essa variável;

        idade = 39; //manipulação da declaração da variável idade; //

        System.out.println(idade); //será impresso o valor manipulado de 39 e nao o valor declarado inicialmente de 37;//

        String primeiroNome = "Rafael";
        String segundoNome = "Henrique";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    
    //criando um novo método//
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método = " + primeiroNome.concat(" ").concat(segundoNome);
    }
    

}
