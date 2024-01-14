document.addEventListener("DOMContentLoaded", function () {
    createOrbs();
  });

  function createOrbs() {
    const numberOfOrbs = 10;

    for (let i = 0; i < numberOfOrbs; i++) {
      createOrb();
    }
  }

  function createOrb() {
    const orb = document.createElement("div");
    orb.className = "orb";

    const xPos = Math.random() * window.innerWidth;
    const yPos = Math.random() * window.innerHeight;

    orb.style.left = xPos + "px";
    orb.style.top = yPos + "px";

    document.body.appendChild(orb);
  }