# Mehmet VARAN 181805009
import random

def string2char2int(word):
    string2char = [char for char in word]
    char2int = [ord(char) for char in string2char]
    return char2int

def int2char2string(integer):
    int2char = [chr(char) for char in integer]
    char2string = ""
    for x in int2char:
        char2string += x
    return char2string

def bubbleSort(numberArray):
    x = len(numberArray)
    for i in range(x-1):
        for j in range(x-i-1):
            if numberArray[j] > numberArray[j+1]:
                numberArray[j], numberArray[j+1] = numberArray[j+1], numberArray[j]
    return numberArray

def comparing2string(word1, word2):
    word1_integers = string2char2int(word1)
    word2_integers = string2char2int(word2)
    if (len(word1_integers) != len(word2_integers)):
        print("These words are not anagram")
        return
    else:
        word1_sorted = bubbleSort(word1_integers)
        word2_sorted = bubbleSort(word2_integers)
        for i in range(len(word1_integers)):
            if word1_sorted[i] != word2_sorted[i]:
                print("These words are not anagram.")
                return
    print("These words are anagram.")

def create_anagram(word):
    word_integers = string2char2int(word)
    anagram_integers = random.sample(word_integers, len(word_integers))
    anagram_word = int2char2string(anagram_integers)
    print(anagram_word)


word1 = str(input("Enter the first word: "))
word2 = str(input("Enter the second word: "))

if word2 == "":
    create_anagram(word1)
else:
    comparing2string(word1, word2)














