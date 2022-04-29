numeros = []
val = 0 

print("Complete a lista com 5 números")
for i in range(1, 6):
    val = int(input("Digite um número: "))
    if val % 2 == 0:
        par = val * 2
        numeros.append(par)
    else:
        impar = val - 1
        numeros.append(impar)

print(numeros)