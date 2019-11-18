document.getElementById("pris").innerHTML = updateAntal();

function addTotalElement() {
    var totalpris = document.createElement("totalpris");
    var node = document.createTextNode(updateAntal());
    totalpris.appendChild(node);
    document.tbody.appendChild(totalpris);
}

function updateAntal() {
    var pris = parseInt(document.getElementById("pris"));
    var antal = document.getElementById("antal");
    pris *= antal;
    // document.getElementById("pris").setAttribute("text", pris);
    return pris;
}

