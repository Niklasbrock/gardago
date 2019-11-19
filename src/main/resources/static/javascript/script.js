// document.getElementById("pris").innerHTML = updateAntal();
// function updateAntal() {
//     //TODO Get Thymeleaf price to work here.55
//     // var pris = document.getElementById("pris").value;
//     var pris = 666;
//     var antal = document.getElementById("antal").value;
//     pris *= antal;
//     document.getElementById("pris").setAttribute("value", pris);
//     return pris;
// }


document.getElementById("pris").innerHTML = document.getElementById("pris").value;
function updateAntal() {
    var pris = document.getElementById("fastpris").value;
    var antal = document.getElementById("antal").value;
    var nyPris = antal * pris;
    document.getElementById("pris").setAttribute("value", nyPris);
}

