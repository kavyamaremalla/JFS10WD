// var x = 7

// var y = 7

// var z = x + y

// x = "Hi"

// var y = ",Welcome"

// var z = x + y;

// let x1;

// let y1 = 9;

// x1 = "Hello ";

// let z1 = x1 + y1;

// const name = "Jack"

// // name = "Jill";

// // console.log(z)
// // console.log(z1)
// // console.log(name);

// let length = 19;

// let breadth = 16.89;

// let value = true;

// let math;

// let shape = "square"

// // console.log(typeof value);

// var fName = "Peter"; //global
// {
//     var fName = "Jack"; //local
//     console.log(fName);
// }
// console.log(fName);//no scope of global and local in case of var

// let lName = "Potter"; //global
// {
//     let lName = "Jill"; //local
//     console.log(lName);
// }

// console.log(lName);// we have scope of global and local variables for cont, let

// let todayDate = new Date("2024-07-27");
// console.log(todayDate);

// let str = new Boolean("true");
// console.log(typeof str);

// console.log(typeof Number("abc"));
// console.log(typeof String(123));
// console.log( Math.log2(4));
// String(true)

// console.log(5+null);
// console.log(("5 " + null));

let obj = JSON.parse(
  '{"model": "nano",  "color": "white",   "secondHand": false,  "price": 100000}'
);

console.log(obj.color);

const text = '["Tata", "Ford", "Kia"]';
const myArray = JSON.parse(text);

console.log(myArray);
console.log(myArray instanceof Array);

console.log(typeof myArray);

const myJSON = JSON.stringify({
  firstName: "Peter",
  lastName: "Parker",
  language: "",
});

console.log(myJSON);
console.log(typeof myJSON);

function Person(first, last) {
  this.firstName = first;
  this.lastName = last;
}

console.log(Person.prototype); //inspect and put this in console

console.log("*************************************************");


const father = new Person("Jack", "Doe");
const mother = new Person("Ana", "Doe");

Person.age = 40;
console.log(father.age);

Person.prototype.age = 45;
console.log(father.age);
console.log(mother.age);
