async function postData() {
  try {
    const request = await fetch("https://reqres.in/api/users", {
      method: "POST",
      body: JSON.stringify({
        job: "janet.weaver@reqres.in",
        name: "Janet",
        last_name: "Weaver",
      }),
      Headers: {
        "Content-Type": "application/json",
      },
    });
    const result = await request.json();
    console.log(result);
  } catch (error) {
    console.log("Error is " + error);
  }
}

// postData()

async function getData() {
  try {
    const request = await fetch("https://reqres.in/api/users/2");
    console.log(request.ok);

    if (!request.ok) {
      throw new Error("Some Error calling the API");
    }
    const result = await request.json();
    console.log(result);
  } catch (error) {
    console.log("Error is " + error);
  }
}

// getData();

fetch('https://reqres.in/api/users?page=2')
  .then((res) => res.json())
  .then((res) => console.log(res));
