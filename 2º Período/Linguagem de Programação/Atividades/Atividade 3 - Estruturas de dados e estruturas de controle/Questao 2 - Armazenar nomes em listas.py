nomes = []
cons = '.'

while(cons != ""):
    cons = input("Digite um nome: ")
    nomes.append( cons )

print("                           ")
print("Nenhum nome foi inserido")
print("Leitura de nomes encerrada.")
print("                           ")
print("Apresentação de nomes: ")
nomes.pop()

for y in nomes:
    print("Nome : %s" % y)
    
