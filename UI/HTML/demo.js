var x = 7

var y = 7

var z = x + y

x = "Hi"

var y = ",Welcome"

var z = x + y;

let x1;

let y1 = 9;

x1 = "Hello ";

let z1 = x1 + y1;

const name = "Jack"

// name = "Jill";

// console.log(z)
// console.log(z1)
// console.log(name);


let length = 19;

let breadth = 16.89;

let value = true;

let math;

let shape = "square"

// console.log(typeof value);

var fName = "Peter"; //global
{
    var fName = "Jack"; //local
    console.log(fName);
}
console.log(fName);//no scope of global and local in case of var

let lName = "Potter"; //global
{
    let lName = "Jill"; //local
    console.log(lName);
}

console.log(lName);// we have scope of global and local variables for cont, let


let todayDate = new Date("2024-07-27");
console.log(todayDate);

let str = new Boolean("true");
console.log(typeof str);


console.log(typeof Number("abc"));
console.log(typeof String(123));
console.log( Math.log2(4));
String(true)

console.log(5+null);
console.log(("5 " + null));



