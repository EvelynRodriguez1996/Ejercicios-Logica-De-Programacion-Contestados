// Solicitar tres números por prompt
var numero1 = prompt("Ingrese el primer número:");
var numero2 = prompt("Ingrese el segundo número:");
var numero3 = prompt("Ingrese el tercer número:");

// Convertir los valores a números
numero1 = parseInt(numero1);
numero2 = parseInt(numero2);
numero3 = parseInt(numero3);

// Verificar que los valores ingresados sean números
if (isNaN(numero1) || isNaN(numero2) || isNaN(numero3)) {
  console.log("Por favor, ingrese solo valores numéricos.");
} else {
  // Ordenar los números de mayor a menor y de menor a mayor
  var numerosOrdenados = [numero1, numero2, numero3].sort(function(a, b){return a - b});
  var numerosOrdenadosInverso = [numero1, numero2, numero3].sort(function(a, b){return b - a});

  // Mostrar los números ordenados por consola
  console.log(numerosOrdenados.join(", "));
  console.log(numerosOrdenadosInverso.join(", "));

  // Mostrar un mensaje si los números son iguales
  if (numero1 === numero2 && numero2 === numero3) {
    console.log("Los números ingresados son iguales.");
  }
}
