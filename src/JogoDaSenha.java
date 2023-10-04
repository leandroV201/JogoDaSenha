import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;


public class JogoDaSenha {
    int x = 0;
    int s =0;
    int index = 0;
    List<Integer> NumerosUsados = new ArrayList<Integer>();
    List<Integer> lista = new ArrayList<Integer>();
    HashSet<Integer> cache = new HashSet<Integer>();
    void getNumbers(){
        //classe que interage com o usuario atraves do scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 valores para começarmos o jogo: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        TestInicial(x, y, z, a, b);
    }
    void TestNumeroRept(int a, int b, int c, int d, int e){
        s =0;
        if(NumerosUsados.contains(a)==false){
            s++;
        }
        if(NumerosUsados.contains(b)==false){
            s++;
        }
        if(NumerosUsados.contains(c)==false){
            s++;
        }
        if(NumerosUsados.contains(d)==false){
            s++;
        }
        if(NumerosUsados.contains(e)==false){
            s++;
        }
        if(s==5){
            fazerTentativa(a,b,c,d,e);
        }
        else{
            System.out.println("numero repetido, por favor verifique a lista de numeros usados e tente novamente");
            System.out.println(NumerosUsados);
            getNumbers();
        }

    }
    void TestInicial(int a,int b,int c,int d,int e){
        //acabar com a graça do jogador que jogar 5 vezes o mesmo numero, ou numero repetido
        cache.removeAll(cache);
        if(cache.add(a) == false){
            System.out.println("Algum numero repetido, verifique");
            getNumbers();

        }
        if(cache.add(b) == false){
            System.out.println("Algum numero repetido, verifique");
            getNumbers();

        }
        if(cache.add(c) == false){
            System.out.println("Algum numero repetido, verifique");
            getNumbers();

        }
        if(cache.add(d) == false){
            System.out.println("Algum numero repetido, verifique");
            getNumbers();

        }
        if(cache.add(e) == false){
            System.out.println("Algum numero repetido, verifique");
            getNumbers();

        }
        
        else{
            TestNumeroRept(a, b, c, d, e);
        }}
    void fazerTentativa(int a, int b, int c, int d, int e)   {
        index +=5;
        //classe que cria a lista e verifica os resultados, alem de criar um laço com a getnumbers
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
    NumerosUsados.add(a);
    NumerosUsados.add(b);
    NumerosUsados.add(c);
    NumerosUsados.add(d);
    NumerosUsados.add(e);
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
            System.out.println("VOCÊ ACERTOU, PARABÉNS");
            System.out.println(lista);
            getContadorPesquisa();
        }
        if(x!=5){
            System.out.println("Você ainda não adivinhou a senha!");
            
        }
    }
}