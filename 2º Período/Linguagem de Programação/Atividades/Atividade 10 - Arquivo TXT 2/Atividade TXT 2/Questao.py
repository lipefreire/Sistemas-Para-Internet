numeros = [495,840,495,820,528,1001,594,1024,594,1000,528,1500,1070,440,1000,396,1450,396,1010,410,1300,495,1700,499,2100,441,500,449,570]

pares = []
impares = []
media = sum(numeros) / len(numeros)

for num in numeros:
     if num % 2 == 0:
        pares.append(num)
     else:
        impares.append(num)

qnt_pares = len(pares)
qnt_impares = len(impares)

arquivo = open('arquivo_destino.txt', 'w')
arquivo.write("Media dos numeros lidos : ")
arquivo.write(str(media))
arquivo.write("\nQuantidade de numeros impares: ")
arquivo.write(str(qnt_impares))
arquivo.write("\nQuantidade de numeros pares : ")
arquivo.write(str(qnt_pares))
arquivo.close

print("Fim do programa.")