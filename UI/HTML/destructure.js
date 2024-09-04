const [a, b, c] = [1, 3];
// Array Destructuring
console.log(a, c);
console.log(b);

//Object Destructuring
const { name, age, isMarried } = { name1: "Jack", age: 25, name: "Peter" };

console.log(name, age, isMarried);

const number1 = [1, 2, 3];
const number2 = [4, 5, 6];
// Spread Operator
const numbers = [...number1, ...number2];
console.log(numbers);

function displayNumbers(...params) {
  for (const arg of params) {
    console.log(arg);
  }
}
// Rest Operator

displayNumbers(1, 2, 3);
displayNumbers(600, 26, 34, 67, 89, 90);

const sum = (...numbers) => numbers.reduce((a, b) => a + b, 0);

console.log("***********************************************************************");

console.log(sum(1, 2, 3));
console.log(sum(100, 500, 600, 300));
