
//num=0;
function fibonacci(num){
    var fib = [1,1];
    for(i=2; i<num; i++){
        fib[i] = fib[i-2] + fib[i-1];
    }
    return fib;
}

fib = fibonacci(10);
console.log(fib);
