arq = open ("arquivo_origem.txt")
x = [linha.strip() for linha in arq]
arq.close()

soma = 0

for linha in x:
   indice = 0
while indice<len(x):
    indice+=1
    soma = (soma + int(x[indice]))
print (soma)