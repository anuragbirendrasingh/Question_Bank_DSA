// let x = 5 ;
// console.log(x);
// x = x++ ;
// console.log(x);
// let y = 6 ;
// console.log(y++);


let arr = [2,4,5,9,8,7,6,10];

let i = 0 ;
let j = arr.length-1 ;

while(i<j){
    if(arr[i]%2==0 && arr[j]%2!==0){
       let temp = arr[i];
       arr[i]=arr[j];
       arr[j]=temp ;
       i++;
       j--
    }
    else if(arr[i]%2!=0){
        i++;
    }
    else {
        j--;
    }
}
console.log(arr);




