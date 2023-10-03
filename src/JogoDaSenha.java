import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class JogoDaSenha {
    List<Integer> numeros_usados = new ArrayList<Integer>();
    int x = 0;
    int s =0;
    int index = 0;
    List<Integer> lista = new ArrayList<Integer>();
    List<Integer> cache = new ArrayList<Integer>();
    void getNumbers(){
        //classe que interage com o usuario atraves do scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 5 valores para começarmos o jogo: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        TestNumeroRept(x, y, z, a, b);
    }
    void TestNumeroRept(int a,int b,int c,int d,int e){
        cache.removeAll(cache);
        cache.add(a);
        cache.add(b);
        cache.add(c);
        cache.add(d);
        cache.add(e);
        s=0;
        int s2 = 0;
        if(numeros_usados.contains(a) == false){
            s2=0;
            for(int l =0; l<5;l++){
                if(a!=cache.get(l)){
                    s2++;
                }
            }
            if(s2 == 4){
                s++;
            }
            else{
                System.out.println("Algum numero repetido verifique");
                getNumbers();
            }
        
        }
        if(numeros_usados.contains(b) == false){
            s2=0;
             for(int l =0; l<5;l++){
                if(b!=cache.get(l)){
                    s2++;
                }
            }
            if(s2 == 4){
                s++;
            }
            else{
                System.out.println("Algum numero repetido verifique");
                getNumbers();
            }
            
        }
        if(numeros_usados.contains(c) == false){
            s2=0;
             for(int l =0; l<5;l++){
                if(c!=cache.get(l)){
                    s2++;
                }
            }
            if(s2 == 4){
                s++;
            }
            else{
                System.out.println("Algum numero repetido verifique");
                getNumbers();
            }
            
        }
        if(numeros_usados.contains(d) == false){
            s2=0;
             for(int l =0; l<5;l++){
                if(d!=cache.get(l)){
                    s2++;
                }
            }
            if(s2 == 4){
                s++;
            }
            else{
                System.out.println("Algum numero repetido verifique");
                getNumbers();
            }
            
        }
        if(numeros_usados.contains(e) == false){
            s2=0;
             for(int l =0; l<5;l++){
                if(e!=cache.get(l)){
                    s2++;
                }
            }
            if(s2 == 4){
                s++;
            }
            else{
                System.out.println("Algum numero repetido verifique");
                getNumbers();
            }  
        }
        if(s == 5){
            numeros_usados.add(a);
            numeros_usados.add(b);
            numeros_usados.add(c);
            numeros_usados.add(d);
            numeros_usados.add(e);
            fazerTentativa(a, b, c, d, e);
        }
        else{
            System.out.println("Algum numero repetido verifique a lista e tente novamente ");
            System.out.println(numeros_usados);
            getNumbers();
        }
        
    }
    void fazerTentativa(int a, int b, int c, int d, int e)   {
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
            System.out.println("VOCÊ ACERTOU, PARABÉNS");
            System.out.println(lista);
            getContadorPesquisa();
        }
        if(x!=5){
            System.out.println("Você ainda não adivinhou a senha!");
            
        }
    }
}