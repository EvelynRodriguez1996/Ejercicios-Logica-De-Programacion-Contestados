let temperatura = prompt("Ingrese la temperatura en grados Celcius");

// Verificar que la temperatura ingresada sea un número
if (isNaN(temperatura)) {
  console.log("Error: Por favor ingrese un número válido");
} else {
  temperatura = Number(temperatura);

  // Convertir de grados Celsius a grados Fahrenheit
  let fahrenheit = (temperatura * 9/5) + 32;
  console.log("Grados Fahrenheit: " + fahrenheit);

  // Convertir de grados Celsius a grados Kelvin
  let kelvin = temperatura + 273.15;
  console.log("Grados Kelvin: " + kelvin);
}