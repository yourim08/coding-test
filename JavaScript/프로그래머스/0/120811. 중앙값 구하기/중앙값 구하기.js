function solution(array) {
    var answer = 0;
    var temp=0;
    for(var i=0; i<array.length ;i++){
        for(var j=i+1; j<array.length; j++)
        if(array[i]>array[j]){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
        }
    }
    answer=array[Math.floor(array.length/2)];
    return answer;
}