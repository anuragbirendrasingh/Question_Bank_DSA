const fn = function (value) {
  const fn1 = function toBE(val) {
    if (value === val) {
      return true;
    } else {
      throw new Error("NOT Equal");
    }
  };

  const fn2 = function notToBe(val) {
    if (value != val) {
      return true;
    } else {
      throw new Error(" Equal");
    }
  };
  return { fn1, fn2 };
};

const data = fn(5).fn1(5);
const data2 = fn(5).fn2(10);

console.log(data);
console.log(data2);

