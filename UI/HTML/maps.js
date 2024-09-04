require("core-js/actual/array/group-by-to-map");
require("core-js/actual/array/group-by");

const fruits = new Map([
  ["banana", 300],
  ["apple", 100],
  ["kiwi", 200],
]);

console.log(fruits);

const fruits1 = new Map();

fruits1.set("orange", 500);
fruits1.set("mango", 400);
fruits1.set("pineapple", 100);

console.log(fruits1.get("mango"));

console.log(typeof fruits);
console.log(fruits instanceof Map);

console.log(fruits.delete("apple"));
// console.log(fruits.clear());

console.log(fruits1.has("mango"));

console.log(fruits.size);

fruits1.forEach((value, key) => {
  console.log(key + " ");
  console.log(value + " ");
});

for (const element of fruits.entries()) {
  console.log(element);
}

for (const element of fruits.keys()) {
  console.log(element);
}
for (const element of fruits.values()) {
  console.log(element);
}

const tata = { name: "tata" };
const kia = { name: "kia" };

const cars = new Map();

cars.set(tata, 2023);
cars.set(2024, kia);

console.log(cars.get(tata));

// const fruitArray = [
//   { name: "apple", price: 300 },
//   { name: "kiwi", price: 100 },
//   { name: "banana", price: 150 },
//   { name: "mango", price: 200 },
// ];

// function priceCheck({price}){
//     return price > 150 ? "Price is high, please add money into your wallet" : "We have money for this";
// }

// const priceCheckResult =  Map.groupBy(fruitArray, priceCheck)
// console.log(priceCheckResult);


console.log(Array.from(fruits.keys()));
console.log(Array.from(fruits.values()));

