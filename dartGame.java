class Solution {
    public int solution(String dartResult) {
        int j = 0;
        int sum = 0;
        int c = 0;
        int n = dartResult.length();
        for(int i = 0; i < 3; i++) {
            int number = dartResult.charAt(j+1)=='0'?10:dartResult.charAt(j++)-'0';  
            if(number==10)j+=2;
            switch(dartResult.charAt(j)) {
                case 'D' : number*=number; break;
                case 'T' : number*=number*number; break;
            }
            int a = 1;
            switch(dartResult.charAt(++j%n)) {
                case '*' : sum+=c; number*=2; break;
                case '#' : sum-=number*2; a=-1; break;
                default : j--;
            }
            j++;
            c = number * a;
            sum+=number;
            System.out.println("number : " + number + "\t sum : " + sum + "\t c : " + c);
        }
        return sum;
    }
}
