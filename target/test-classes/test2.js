let f = 0;
for (f = 5.0; f > 0; f = f) {
    console.log("f es --> ");
    console.log(f);
    f = f - 1;
}

if (f == 1.0) {
    console.log("finalmente f es 1.0");
}
else {
    console.log("finalmente f no es 1.0");
}

console.log("f realmente vale 0.0");