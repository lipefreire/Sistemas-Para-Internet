retiraNegativos = lambda numero: numero >= 0

lista = [-5,-4, -3, -2, -1, 2, 4, 6, 8, 10]

remove = list(filter(retiraNegativos, lista))

print("Lista com todos os números: ",lista)
print("Lista com números negativos removidos: ",remove)