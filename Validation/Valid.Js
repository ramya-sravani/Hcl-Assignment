function validate(){
    var title= document.getElementById("titleid").value.trim(); //trim for empty spaces
    var author = document.getElementById("authorid").value.trim();
    if (title==""){
      document.getElementById("titlemsg").innerHTML="enter Book Title";
      document.getElementById("titlemsg").style.color="red";
       return false;
    }
    if(author==""){
        document.getElementById("authormsg").innerHTML="enter Author name";
        document.getElementById("authormsg").style.color="red";
        return false;
    }
  
    var x, text;

    
    x = document.getElementById("copiesid").value;
  
   
    if (isNaN(x) || x < 1 || x > 10) {
      text = "No.of copies cannot be greater than 10";
      document.getElementById("copiesmsg").innerHTML = text;
    document.getElementById("copiesmsg").style.color="red";
    return false;
    } 
    
return alert("form submitted successfully");
}