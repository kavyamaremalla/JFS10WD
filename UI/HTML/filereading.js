const fs = require("fs");
const path = require("path");

const filePath1 = path.join(__dirname, "file1.txt");
const filePath2 = path.join(__dirname, "file2.txt");
const filePath3 = path.join(__dirname, "file3.txt");

function display(err, data) {
  if (err) {
    console.log(err.message);
  } else {
    console.log(data);
  }
}

// fs.readFile(filePath3, "utf-8", display);

fs.readFile(filePath1, "utf-8", (err, data) => {
  if (err) {
    console.log(err.message);
  } else {
    fs.readFile(filePath2, "utf-8", (err, data1) => {
      if (err) {
        console.log(err.message);
      } else {
        fs.readFile(filePath3, "utf-8", (err, data3) => {
          if (err) {
            console.log(err.message);
          } else {
            console.log(data);
            console.log(data1);
            console.log(data3);
          }
        });
      }
    });
  }
});
