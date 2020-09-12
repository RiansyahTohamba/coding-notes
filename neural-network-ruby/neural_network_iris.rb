class NeuralNetworkIris
	
	def initialize shape
		@shape = shape
	end
end
# fungsi yg dipakai di iris
# nn = NeuralNet.new [4,4,3]
# cari apa saja properti yg digunakan nn
# ada 2 penggunaan instance nn
# 1. nn.run(input)
# argument input dari inputs dari lambda run_test 
# -> (argument)
# maka cari penggunaan run_test
# memang dengan lambda kita tak perlu buat fungsi baru, bagusnya buat fungsi sekali pakai
# ada byk lagi keuntungan lambda yg dibahas di buku mastering ruby closures

# inputs = x_test
# expected_outputs = y_test

# 2. nn.train
# result = nn.train(x_train, y_train, error_threshold: 0.01, max_iterations: 1_000,log_every: 100)

# lalu ada testing untrained vs trained network?
# padahal kodenya sama saja?
# berarti 3 argument nya (nn, x_test, y_test) mengalami perubahan, yakni nn sudah di train (nn.train baris 78)