nmr = int(input("Digite um número: "))
n = str(nmr)
numero = nmr

soma = 0
while(nmr > 0):
    soma += nmr % 10
    nmr = int(nmr /10)

resultado = numero * 11
print(numero," * 11 = ",n[0]," + ", n[1]," = ",soma," = ",resultado)
