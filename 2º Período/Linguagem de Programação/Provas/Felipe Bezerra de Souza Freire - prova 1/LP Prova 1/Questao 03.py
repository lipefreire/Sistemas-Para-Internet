lista = str(input("Digite um argumento: "))

def uppercase(lista):
    pass

def int(lista, texto):
    lista = texto.split()

    for value in lista:
        if value.isnumeric():
            out = out + int(value)

    return out
