def contador(): 
    print("Digite um número inteiro e positivo: ")
    numero = int(input("Número: "))

    contador = numero * (numero + 1) // 2
    print("A soma de ",numero," com todos seus números anteriores é de : ",contador)

contador()

