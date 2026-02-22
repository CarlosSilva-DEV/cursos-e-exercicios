function carregar() {
    var msg = window.document.getElementById('msg-div');
    var img = window.document.getElementById('image');

    var dataAtual = new Date();
    var horaAtual = dataAtual.getHours();
    var periodo = null;

    if (horaAtual >= 0 && horaAtual < 12) {
        periodo = 'manhã';
        img.src = 'assets/morning-asset.png';
        document.body.style.background = 'rgb(45, 154, 255)';
    } else if (horaAtual >= 12 && horaAtual <= 18) {
        periodo = 'tarde';
        img.src = 'assets/afternoon-asset.png';
        document.body.style.background = 'rgb(240, 169, 37)';
    } else {
        periodo = 'noite';
        img.src = 'assets/night-asset.png';
        document.body.style.background = 'rgb(0, 26, 37)'
    }

    msg.innerHTML = `Agora são ${horaAtual} horas da ${periodo}`
}