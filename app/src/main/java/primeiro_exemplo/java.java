package primeiro_exemplo;

import modelos.PessoaFisica;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Funciona!!!");

        Idade p1 = new PessoaFisica();
            p1.setIdade("11"); {

                System.out.println(p1.getIdade());
            }
    }
}