class NthUglyNumber {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int i =0,j=0,k = 0;

        for (int index = 1;index < n ;index++) {
            int temp = Math.min(ugly[i]*2,Math.min(ugly[j]*3,ugly[k]*5));
            if (temp == ugly[i]*2) i++;
            if (temp == ugly[j]*3) j++;
            if (temp == ugly[k]*5) k++;

            ugly[index] = temp; 
        }

        return ugly[n-1];
    }
}