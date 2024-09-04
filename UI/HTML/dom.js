// document.querySelector("#changeTextBtn").addEventListener("click", function () {
//   document.querySelector("#myElement").textContent = "lorem ipusm.....";
// });

// const allItems = document.querySelectorAll(".item");

// document
//   .querySelector("#changeColorBtn")
//   .addEventListener("click", function () {
//     allItems.forEach((item) => (item.style.color = "red"));
//     allItems.forEach((itm) => console.log(itm));
//   });

// console.log("First element text : ", document.querySelector(".item")); //always selects  the first element if you have multiple classes

// const newElement = document.createElement("p");
// newElement.textContent = "A new paragraph";

// document.body.appendChild(newElement);

// document
//   .querySelector("#addParagraphBtn")
//   .addEventListener("click", function () {
//     const newElement = document.createElement("p");
//     newElement.textContent = "Another paragraph!";
//     document.body.appendChild(newElement);
//   });

//Append and Append Child

const parent = document.getElementById("parent");

parent.append(
  "This is a simple text",
  document.createElement("h3"),
  " some new text"
);

const newChild = document.createElement("div");
newChild.textContent = "This is a child element";

parent.appendChild(newChild, document.createElement("h2"), " some new text");
parent.appendChild(document.createElement("h3"), ' a new string');
