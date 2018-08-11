import java.util.Stack;

/**
 * Essa classe não tem relação com o exemplo, somente
 * serve para representar um exemplo de pilha.
 */

public class Balanceamento {

    public static boolean isBalanceada(String equacao){

        Stack<Character> pilha = new Stack<>();

        for(int i=0; i<equacao.length(); i++){
            if(equacao.charAt(i) == '('){
                pilha.push('(');
            }else if(equacao.charAt(i) == ')'){
                if(pilha.isEmpty()){
                    return false;
                }else{
                    pilha.pop();
                }
            }
        }
        return pilha.isEmpty();
    }

}