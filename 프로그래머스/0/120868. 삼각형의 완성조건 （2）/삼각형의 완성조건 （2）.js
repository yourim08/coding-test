function solution(sides) {
        var answer = 0;
        sides.sort((a,b)=> a-b);
        var max=sides[1];
        var min=sides[0];
        var i=0;
        var j=2000;
        // max가 가장 긴 변
        while(true){
            i++;
            if(max<i) break;
            if(min<=max && i<=max){
                if(min+i>max){
                    answer++;
                }
            }
        }
        // j가 가장 긴 변 
        while(true){
            j--;
            if(j<max || j<min) break;
            if(min<j && max<j){
                if(min+max>j){
                    answer++;
                }
            }
        }
    return answer;
}