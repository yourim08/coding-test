function solution(array) {
    var answer = new Array(2);
    var max = 0;
    var maxindex = 0;
    for(var i=0; i<array.length; i++){
        if(array[i]>max) {
            max=array[i];
            maxindex=i;
        }
    }
    answer[0]=max;
    answer[1]=maxindex;
    return answer;
}