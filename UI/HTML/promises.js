const fs = require("fs").promises;
const path = require("path");

let myPromise = new Promise((myResolve, myReject) => {
  let x = 5;

  setTimeout(() => {
    console.log("Hey, you are waiting for result");
  }, 3000);

  //producing code
  if (x == 0) {
    myResolve("X is equal to zero");
  } else if (x == 5) {
    myResolve("x value is 5");
  } else {
    myReject("Error, x is not any of the above");
  }
});

//consuming code
myPromise
  .then((value) => console.log(value))
  .catch((error) => console.log(error));

console.log(myPromise);

const filePath1 = path.join(__dirname, "file1.txt");
const filePath2 = path.join(__dirname, "file2.txt");
const filePath3 = path.join(__dirname, "file3.txt");

fs.readFile(filePath1, "utf-8")
  .then((value) => {
    console.log(value);
    return fs.readFile(filePath2, "utf-8");
  })
  .then((data) => {
    console.log(data);
    return fs.readFile(filePath3, "utf-8");
  })
  .then((data3) => console.log(data3))
  .catch((error) => console.log(error));
