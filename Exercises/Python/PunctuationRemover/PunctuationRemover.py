# Mehmet VARAN 181805009

def punctuation_remover(): # defining punctuation remover function
    sentencestring = str(input("Enter the sentence. : ")) # getting sentence from the user
    punctuations = '''!()-[]{};:'"\,<>./?@#$%^&*_~'''    # determining punctuations
    sentencestring_withoutpunc = "" # creating new sentence
    for char in sentencestring:     # getting every character 1 by 1
        if char not in punctuations:  # checking the character if it's punctuatin or not
            sentencestring_withoutpunc = sentencestring_withoutpunc + char  # adding non-punctuation character 1 by 1

    return(sentencestring_withoutpunc)  # going back with new non-punctuation sentence


print("Welcome to Punctuation Remover!")
print("Non-punctuation Sentence is: ",punctuation_remover())   # using function and printing