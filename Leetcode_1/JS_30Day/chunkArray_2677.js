let arr = [1, 2, 3, 4, 5];
let k = 2;
// let newarr = []; // impure -- function correct but not best practise
// output will be different for same input if we call it

function chunkarr(arr, k) {
  let newarr = [];
  let n = arr.length;
  for (let i = 0; i < n; i = i + k) {
    newarr.push(arr.slice(i, i + k));
  }

  return newarr;
}

const ans = chunkarr(arr, k);
console.log(ans);
