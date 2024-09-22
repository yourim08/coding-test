class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(int i=0; i<order.length ; i++){
            if(order[i].equals("americanoice") || order[i].equals("iceamericano")
               || order[i].equals("americanohot") || order[i].equals("hotamericano")
               || order[i].equals("americano") || order[i].equals("anything"))
                answer+=4500;
            else if(order[i].equals("cafelattehot") || order[i].equals("hotcafelatte")
               || order[i].equals("cafelatteice") || order[i].equals("icecafelatte")
               || order[i].equals("cafelatte"))
                answer+=5000;
        }
        return answer;
    }
}