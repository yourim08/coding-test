function solution(todo_list, finished) {
       var count=0;
        for(var i=0; i<finished.length ; i++){
            if(!finished[i]) {
                count++;
            }
        }
        var answer = [count];
        var n=0;
        for(var i=0; i<todo_list.length;i++){
            if(!finished[i]) {
                answer[n]=todo_list[i];
                n++;
            }
        }
    return answer;
}