class Solution {
    public int[] solution(String my_string) {
        int count=0;
        int n=0;
        int temp=0;
        for(int i=0; i<my_string.length();i++){
            if(my_string.charAt(i)>=48 && my_string.charAt(i)<=57) 
                count++;
        }
        int a[] = new int[count];
           for(int i=0; i<my_string.length();i++){
            if(my_string.charAt(i)>=48 && my_string.charAt(i)<=57){
                a[n]= Character.getNumericValue(my_string.charAt(i));
                n++;
            } 
        }
        for(int i=0; i<a.length ;i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }      
            }
        }
        int[] answer = a;
        return answer;
    }
}