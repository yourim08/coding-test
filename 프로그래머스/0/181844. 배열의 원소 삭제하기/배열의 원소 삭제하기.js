function solution(arr, delete_list) {
    let same=0;
    let n=0; 
    for(let i=0; i<delete_list.length ;i++){
        for(let j=0; j<arr.length;j++){
            if(delete_list[i]==arr[j]) same++;
        }
    }
    var answer = new Array(arr.length-same);
    for(let i=0; i<arr.length ;i++){
        let count=0;
        for(let j=0; j<delete_list.length;j++){
            if(arr[i]!=delete_list[j]){
                count++;
            }
            if(count==delete_list.length) {
                answer[n]=arr[i];
                n++;
            }
        }
    }
    return answer;
}