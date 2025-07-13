let arr = [ 1, 4, 3, 2, 6, 5 ];
// let arr = [4, 5, 2];
// let arr = [1];

function solution(arr) {
  let n = arr.length;

  // Brute Force
  //   let temp = [];

  //   for (let i = 0; i < n; i++) {
  //     temp[i] = arr[n - 1 - i];
  //   }

  //   return temp;

  // Optimised

  for (let i = 0; i < n / 2; i++) {
    let temp = arr[i];
    arr[i] = arr[n - i - 1];
    arr[n - i - 1] = temp;
  }

  return arr;
}

console.log(solution(arr));
