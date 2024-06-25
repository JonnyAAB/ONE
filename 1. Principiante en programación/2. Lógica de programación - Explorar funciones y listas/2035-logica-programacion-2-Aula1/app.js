//Definiendo variables
let numeroSecreto;
let intentos;
let listaNumerosSorteados = [];
let numeroMaximo = 10;


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
    let numeroGenerado = Math.floor(Math.random()*numeroMaximo) + 1;
    if(listaNumerosSorteados.length == numeroMaximo){
        asignarTextoElemento("p", "Ya se sortearon todos los números posibles");
    } else {
        //Si el numero generado esta incluido en la lista
        if(listaNumerosSorteados.includes(numeroGenerado)){
            return generarNumeroSecreto();
        } else {
            listaNumerosSorteados.push(numeroGenerado);
            console.log(listaNumerosSorteados);
            return numeroGenerado;
        }
    }
    console.log(listaNumerosSorteados);
}
function condicionesIniciales(){
    asignarTextoElemento("h1","Juego del número secreto!");
    asignarTextoElemento("p",`Indica un número del 1 al ${numeroMaximo}`);
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