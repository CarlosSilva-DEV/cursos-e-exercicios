let pessoa = {
    nome: 'Carlos',
    genero: 'M',
    idade: 21,
    curso: 'ADS',
    matriculado: true,
    mensalidade: 'pendente',

    pagarMensal() {
        return this.mensalidade = 'paga';
    },

    fazerAniver() {
        return this.idade += 1;
    },

    cancelarMatricula() {
        return this.matriculado = false;
    }
}

console.log(pessoa, '\n');

pessoa.pagarMensal();
pessoa.fazerAniver();
pessoa.cancelarMatricula();

console.log(pessoa);