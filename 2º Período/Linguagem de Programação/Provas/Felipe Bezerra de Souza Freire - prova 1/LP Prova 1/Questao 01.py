txt_altura = 1

while txt_altura != 0:
    txt_sexo = input("Digite o sexo (M/F): ")
    txt_altura = input("Digite a altura (Digite (0) quando desejar parar: ")
    txt_peso = input("Digite o peso: ")

    peso = float(txt_peso)
    altura = float(txt_altura)
    pesoideal = 0
    seupesoM = 0
    seupesoF = 0
    imc = 0

    if (txt_sexo == "M"):
        pesoideal = (72.7 * altura) - 58
        seupesoM = (peso * altura) - 58
        print("\nIMC: ",seupesoM)
        imc = seupesoM
    else:
        pesoideal = (62.1 * altura) - 44.7
        seupesoF = (peso * altura) - 44.72
        print("\nIMC: ",seupesoF)
        imc = seupesoF

    print("")
    print("O peso ideal é: " + str(pesoideal))

    if (imc < 20):
        print("Seu IMC: Abaixo de 20")
        print("Faixa de risco: Abaixo do peso.")
    elif (imc >= 20 and pesoideal <= 25):
        print("seu IMC: De 20 a 25")
        print("Faixa de risco: Peso normal.")
    elif (imc > 25 and pesoideal <= 30):
        print("IMC: Acima de 25 até 30")
        print("Faixa de risco: Acima do peso.")
    elif (imc > 30):
        print("IMC: Acima de 30")
        print("Faixa de risco: Obesidade")