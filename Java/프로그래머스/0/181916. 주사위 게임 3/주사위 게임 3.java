import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        // 4개 같음
        if(a==b && b==c && c==d) {
            answer = 1111*a;
        }
        // 3개 같고 1개 다름
        else if(a!=b && b==c && c==d){
            answer = (10*b+a)*(10*b+a);
        } 
        else if(b!=c && c==d && d==a){
            answer = (10*c+b)*(10*c+b);
        } 
        else if(c!=d && d==a && a==b){
            answer = (10*d+c)*(10*d+c);
        } 
        else if(d!=a && a==b && b==c){
            answer = (10*a+d)*(10*a+d);
        } 
        // 2개씩 같음
        else if(a==b && c==d){
            answer=Math.abs(a-c)*(a+c);
        }
        else if(a==c && b==d){
            answer=Math.abs(a-b)*(a+b);
        }
        else if(a==d && b==c){
            answer=Math.abs(a-b)*(a+b);
        }
        // 2개 같고, 2개 다름
        else if(a==b && c!=d){
            answer=c*d;
        }
        else if(a==c && b!=d){
            answer=b*d;
        }
        else if(a==d && c!=b){
            answer=c*b;
        }
        else if(b==c && a!=d){
            answer=a*d;
        }
        else if(b==d && c!=a){
            answer=c*a;
        }
        else if(c==d && a!=b){
            answer=a*b;
        }
        // 다 다름
        else {
            int arr[] = new int[4];
            arr[0]=a;
            arr[1]=b;
            arr[2]=c;
            arr[3]=d;
            Arrays.sort(arr);
            answer=arr[0];
        }
        return answer;
    }
}