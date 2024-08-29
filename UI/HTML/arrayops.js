const cars = [1, "tata", 2025, "kia", true];

console.log(cars[3]);
console.log(typeof cars);
cars[5] = 2020;
cars[9] = "BMW";

console.log(cars);
console.log(cars[10]);

let numbers = new Array(11, 2, 4, 7, 9);
// numbers[0] = Date.now();
console.log(numbers);
console.log(numbers.toString());

console.log(numbers.length);
let sorted = cars.sort();

console.log(sorted);

console.log(numbers.sort((a, b) => b - a));

for (let index = 0; index < numbers.length; index++) {
  const element = numbers[index];
  console.log(element);
}

// function displayNumbers(value) {
//     console.log(value);

// }

// cars.forEach(displayNumbers)

cars.forEach((value) => console.log(value)); //arrow or anonymous function
