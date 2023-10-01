// Este código permite al usuario ingresar un número y lo guarda en la variable "num" mediante la función Number y el prompt.
let num = Number(prompt("Ingrese un número"));
// Este bucle se ejecutará mientras el número ingresado no sea válido, es decir, mientras no sea un número. Nos pedirá que ingresemos un número válido hasta que lo hagamos.
while (isNaN(num)) {
  num = Number(prompt("Ingrese un número válido"));
}
// El código define una lista llamada fibonacci que comienza con los valores 0 y 1. Éstos son los primeros dos números de la secuencia de Fibonacci, donde cada número es la suma de los dos anteriores.
let fibonacci = [0, 1];
// Este código utiliza la serie de Fibonacci para encontrar los números hasta un determinado valor (num). Si num es igual a 0, imprime 0. Si num es igual a 1, imprime 0 y 1. De lo contrario, utiliza un bucle for para generar el resto de números de la serie de Fibonacci hasta llegar a num.
if (num === 0) {
  console.log(0);
} else if (num === 1) {
  console.log(0, 1);
} else {
  for (let i = 2; i < num; i++) {
    let nextNum = fibonacci[i - 1] + fibonacci[i - 2];
    fibonacci.push(nextNum);
  }
  // Esto imprimirá la secuencia de Fibonacci separada por comas.
  console.log(fibonacci.join(", "));
}
