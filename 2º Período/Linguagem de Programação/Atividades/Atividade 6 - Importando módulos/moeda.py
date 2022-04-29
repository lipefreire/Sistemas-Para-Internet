def aumentar(preço, taxa):
    resultado = (preço * taxa/100) + preço
    return resultado


def diminuir(preço, taxa):
    resultado = preço - (preço * taxa/100)
    return resultado


def dobro(preço):
    resultado = preço * 2
    return resultado


def metade(preço):
    resultado = preço / 2
    return resultado