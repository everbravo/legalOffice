function validar(){
    var usuario, contraseña;
    usuario = document.getElementById("usuario").value;
    contraseña = document.getElementById("contraseña").value;

    if(usuario === ""){
        alert("El campo usuario esta vacio...");
        return false;
    }else if(contraseña === ""){
        alert("El campo contraseña esta vacio...");
        return false;
    }else if(usuario.length>15){
        alert("El usuario no debe sobrepasar de los 15 caracteres");
        return false;
    }else if(contraseña.length>18){
        alert("La contraseña no debe sobrepasar de los 18 caracteres");
        return false;
    }

    if(usuario.getElementById("usuario").value === "ever" && contraseña.getElementById("contraseña") === "1234567890"){
        window.location.replace("index.html");
    }else{
        window.location.replace("i.html");
    }
}