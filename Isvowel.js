
function isVowel(arr){
    //arr = arr.toLowerCase();
    temp = new Array();
    
    for(i=0;i<arr.length;i++){
        if(arr[i]=='a' || arr[i]=='A'|| arr[i]=='e'  ||arr[i]=='E'|| arr[i]=='i'|| arr[i]=='I' || arr[i]=='o' ||arr[i]=='O' || arr[i]=='u' || arr[i]=='U')
            continue;
        else
            temp[i]=arr[i];
    }
    console.log(temp.join(""));
 }
isVowel("INNOVAPATH");
isVowel("Neelima");




    