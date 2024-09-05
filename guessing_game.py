"""
The following program makes use of a function called the guessing game

"""
import random #importing the random  module 
random.seed(70)  # setting the seed  for the random seed function
random_int = random.randint(1,100)  #setting the range forthe 
#print(random_int) #To know what number the is being guessed. For testing purposes

def guess_game(seed):
    """This is the function for the guessing game"""
    print('Welcome to the Guessing Game!')
    user_guess = int(input("I'm thinking of a number between 1 and 100. Can you guess it?\nGuess:"))#takes user input

    count = 1  #initializing the accumulator variable 
    
    while user_guess != seed: #while loop designed to stop when the user guess is right
        
        count += 1   #increment of the accumulator variable
        
        if user_guess < seed: #checks by how much the user input is more or less than the number
            user_guess = int(input("Good try,but that's too low. Try again.\nGuess:"))
            
        else:
            user_guess = int(input("Good try,but that's too high. Try again.\nGuess:"))
        
    print(f"Yes! You guessed correctly after {count} tries! Congratulations.")#output 
    
    

guess_game(random_int)
