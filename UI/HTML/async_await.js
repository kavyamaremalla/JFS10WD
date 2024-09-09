const fs = require("fs").promises;
const path = require("path");

const filePath1 = path.join(__dirname, "file1.txt");
const filePath2 = path.join(__dirname, "file2.txt");
const filePath3 = path.join(__dirname, "file3.txt");

async function display() {
  try {
    let data1 = await fs.readFile(filePath1, "utf-8");
    let data2 = await fs.readFile(filePath2, "utf-8");
    let data3 = await fs.readFile(filePath3, "utf-8");

    console.log(data1);
    console.log(data2);
    console.log(data3);
  } catch (error) {
    console.log(error.message);
  }
}

display();

function name() {
  return Promise.reject("Hi from function");
}

async function name1() {
  // let valu = await "sa";

  return "Hello from async";
}

name()
  .then((val) => console.log(val))
  .catch((err) => console.log("This is an error " + err));

name1()
  .then((val) => console.log(val))
  .catch((err) => console.log(err));
