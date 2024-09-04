console.log(1 / 0);
try {
  console.log(add());
} catch (error) {
  if (error instanceof ReferenceError) {
    console.log("Please check your code!");
  }
} finally {
  console.log("Process completed");
}
