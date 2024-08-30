let hour = 2;

if (hour > 17 && hour < 21) {
  console.log("Good evening!");
} else if (hour > 21) {
  console.log("Good night");
} else {
  console.log("Good day");
}

switch (new Date().getDay()) {
  case 1:
    console.log("Monday");
    break;
  case 0:
    console.log("Sunday");
    break;
  case 2:
    console.log("Tuesday");
    break;
  case 5:
    console.log("Friday");
    break;

  default:
    console.log("Please check day");
    break;
}
