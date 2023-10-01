// Pedir al usuario un número del 1 al 100
let numeroSecreto = Math.floor(Math.random() * 100) + 1;
let numerosIngresados = [];

function adivinarNumero() {
  let numeroIngresado = prompt("Ingresa un número del 1 al 100:");

  // Verificar si el dato ingresado es un número
  if (isNaN(numeroIngresado)) {
    console.error("Por favor, ingresa un número válido.");
    adivinarNumero();
    return;
  }

  numeroIngresado = Number(numeroIngresado);

  numerosIngresados.push(numeroIngresado);

  // Verificar si el número ingresado es el número secreto
  if (numeroIngresado === numeroSecreto) {
    console.log("Felicidades, adivinaste el número secreto.");
    console.log("Números ingresados: " + numerosIngresados.join(", "));
  } else {
    console.log("Ups, el número secreto es incorrecto. Vuelve a intentarlo.");
    adivinarNumero();
  }
}

adivinarNumero();