lista = []
dados = {}

for ne in range(0, 5):
    dados['nome'] = str(input("Nome: "))
    dados['email'] = str(input("E-mail: "))
    print(" ")
    
    lista.append(dados.copy())
    dados.clear()
    

print("Lista com todos os dados cadastrados: ")
print(lista)