//Definicion de variables
console.log("Definiendo variables");
let rango = parseInt(prompt("Hola. Hasta que rango quieres adivinar el número?"));
let numeroSecreto = Math.floor(Math.random()*rango) + 1;
let numeroUsuario;
let intentos = 1;
let maximosIntentos = 10;
while(numeroUsuario != numeroSecreto){
    // Incrementamos el número de intentos
    
    numeroUsuario = parseInt(prompt(`Me indicas un número entre 1 y ${rango} por favor:`));
    
    //Mostrar valor en la consola
    console.log('Numero secreto: ' + numeroSecreto);
    
    //Verificar número de intentos
    /*
    Lógica del programa
    */
   if(numeroUsuario == numeroSecreto){
       alert(`Acertaste, el número es: ${numeroUsuario}. Lo hiciste en ${intentos} ${intentos == 1 ? 'vez' : 'veces'}`);
    } else {
        if(numeroUsuario < numeroSecreto) {
            alert("El número secreto es mayor")
        } else {
            alert("El número secreto es menor")
        }
        intentos++;
        if(intentos > maximosIntentos){
            alert(`Llegaste al núemro máximo de ${maximosIntentos} intentos`);
            break;
        }
    }
}