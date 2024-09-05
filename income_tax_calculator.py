"""
The following program computes income tax and net salary given gross
monthly salary 

"""

user_gross_income = int(input("Kindly input your gross income:"))  #Ask for user input(gross income/monthly salary)

def income_tax(gross_income):
    """This function computes the net salary and income tax using the gross income"""
    if gross_income <= 402:  #computation of tax when gross income is less or equal to 402
        net_income = gross_income
        return net_income
    
    elif gross_income <= 512: 
        income_tax = (gross_income - 402)*(5/100)#computation of tax when gross income is less or equal to 512
        net_income = gross_income - income_tax#computation of net income using income tax
        return net_income
    
    elif gross_income <= 642: 
        income_tax = (gross_income - 512)*(10/100)#computation of tax when gross income is less or equal to 642
        net_income = gross_income - (income_tax + 5.5)#computation of net income using income tax
        return net_income
    
    elif gross_income <= 3642: 
        income_tax = (gross_income - 642)*(17.5/100)#computation of tax when gross income is less or equal to 3642
        net_income = gross_income - (income_tax + 18.5)#computation of net income using income tax
        return net_income
    
    elif gross_income <= 20037:
        income_tax = (gross_income - 3642)*(25/100) #computation of tax when gross income is less or equal to 20037
        net_income = gross_income - (income_tax + 543.5)#computation of net income using income tax
        return net_income
    
    elif gross_income <= 50000:
        income_tax = (gross_income - 20037)*(30/100) #computation of tax when gross income is less or equal to 50000
        net_income = gross_income - (income_tax + 4642.25)#computation of net income using income tax
        return net_income
    
    else:
        income_tax = (gross_income - 50000)*(35/100) #computation of tax when gross income is more than 50,000
        net_income = gross_income - (income_tax + 13631.15) #computation of net income using income tax
        return net_income
    
net_salary = income_tax(user_gross_income)   
print(f'The net salary given a gross income of {user_gross_income} is {net_salary}')