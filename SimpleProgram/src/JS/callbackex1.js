function processArray(arr,callback){

    var resultArr = new Array();
    for(var i = 0; i<arr.length;i++){

        resultArr[i]=callback(arr[i]);
    }

   return resultArr;

}


var arr = [1,2,3,4];

var result = processArray(arr,function callback(arg){return arg*2});

console.log( 'result array is  ' + result);


function foo(x) {
    var tmp = 3;

    function bar(y) {
        alert(x + y + (++tmp)); // will alert 16
    }

    bar(10);
}

foo(2);