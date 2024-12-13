function solution(num_list, n) {
        var count1=0;
        var m=0;
        while(true){
            if(m*n<num_list.length){ 
                count1++;
                m++;
            }
            else break;
        }
        var answer = new Array(count1);
        var count=0;
        for(var i=0; i<answer.length;i++){
            answer[i]=num_list[count];
            count+=n;
        }
    return answer;
}