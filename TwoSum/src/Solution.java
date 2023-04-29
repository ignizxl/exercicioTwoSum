public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){

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