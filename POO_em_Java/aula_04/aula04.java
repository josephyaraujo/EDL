package POO_em_Java.aula_04;

public class aula04 {
    public static void main (String[] args){
        Caneta2 c1 = new Caneta2();
        c1.setCor("Azul"); 
        //c1.cor = "Azul"; Se eu quisesse acessar o atributo diretamento eu poderia, porque é público  
        c1.setPonta(0.5f); // se eu tentasse fazer isso com o ponta, isso não seria possível por ser um atributo privado
        c1.status(); //posso fazer através do método status
        //System.out.println(c1.getCor()); //ou fazer diretamente pegando do métofo get
        //System.out.println(c1.getPonta()); 

    }
}
