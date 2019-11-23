function remove5n7(arr) {
    console.log(arr);
    var res = new Array();
    var j = 0;
    for(i=0; i<arr.length; i++) {
        if(arr[i]%5 == 0 && arr[i]%7 == 0) {
            continue;
        }
        res[j] = arr[i];
        j++;
    }
    console.log(res);
}

remove5n7(new Array(5, 7, 12, 35, 49));

