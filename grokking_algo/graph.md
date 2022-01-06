graph.md

A graph models a set of connections. 
graph = set[koneksi_1,koneksi_1,..,koneksi_n]

Misalkan terdapat 4 org bermain game poker, dan sy ingin buat model:
	WHO owns WHOM money
	SIAPA yg punya uang-nya SIAPA
	contoh: Bio punya uangnya Hani.

Graph terdiri dari: node dan edge
Node mewakili orang atau uang
Edge mewakili arah-dari koneksi node


A node
can be directly connected to many other nodes. Those nodes are called
its neighbors. 
Misalkan terdapat 2 node, Bio dan Hani.
Relasi langsung pada 'Bio punya uangnya Hani' adalah Edge pada node Bio mengarah ke node Hani.
Relasi langsung semacam ini disebut neighbor.

Dari sini bisa kita lihat bahwa Graph adalah teknik untuk memodelkan 'bagaimana different nodes terkoneksi antara satu dan yang lainnya'.

mari kita lihat model graph yg advanced: BFS.
breadth-first search (detailnya: bfs.md)


