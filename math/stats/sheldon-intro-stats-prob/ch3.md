Element Probabilitas
# Questioning chapter 3 ?

1. Apa Rule atau aksioma teori probabilitas yang disajikan pada chapter ini ?
2. statement ini dimana ya ?
Ilmu probabilitas dibutuhkan untuk memahami 'kaitan(relation)' antara A dan B, dimana
A = properties of the sample data
B = properties of the entire population
3. Apa kaitan intersection event dengan hyphotesis testing? 
Kenapa mesti belajar algebra himpunan untuk events?
Ada overlapping event yang harus dihindari untuk mendapatkan nilai yang peresisi.

# Summary 
Probability dibutuhkan untuk meng infer data yang sudah disajikan statistik.
Probability membuat inferensi tentang probability kemiripan 'distribution of population' vs  sample.

Di chapter ini juga dijelaskan tentang
1. Idea of a probability experiment, 
2. explains the concept of the probability of an event, and 
3. presents the axioms of probability.

# intro
frequency interpretation vs subjective interpretation
frequency interpretation
In the frequency interpretation, the probability of a given outcome of an experiment is considered as being a "property" of that outcome. 

Nilai dari probabilitas ada nya oil ditentukan by continual repetition of the experiment — the probability of the outcome will then be observable as being the proportion of the experiments that result in the outcome. 

continual_repetition_of_the_experiment = 10 times, 100 times ,1M times
proporsi_experiments = observable_oil / (observable_oil + unobservable_oil)

This is the interpretation of probability that is most prevalent among scientists.
2. Pendapat kedua :subjective interpration of probability, based on someone belief, dipakai di filosofi dan decision maker ekonomi.

Regardless of which interpretation one gives to probability, however, there is a consensus 
frequency ==  subjective

i think 
1. probability rain tommorow = 3/10 
2. probability cloudy without any rain = 2/10
then
3. probability cloudy or rainy = 5/10 

independently of your individual interpretation of the concept of probability (frequency or subjective). 

# sample space and event
Experiment = apapun yang outcomenya belum pasti(uncertanty)
Sample Space = All possible outcome of experiment
Event = subset dari Sample Space

"Beda antara 'sample space' vs sample nya statistik !"

outcome experiment sifatnya random tapi (biasanya) kita sudah mengetahui all possible outcome nya, misal 
1. lemparan koin : outcome nya HEAD or TAIL (nominal)
2. anak yg lahir : Girl or Boy
3. impact refactoring : (improving or not affect quality).
saya hanya melakkan eksperimen refactoring 29 kali pada satu software.
Bagaimana menyatakan refactoring dilakukan 29 kali?
untuk menghilangkan 1 smell, butuh berapa kali refactoring?

All possible outcome itu istilahnya SAMPLE SPACE disingkat S, misal jenis kelamin bayi yang keluar.
EVENT (disingkat E) adalah subset dari S , misal bayi yang keluar adalah Laki-laki adalah event.

For any two events E and F of a sample space S, 

we define the new event E ∪ F, 
called the union of the events E and F, 
to consist of all outcomes that are either in E or in F or in both E and F. 

That is, the event E ∪ F will occur if either E or F occurs. 

For instance, in 
Example 1 
if E = {g} and F = {b}, 
then E ∪ F = {g, b}. 
That is, E ∪ F would be the whole sample space S. 

In Example 2 
if 
E = {all outcomes starting with 6} is the event that the number 6 horse wins 
and 
F = {all outcomes having 6 in the second position} is the event that the number 6 horse comes in second, 

then E ∪ F is the event that the number 6 horse comes in either first or second.

Disini diperlukan algebra event

# diagram venn and algebra events
Biar lebih jelas sebaran dan himpunan event nya.

# axioms of probability

1. 0 ≤ P(E) ≤ 1
P(E) berada di interval 0 sampai 1

2. P(S) = 1
Bisa dipastikan bahwa hasil yang keluar dari experiment adalah member dari sample space S.

3. P(E)
Axiom 3 states that for any set of mutually exclusive events the probability that at least one of these events occurs is equal to the sum of their respective probabilities.
It should be noted that if we interpret P(E) as the relative frequency of the event E
when a large number of repetitions of the experiment are performed, then P(E) would indeed satisfy the above axioms. 

For instance, 
1. the proportion (or frequency) of time that the outcome is in E is clearly between 0 and 1, 
2. and the proportion of time that it is in S is 1 (since all outcomes are in S ). 
3. Also, if E and F have no outcomes in common, then the proportion of time that the outcome is in either E or F is the sum of their respective frequencies. 
Contoh dari statement ke-3 

The rolling of a pair of dice and suppose that 

E = event that the sum is 2, 3, or 12 and 
F = event that the sum is 7 or 11. 

Then if outcome E occurs 11 percent of the time 
and outcome F 22 percent of the time, 
then 33 percent of the time the outcome will be either 2, 3, 12, 7, or 11.

Ada kejadian F dan E yang tak eksklusif.

# Sample Spaces punya equally likely outcomes

semua event pada sample space punya probability 1 (aksioma probability)
sebaran event dadu semua merata 1/6, dimana rumusnya 
	"(desired_event/sample_space)"
Inilah yang disebut 
"Sample Spaces punya equally-likely-outcomes"
Dadu yang dicurangi tak bisa menggunakan aksioma probability. 

Misalkan dadunya diberi magnet pada angka 3 agar selalu muncul angka 3. Sehingga P(3) != 1/6 melainkan P(3) == 1
Maka untuk soal-soal statistk yang ada di literatur di asumsikan bahwa dice nya itu FAIR atau 
Sample Spaces punya 'equally likely outcomes'

Apakah sama seperti eksperimen yang un-fair dimana hasilnya sudah dapat diketahui?


# conditional probability
Skip

# Bayes Formula
Skip

# Independent events
Kejadian bebas ? apakah itu?
