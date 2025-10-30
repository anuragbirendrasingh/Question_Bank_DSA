// sorted array
let arr = [10,20,20,30,40,50,50];
let newArr = [];
newArr[0] = arr[0];
let j = 0 ;
for(let i=1 ; i<arr.length ; i++){
    //  newArr[i] = arr[i-1];
     if(arr[i-1]==arr[i]){
        continue ;
     }
     newArr[j] = arr[i];
     j++;
  
    
}

console.log(newArr);
