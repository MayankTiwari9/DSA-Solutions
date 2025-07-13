// let arr = [ -2, 1, -3, 4, -1, 2, 1, -5, 4 ];
// let arr = [5, 4, -1, 7, 8];
let arr = [1];

function maxSubarray(arr) {
  let max = arr[0];

  // Brute Force

  // for (let i = 0; i < arr.length; i++) {
  //     let curr = 0;

  //     for (let j = 0; j < arr.length; j++) {
  //         curr += arr[j];

  //         max = Math.max(max, curr);

  //         if(curr < 0)
  //             curr = 0;
  //     }
  // }

  //Optimised
  let curr = 0;
  for (let i = 0; i < arr.length; i++) {
    curr += arr[i];

    max = Math.max(curr, max);

    if (curr < 0) curr = 0;
  }

  return max;
}

console.log(maxSubarray(arr));
