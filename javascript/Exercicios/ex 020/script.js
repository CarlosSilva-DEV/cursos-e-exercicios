let num = [5, 8, 4];

num[3] = 6;
num.push(7);

console.log(num);

// laço for tradicional
for (i = 0; i < num.length; i++) {
    console.log(num[i]);
}

// laço for simplificado
for (i in num) {
    console.log(num[i]);
}