function gerarTabuada() {
    var numero = document.getElementById('numero-input');
    var tabuada = document.getElementById('select-tabuada');
    var msg = document.getElementById('result-msg');

    if (!numero.value) {
        window.alert('ERRO: Digite um número e tente novamente')
    } else {
        msg.style.display = 'none';
        var n = Number(numero.value);
        tabuada.innerHTML = '';

        for (i = 0; i <= 10; i++) {
            var item = document.createElement('option');
            item.text = `${n} x ${i} = ${n * i}`;
            tabuada.appendChild(item);
            tabuada.style.display = 'flex';
        }
    }
}