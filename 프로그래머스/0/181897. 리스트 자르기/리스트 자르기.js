function solution(n, slicer, num_list) {
    var answer;
    let m=0;
    let l=0;
    let k=0;
    if(n === 1){
        answer = new Array(slicer[1]+1);
        for(let i=0;i<answer.length; i++){
            answer[i] = num_list[i];   
        }
    }
    else if(n === 2){
        answer = new Array(num_list.length-slicer[0]);
        for(let i=slicer[0]; i<num_list.length; i++){
            answer[m]=num_list[i];
            m++;
        }
    }
    else if(n === 3){
            answer = new Array(slicer[1]-slicer[0]+1);
            for(let i=slicer[0]; i<=slicer[1];i++){
                answer[l]=num_list[i];
                l++;
            }        
        }
        else if(n === 4){
            var count = slicer[1]-slicer[0]+1;
            if(count%slicer[2] === 0) {
                count/=slicer[2];
            }
            else {
                count=count/slicer[2]+1;
            }
            answer = new Array(1);
            for(let i=slicer[0];i<=slicer[1];i+=slicer[2]){
                answer[k]=num_list[i];
                k++;
            }
        }
        else answer = new Array(1);
    
    return answer;
}