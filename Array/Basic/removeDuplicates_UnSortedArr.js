// wrong code 

let arr = [10,20,30,40,50,10,20,30];

let ans = [];

for (let i = 0; i < arr.length; i++) {
  let isDuplicate = false;

  // peeche check karo
  for (let j = 0; j < i; j++) {
    if (arr[i] === arr[j]) {
      isDuplicate = true;
      break;
    }
  }

  if (!isDuplicate) {
    ans.push(arr[i]);
  }
}

console.log(ans);