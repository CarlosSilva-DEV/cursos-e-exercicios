function parimpar(numero) {
    if (numero % 2 == 0) {
        return `O número ${numero} é par`;
    } else {
        return `O número ${numero} é impar`;
    }
}

function soma(n1, n2) {
    let result = n1 + n2;
    return `A soma entre os números ${n1} e ${n2} é ${result}`;
}

console.log(soma(6, 4));
console.log(parimpar(10));