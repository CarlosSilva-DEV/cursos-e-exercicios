function verificar() {
    var dataAtual = new Date();
    var anoAtual = dataAtual.getFullYear();
    var formAno = document.getElementById('yob-span-input');
    var result = document.getElementById('result');

    // validação campo do ano de nascimento
    if (formAno.value.length == 0 || formAno.value > anoAtual) {
        window.alert('ERRO: Preencha as informações e tente novamente');
    } else {
        var formGender = document.getElementsByName('gender-radio');
        var idade = anoAtual - Number(formAno.value);
        var genero = null;
        // cria elemento img e atribui um id
        var img = document.createElement('img');
        img.setAttribute('id', 'result-img')

        // valida genero preenchido e atribui a src de imagem
        if (formGender[0].checked) {
            if (idade >= 0 && idade <= 2) {
                genero = 'menino (recém nascido)';
                img.setAttribute('src', 'assets/bebe-m.png');
            } else if (idade >= 3 && idade <= 10) {
                genero = 'menino (criança)';
                img.setAttribute('src', 'assets/criança-m.png');
            } else if (idade >= 11 && idade < 18) {
                genero = 'garoto (adolescente)'
                img.setAttribute('src', 'assets/adolescente-m.png');
            } else if (idade >= 18 && idade < 25) {
                genero = 'jovem adulto';
                img.setAttribute('src', 'assets/jovem-adulto-m.png');
            } else if (idade >= 25 && idade < 60) {
                genero = 'homem adulto';
                img.setAttribute('src', 'assets/adulto-m.png');
            } else if (idade > 60) {
                genero = 'homem idoso';
                img.setAttribute('src', 'assets/idoso-m.png');
            } else {
                window.alert('ERRO: Verifique os dados e tente novamente');
            }
            result.style.textAlign = 'center';
            result.innerHTML = `Detectamos um ${genero} de ${idade} anos`;
            result.appendChild(img);

        } else if (formGender[1].checked) {
            if (idade >= 0 && idade <= 2) {
                genero = 'menina (recém nascido)';
                img.setAttribute('src', 'assets/bebe-f.png');
            } else if (idade >= 3 && idade <= 10) {
                genero = 'menina (criança)';
                img.setAttribute('src', 'assets/criança-f.png');
            } else if (idade >= 11 && idade < 18) {
                genero = 'garota (adolescente)'
                img.setAttribute('src', 'assets/adolescente-f.png');
            } else if (idade >= 18 && idade < 25) {
                genero = 'jovem adulta';
                img.setAttribute('src', 'assets/jovem-adulto-f.png');
            } else if (idade >= 25 && idade < 60) {
                genero = 'mulher adulta';
                img.setAttribute('src', 'assets/adulto-f.png');
            } else if (idade > 60) {
                genero = 'mulher idosa';
                img.setAttribute('src', 'assets/idoso-f.png');
            } else {
                window.alert('ERRO: Verifique os dados e tente novamente');
            }
            result.style.textAlign = 'center';
            result.innerHTML = `Detectamos um ${genero} de ${idade} anos`;
            result.appendChild(img);

        } else {
            window.alert('ERRO: Selecione um gênero e tente novamente!')
        }
    }
}