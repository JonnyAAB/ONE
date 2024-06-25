// Aquí estamos obteniendo un objeto del documento HTML (Document Object Model)
let titulo = document.querySelector('h1');
titulo.innerHTML = "Juego del número secreto"

let parrafo = document.querySelector('p');
parrafo.innerHTML = "Indica un número del 1 al 10";

//Definiendo funciones
function intentoDeUsuario(){
    alert("Clic desde el botón");
}