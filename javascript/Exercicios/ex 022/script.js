let numero = document.getElementById('numero-input');
let selectArray = document.getElementById('select-array');
let result = document.getElementById('result');
let lista = [];

function adicionarNum() {

    if (!numero.value) {
        alert('ERRO: Digite um número e tente novamente')
    } else if (isNumero(numero.value) && !inLista(numero.value, lista)) {
        lista.push(Number(numero.value));

        let item = document.createElement('option');
        item.text = `Valor ${numero.value} adicionado`;
        selectArray.appendChild(item);
        result.innerHTML = '';

        console.log(`Array: ${lista}`);
    } else {
        alert('ERRO: Valor inválido ou já inserido na lista')
    }
    numero.value = '';
    numero.focus();
}

function finalizar() {
    if (lista.length == 0) {
        alert('Adicione números antes de finalizar')
    } else {
        let total = lista.length;
        let maior = lista[0];
        let menor = lista[0];
        let soma = 0;
        let media = 0;

        for (i in lista) {
            soma += lista[i];

            if (lista[i] > maior) {
                maior = lista[i];
            }

            if (lista[i] < menor) {
                menor = lista[i];
            }
        }

        media = soma / total;

        result.innerHTML = '';
        result.innerHTML += `<small>Ao todo, você cadastrou ${total} números</small><br>`;
        result.innerHTML += `<small>O maior número cadastrado foi ${maior}</small><br>`;
        result.innerHTML += `<small>O menor número cadastrado foi ${menor}</small><br>`;
        result.innerHTML += `<small>A soma dos números cadastrados é ${soma}</small><br>`;
        result.innerHTML += `<small>A média dos números cadastrados é ${media}</small><br>`;
    }
}

function isNumero(n) {
    if (Number(n) >= 1 && Number(n) <= 100) {
        return true;
    } else {
        return false;
    }
}

function inLista(n, array) {
    if (array.indexOf(Number(n)) != -1) {
        return true;
    } else {
        return false;
    }
}