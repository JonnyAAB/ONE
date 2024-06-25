//Definiendo variables
let numeroSecreto;
let intentos;
console.log(numeroSecreto);


//Definiendo funciones
function asignarTextoElemento(elemento, texto){
    let elementoHTML = document.querySelector(elemento);
    elementoHTML.innerHTML = texto;
    return;
}
function verificarIntento(){
    let numeroDeUsuario = parseInt(document.getElementById("valorUsuario").value);
    if(numeroDeUsuario === numeroSecreto){
        asignarTextoElemento("p",`Acertaste el número en ${intentos} ${intentos === 1 ? "intento" : "intentos"}`);
        document.getElementById("reiniciar").removeAttribute("disabled");        
    } else {
        // El usuario no acertó el número
        if(numeroDeUsuario > numeroSecreto){
            asignarTextoElemento("p", "El número secreto es menor");
        } else {
            asignarTextoElemento("p", "El número secreto es mayor");
        }
        intentos++;
        limpiarCaja();
    }
    return;
}
function limpiarCaja(){
    document.querySelector("#valorUsuario").value = "";
}
function generarNumeroSecreto() {
    return Math.floor(Math.random()*10) + 1;
}
function condicionesIniciales(){
    asignarTextoElemento("h1","Juego del número secreto!");
    asignarTextoElemento("p","Indica un número del 1 al 10");
    numeroSecreto = generarNumeroSecreto();
    intentos = 1;
}
function reiniciarJuego(){
    //Limpiar la caja
    limpiarCaja();
    //Indicar mensaje de rango de números
    //Generar nuevo número aleatorio
    //Reiniciar el número de intentos
    condicionesIniciales();
    //Deshabilitar botón de nuevo juego
    document.querySelector("#reiniciar").setAttribute("disabled","true");
}

condicionesIniciales();