function contar() {
    var inicio = document.getElementById('inicio-input');
    var fim = document.getElementById('fim-input');
    var passo = document.getElementById('passo-input');
    var result = document.getElementById('result');

    var i = Number(inicio.value);
    var f = Number(fim.value);
    var p = Number(passo.value);

    if (!inicio.value || !fim.value || !passo.value) {
        window.alert('ERRO: Preencha todos os campos corretamente para continuar');
    } else if (p == 0) {
        window.alert('ERRO: Passo inválido! Considere utilizar um número a partir de 1 para continuar');
    } else if (i > f) {
        result.innerHTML = 'Contando: <br>';
        for (c = i; c >= f; c -= p) {
            result.innerHTML += `\u{1F449} ${c} `;
        }
        result.innerHTML += `\u{1F3C1}`;
    } else {
        result.innerHTML = 'Contando: <br>';
        for (c = i; c <= f; c += p) {
            result.innerHTML += `\u{1F449} ${c} `;
        }
        result.innerHTML += `\u{1F3C1}`;
    }
}