public class Solution {
    public int[] twoSum(int[] nums, int target) {

        //a lógica aqui é a seguinte.
        //cria um laço para pegar o primeiro elemento vetor
        for (int i = 0; i < nums.length; i++){
            //e outro laço for para 'varrer' cada elemento depois do primeiro elemento vetor
            for (int j = i + 1; j < nums.length; j++){
                //e a cada iteração faz a verificação se a soma dos elementos que estão sendo comparados é igual ao target,
                //e se for igual o target, retorna os indices
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
}


/**

 Exemplos de entrada e de saída esperada

        entrada: nums = [2,7,11,15], target = 9
        saida: [0,1]
        a saida foi '0' e '1' porque a soma dos valores dos indices 0 (que é 2) + o indice 1 (que é 7)
        vai ser igual ao meu alvo que é 9

*/