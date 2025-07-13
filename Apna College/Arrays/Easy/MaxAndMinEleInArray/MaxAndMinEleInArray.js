let arr = [56789];

function MaxAndMinEleInArray(arr) {

    let min = arr[0];
    let max = arr[0];

    for (let i = 0; i < arr.length; i++) {
        max = Math.max(arr[i], max);
        min = Math.min(arr[i], min);        
    }
    
    return {min, max};
}

console.log(MaxAndMinEleInArray(arr));