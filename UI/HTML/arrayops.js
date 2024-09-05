const cars = [1, "tata", 2025, "kia", true];

// console.log(cars[3]);
// console.log(typeof cars);
// cars[5] = 2020;
// cars[9] = "BMW";

// console.log(cars);
// console.log(cars[10]);

let numbers = new Array(11, 2, 4, 7, 9);
// numbers[0] = Date.now();
// console.log(numbers);
// console.log(numbers.toString());

// console.log(numbers.length);
let sorted = cars.sort();

// console.log(sorted);

// console.log(numbers.sort((a, b) => b - a));

for (let index = 0; index < numbers.length; index++) {
  const element = numbers[index];
  console.log(element);
}

// function displayNumbers(value) {
//     console.log(value);

// }

// cars.forEach(displayNumbers)

cars.forEach((value) => console.log(value)); //arrow or anonymous function

console.log(numbers.join("*"));

console.log(numbers.pop()); //gives you the element which is deleted

console.log(numbers);

console.log(numbers.push(15)); //gives length of array

console.log(numbers.shift()); //element which is removed
console.log(numbers.unshift(28)); //length of array
console.log(numbers);
// delete numbers[4];
// console.log(numbers);

// console.log(numbers.concat(cars, [12345678]));

console.log(numbers.copyWithin(2, 1)); //copy to index 2, all the elements from index 0
// console.log(cars.copyWithin(2,0,4));//copy to index 2, all the elements from index 0 to 2

console.log(numbers);

var arr = [
  [1, 2],
  [3, 4],
  [5, 6],
];
var newFlatArr = arr.flat();

console.log(newFlatArr.flatMap((x) => [x, x * 10]));

const carmodels = [
  { tye: "Volvo", year: 2016 },
  { tye: "BMW", year: 2023 },
  { tye: "Kia", year: 2015 },
];

console.log(carmodels.sort((a, b) => b.year - a.year));

let numArray = new Array(11, 16, 9, 8, 0, 1, 21, 4);
console.log(numArray.filter(val  => val > 4));

console.log(numArray.filter((val, index) => index > 4));//based on index filtering

console.log(numArray.map((val) => val * 2));

console.log(numArray.reduce((total ,val) => total + val));

