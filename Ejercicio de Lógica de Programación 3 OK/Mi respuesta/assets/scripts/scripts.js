// Solicitar número por prompt
let numero = prompt("Ingrese un número");

// Convertir el número a tipo number
numero = Number(numero);

// Verificar si el número ingresado es válido
while (isNaN(numero)) {
  // Mostrar mensaje de error
  alert("El valor ingresado no es un número válido.");

  // Volver a solicitar el número por prompt
  numero = prompt("Ingrese un número");

  // Convertir el número a tipo number
  numero = Number(numero);
}

// Calcular el factorial del número
let factorial = 1;
for (let i = 1; i <= numero; i++) {
  factorial *= i;
}

// Imprimir el resultado por consola
console.log(factorial);