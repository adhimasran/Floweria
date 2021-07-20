package com.example.floweria

object FlowersData {
    private val flowersName = arrayOf(
        "Melati",
        "Petunia",
        "Kembang Sepatu",
        "Kembang Kertas",
        "Pentas Lanceolata",
        "Anggrek",
        "Teratai",
        "Tulip",
        "Iris",
        "Mawar"
    )

    private val flowersDesc = arrayOf(
        "Melati merupakan tanaman bunga hias berupa perdu berbatang tegak yang hidup menahun. Melati merupakan genus dari semak dan tanaman merambat dalam keluarga zaitun (Oleaceae). Terdiri dari sekitar 200 spesies tumbuhan asli daerah beriklim tropis dan hangat dari Eurasia, Australasia dan Oseania, melati secara luas dibudidayakan untuk aroma khas bunganya yang harum.",
        "Petunia adalah suatu genus tumbuhan berbunga dari famili Solanaceae yang bunganya berbentuk trompet. Tumbuhan ini berasal dari Amerika Selatan. Secara fisik, tinggi tanaman ini antara 16–30 cm, bunganya ada yang bermahkota tunggal dan ada pula yang bermahkota ganda dengan warna yang bervariasi (misalnya merah, putih, kuning pucat, biru, dan ungu tua). Genus ini terdiri atas setidaknya 20 spesies.",
        "Kembang sepatu (Hibiscus rosa-sinensis L.) adalah tanaman semak suku Malvaceae yang berasal dari Asia Timur dan banyak ditanam sebagai tanaman hias di daerah tropis dan subtropis. Bunga besar, berwarna merah dan tidak berbau. Bunga dari berbagai kultivar dan hibrida bisa berupa bunga tunggal (daun mahkota selapis) atau bunga ganda (daun mahkota berlapis) yang berwarna putih hingga kuning, oranye hingga merah tua atau merah jambu.",
        "Bunga kertas atau bugenvil adalah tanaman hias populer. Bentuknya berupa pohon kecil yang sukar tumbuh tegak. Keindahannya berasal dari seludang bunganya yang berwarna cerah dan menarik perhatian karena tumbuh dengan rimbunnya. Seludang bunga ini kerap dianggap sebagai bagian bunga, walaupun bunganya yang benar adalah bunga kecil yang terlindung oleh seludang.",
        "Tanaman Egyptian Star Cluster (Pentas lanceolata) berwarna pink. Di Indonesia disebut sebagai bunga pentas, menjadi salah satu pilihan bagi pecinta tanaman hias bunga karena mudah perawatannya dan juga bunga rimbun (jumlah bunga banyak). Bunga pentas lanceolata merupakan salah satu tanaman hias yang rajin berbunga. Bunga pentas berpenampilan menawan dan kerap dipanggil egyptian star karena sepintas mirip soka serta punya bentuk daun layaknya daun kemangi. Berbeda dengan macam macam bunga lain yang hanya tumbuh pada waktu tertentu, pentas dapat bebunga sepanjang waktu tanpa mengenal musim.",
        "Suku anggrek-anggrekan (bahasa Latin: Orchidaceae) merupakan satu suku tumbuhan berbunga dengan anggota jenis terbanyak. Jenis-jenisnya tersebar luas dari daerah tropika basah hingga wilayah sirkumpolar, meskipun sebagian besar anggotanya ditemukan di daerah tropika. Kebanyakan anggota suku ini hidup sebagai epifit, terutama yang berasal dari daerah tropika. Anggrek di daerah beriklim sedang biasanya hidup di tanah dan membentuk umbi sebagai cara beradaptasi terhadap musim dingin.",
        "Teratai (Nymphaea) adalah nama genus untuk tanaman air dari suku Nymphaeaceae. Dalam bahasa Inggris dikenal sebagai water-lily atau waterlily. Di Indonesia, teratai juga digunakan untuk menyebut tanaman dari genus Nelumbo (lotus). Pada zaman dulu, orang memang sering mencampuradukkan antara tanaman genus Nelumbo seperti seroja dengan genus Nymphaea (teratai). Pada Nelumbo, bunga terdapat di atas permukaan air (tidak mengapung), kelopak bersemu merah (teratai berwarna putih hingga kuning), daun berbentuk lingkaran penuh dan rimpangnya biasa dikonsumsi.\nTanaman tumbuh di permukaan air yang tenang. Bunga dan daun terdapat di permukaan air, keluar dari tangkai yang berasal dari rizoma yang berada di dalam lumpur pada dasar kolam, sungai atau rawa. Tangkai terdapat di tengah-tengah daun. Daun berbentuk bundar atau bentuk oval yang lebar yang terpotong pada jari-jari menuju ke tangkai. Permukaan daun tidak mengandung lapisan lilin sehingga air yang jatuh ke permukaan daun tidak membentuk butiran air.",
        "Tulip (bahasa Latin: Tulipa) merupakan nama genus untuk 100 spesies tumbuhan berbunga yang termasuk ke dalam keluarga Liliaceae. Tulip berasal dari Asia Tengah, tumbuh liar di kawasan pegunungan Pamir dan pegunungan Hindu Kush dan stepa di Kazakhstan. Negeri Belanda terkenal sebagai negeri bunga tulip. Tulip juga merupakan bunga nasional Iran dan Turki.\nTulip merupakan tumbuhan tahunan berumbi yang tingginya antara 10–70 cm, daunnya berlilin, berbentuk sempit memanjang berwarna hijau nuansa kebiru-biruan, dan bunganya berukuran besar terdiri 6 helai daun mahkota. Tulip hasil persilangan menghasilkan bunga berwarna tunggal, merah, oranye, kuning, hijau, biru, ungu, atau berbagai macam kombinasi dan gradasi warna. Tulip menghasilkan biji-biji berbentuk bundar pipih yang dibungkus kapsul kering.",
        "Iris adalah sebuah genus dalam famili Iridaceae yang mencakup 260–300 spesies tumbuhan berbunga. Tumbuhan tersebut mengambil nama dari kata bahasa Yunani untuk pelangi, yang juga merupakan nama dari dewi pelangi Yunani, Iris.",
        "Mawar adalah suatu jenis tanaman semak dari genus Rosa sekaligus nama bunga yang dihasilkan tanaman ini. Mawar liar terdiri dari 100 spesies lebih, kebanyakan tumbuh di belahan bumi utara yang berudara sejuk. Spesies mawar umumnya merupakan tanaman semak yang berduri atau tanaman memanjat yang tingginya bisa mencapai 2 sampai 5 meter. Walaupun jarang ditemui, tinggi tanaman mawar yang merambat di tanaman lain bisa mencapai 20 meter.\nSebagian besar spesies mempunyai daun yang panjangnya antara 5–15 cm dengan dua-dua berlawanan (pinnate). Daun majemuk yang tiap tangkai daun terdiri dari paling sedikit 3 atau 5 hingga 9 atau 13 anak daun dan daun penumpu (stipula) berbentuk lonjong, pertulangan menyirip, tepi tepi beringgit, meruncing pada ujung daun dan berduri pada batang yang dekat ke tanah. Mawar sebetulnya bukan tanaman tropis, sebagian besar spesies merontokkan seluruh daunnya dan hanya beberapa spesies yang ada di Asia Tenggara yang selalu berdaun hijau sepanjang tahun."
    )

    private val flowersGenus = arrayOf(
        "Jasminum",
        "Petunia",
        "Hibiscus",
        "Bougainvillea",
        "Pentas",
        "-",
        "Nymphaea",
        "Tulipa",
        "Iris",
        "Rosa L."
    )

    private val flowersOrder = arrayOf(
        "Lamiales",
        "Solanales",
        "Malvales",
        "Caryophyllales",
        "Gentianales",
        "Asparagales",
        "Nymphaeales",
        "Liliales",
        "Asparagales",
        "Rosales"
    )

    private val flowersFamily = arrayOf(
        "Oleaceae",
        "Solanaceae",
        "Malvaceae",
        "Nyctaginaceae",
        "Rubiaceae",
        "Orchidaceae",
        "Nymphaeaceae",
        "Liliceae",
        "Iridaceae",
        "Rosaceae"
    )

    private val flowerImages = intArrayOf(
        R.drawable.melati,
        R.drawable.petunia,
        R.drawable.sepatu,
        R.drawable.kertas,
        R.drawable.pentas,
        R.drawable.anggrek,
        R.drawable.teratai,
        R.drawable.tulip,
        R.drawable.iris,
        R.drawable.mawar
    )

    val listData: ArrayList<Flower>
        get() {
            val list = arrayListOf<Flower>()
            for (position in flowersName.indices) {
                val flower = Flower()
                flower.name = flowersName[position]
                flower.desc = flowersDesc[position]
                flower.photo = flowerImages[position]
                flower.genus = flowersGenus[position]
                flower.order = flowersOrder[position]
                flower.family = flowersFamily[position]
                list.add(flower)
            }
            return list
        }
}