public class ReOrdenar {

    public static int ordenarDesc(final int num) {
        int num2 = num;
        int length = String.valueOf(num).length();
        int[] nums = new int[length];
        int cont = 0;

        while(num2>0){
            nums[cont++]= num2%10;
            num2=num2/10;
        }

        int aux = -1;
        for(int i= 0;i<nums.length-1;i++){
            for(int j = 0; j < nums.length -1 -i;j++){
                if(nums[j] < nums[j + 1]) {
                    int numAux = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = numAux;
                }
            }
        }

        String string = "";
        for(int i = 0;i<nums.length;i++) string += nums[i];
        int result = Integer.parseInt(string);
        return result;
    }
}