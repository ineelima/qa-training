
function isVowel(arr){
    arr = arr.toLowerCase();
    temp = new Array();
    
    for(i=0;i<arr.length;i++){
        if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u')
            continue;
        else
            temp[i]=arr[i];
    }
    console.log(temp.join(""));
 }
isVowel("INNOVAPATH");




    