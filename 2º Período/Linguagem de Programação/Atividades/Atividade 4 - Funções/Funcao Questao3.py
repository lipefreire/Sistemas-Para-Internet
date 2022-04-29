def list_int(): 
    lista_numeros = []
    lista_pares = []

    for i in range(10):
        lista_numeros.append(int(input("Digite um número: ")))

    for rp in lista_numeros:
        if rp % 2 == 0:
            lista_pares.append(rp)

    print("")
    print("Os números pares da lista, são: ")
    return lista_pares

print(list_int())