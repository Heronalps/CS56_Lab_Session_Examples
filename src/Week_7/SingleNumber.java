public class SingleNumber {

    public int singleNumber(int[] A) {
        if(A == null || A.length == 0) {
            return -1;
        }
        int rst = 0;
        for (int i = 0; i < A.length; i++) {
            rst ^= A[i];
        }
        return rst;
    }

    public List<Integer> singleNumberII(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        
        int lastBit = xor - (xor & (xor - 1));
        int group0 = 0, group1 = 0;
        for (int i = 0; i < A.length; i++) {
            if ((lastBit & A[i]) == 0) {
                group0 ^= A[i];
            } else {
                group1 ^= A[i];
            }
        }
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(group0);
        result.add(group1);
        return result;
    }
}