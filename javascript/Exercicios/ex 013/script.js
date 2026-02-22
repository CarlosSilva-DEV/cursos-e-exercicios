var agora = new Date();
var hora = agora.getHours();
var periodo = null;

// Condição múltipla
if (hora < 12) {
    periodo = 'manhã';
    console.log(`Bom dia! Agora são exatamente ${hora} horas da ${periodo}`);
} else if (hora < 18) {
    periodo = 'tarde';
    console.log(`Boa tarde! Agora são exatamente ${hora} horas da ${periodo}`);
} else if (hora <= 24) {
    periodo = 'noite';
    console.log(`Boa noite! Agora são exatamente ${hora} horas da ${periodo}`);
} else {
    console.log('Horário inválido');
}