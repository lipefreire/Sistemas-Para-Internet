Par = lambda n: n % 2 == 0

def main():
    lista_nmr = []

    for i in range(10):
        lista_nmr.append(int(input("Digite um número: ")))

    filtrado = list(filter(Par, lista_nmr))
    print("Os números pares são: ",filtrado)

main()