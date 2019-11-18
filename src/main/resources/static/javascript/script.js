document.getElementById("pris").innerHTML = updateAntal();
function updateAntal() {
    //TODO Get Thymeleaf price to work here.55
    // var pris = document.getElementById("pris").value;
    var pris = 666;
    var antal = document.getElementById("antal").value;
    pris *= antal;
    document.getElementById("pris").setAttribute("value", pris);
    return pris;
}




// document.getElementById("pris").innerHTML = updateAntal();
//
// function addTotalElement() {
//     var totalpris = document.createElement("totalpris");
//     var node = document.createTextNode(updateAntal());
//     totalpris.appendChild(node);
//     document.tbody.appendChild(totalpris);
// }
//
// function updateAntal() {
//     var pris = parseInt(document.getElementById("pris"));
//     var antal = document.getElementById("antal");
//     pris *= antal;
//     // document.getElementById("pris").setAttribute("text", pris);
//     return pris;
// }
//
