function count(arr, c){
    j=0;
    for(i=0;i<arr.length;i++) {
      if(arr[i]==c){
        j++;  
      }
    }
    console.log(j);
  }
  count("bubble",'b');
  count("apple",'p')