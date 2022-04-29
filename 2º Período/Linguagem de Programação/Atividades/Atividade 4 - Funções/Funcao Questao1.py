def todos_meses(meses):
    meses_ano = ["0","Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"]
    return(meses_ano)[meses]

for ne in range(1, 13):
    
    print()
    meses = int(input("Digite o número do mês desejado: "))
    print("O mês que você escolheu foi: ",todos_meses(meses))
    break

print("   ")
print("Fim")
print("   ")