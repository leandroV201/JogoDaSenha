import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JogoDaSenha {
    int x = 0;
    int index = 0;
    List<Integer> lista = new ArrayList<Integer>();
    void getNumbers(){
        //classe que interage com o usuario atraves do scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 valores para começarmos o jogo: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        fazerTentativa(x, y, z, a, b);
    }
    void fazerTentativa(int a, int b, int c, int d, int e) {
        //classe que cria a lista e verifica os resultados, alem de criar um laço com a getnumbers
        index +=5;
        if(lista.isEmpty() == true){
            for(int i =0;i<30;i++){
                int number = (int) (Math.random() *100) +1;
                if(lista.contains(number) == false){
                    lista.add(number);
                }
                else{
                    i--;
                }
         }
    }
        
    if (lista.contains(a)){
        x++;        
    }
    if (lista.contains(b)){
        x++;
    }
    if (lista.contains(c)){
        x++;
    }
    if (lista.contains(d)){
        x++;
    }
    if (lista.contains(e)){
        x++;
    }
    if(x>5){
        x=5;
    }
    getSenha();
    System.out.println("Deseja tentar novamente S ou N : ");
    Scanner scanner = new Scanner(System.in);
    String resposta = scanner.nextLine().toUpperCase();
   
    if(x!=5){
    if( resposta.equals("S")){
        getNumbers();
    }
    else{
        System.out.println("Obrigado por jogar, você fez um total de "+x +" pontos");
    }}
}
    void getContadorPesquisa(){
        //veja quantas tentativas você perdeu nesse jogo de esquema de piramide
        System.out.println("Foram realizadas um total de : "+ index+" tentativas");
    }
    void getSenha(){
        //Retorna o andamento do jogo
        if(x==5){
            System.out.println("VOCÊ ACERTOU TODOS, PARABÉNS");
            System.out.println(lista);
            getContadorPesquisa();
        }
        if(x!=5){
            System.out.println("Você ainda não adivinhou a senha!");
            
        }
    }
}