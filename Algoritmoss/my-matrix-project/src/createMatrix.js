const fs = require('fs');

// Crear una matriz
let matrix = [];
for(let i=0; i<5; i++) {
    matrix[i] = [];
    for(let j=0; j<5; j++) {
        matrix[i][j] = `${i}${j}`;
    }
}

// Convertir la matriz a una cadena de texto
let matrixString = '';
for(let i=0; i<matrix.length; i++) {
    matrixString += matrix[i].join(' ') + '\n';
}

// Guardar la matriz en un archivo .txt
fs.writeFile('../output/matrix.txt', matrixString, (err) => {
    if (err) throw err;
    console.log('La matriz ha sido guardada!');
});