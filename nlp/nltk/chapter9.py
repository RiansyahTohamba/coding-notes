sent = "Kim chased Lee"
tokens = sent.split()
lee = {'CAT': 'NP', 'ORTH': 'Lee', 'REF': 'l'}

def lex2fs(word):
for fs in [kim, lee, chase]:
if fs['ORTH'] == word:
return fs

subj, verb, obj = lex2fs(tokens[0]), lex2fs(tokens[1]), lex2fs(tokens[2])
verb['AGT'] = subj['REF']
verb['PAT'] = obj['REF']
for k in ['ORTH', 'REL', 'AGT', 'PAT']:


print("%-5s => %s" % (k, verb[k]))