function updateAntal() {
    var total = document.getElementById("antal") * document.getElementById("totalPris");
    pris = document.createElement("pris");
    pris.innerHTML = total;
    document.body.appendChild(pris);
}