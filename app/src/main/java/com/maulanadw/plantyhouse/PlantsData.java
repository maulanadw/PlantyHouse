package com.maulanadw.plantyhouse;

import java.util.ArrayList;

public class PlantsData {
    private static String[] plantNames = {
            "Aglaonema Dud Anjamani",
            "Anthurium Crystallinum",
            "Calathea Ornata Sanderiana",
            "Dieffenbachia Seguine",
            "Epipremnum Aureum",
            "Kadaka Osaka",
            "Monstera Deliciosa",
            "Pilea Peperomioides",
            "Sansevieria Trifasciata",
            "Zanzibar Gem"
    };

    private static final String[] plantNameAliases = {
            "Sri Rejeki Merah",
            "Daun Kuping Gajah",
            "Kalatea Ornata/ Kalatea Batik",
            "Sri Rejeki",
            "Sirih Gading",
            "Kadaka",
            "Monstera",
            "Pilea",
            "Lidah Mertua",
            "Pohon Dolar"
    };

    private static String[] plantDetails = {
            "Jenis aglonema ini sangat indah dengan daun merah cerah yang menakjubkan dengan beberapa bintik dan bingkai hijau tua. Aglonema red anjamani dapat mempertahankan corak daunnya sepanjang tahun. Untuk memaksimalkan warna merahnya yang indah, coba letakkan tanaman ini dalam pot warna hitam atau perak.",
            "Tanaman ini sering disebut sebagai tanaman kuping gajah karena bentuk daunnya yang lebar. Ciri khusus dari tanaman ini adalah daunnya yang berbentuk oval dengan urat putih berwarna putih yang menonjol.",
            "Calathea ini termasuk tanaman yang menyukai tempat teduh. Beberapa jenis calathea akan menggulung daunnya saat malam, dan akan terbuka kembali saat pagi. Maka tanaman ini sering disebut “prayer plant”. Tanaman ini bisa juga dijadikan tanaman untuk menghias kebun, asal disesuaikan dengan kondisi pencahayaan (tidak terlalu panas).",
            "Tanaman ini juga dikenal sebagai “dumbcane”. Tanaman ini tak tahan terhadap sinar matahari langsung sehingga lebih sering dijadikan hiasan untuk di dalam ruangan. Daun tanaman besar dan hijau, dan seringkali dengan pola putih beraneka ragam. Seperti Dieffenbachias lainnya, getahnya beracun dan memiliki bunga putih yang mencolok.",
            "Tanaman ini sangat mudah dirawat dan ditemukan, Sirih Gading bisa menjadi alternatif tanaman hias daun untuk menghiasi taman rumahmu. Sifatnya yang merambat membuat tanaman hias daun ini tepat untuk menghiasi dinding atau dijadikan tanaman gantung. Warnanya yang hijau cerah membuat suasana menjadi lebih segar dengan kehadiran tanaman Sirih Gading ini.",
            "Tanaman ini juga lebih dikenal dengan nama Pakis Sarang Burung yang merupakan tanaman hias daun yang tak kalah cantik dan cukup mudah tumbuh dan dirawat. Ciri dari tanaman hias daun ini adalah warna hijaunya yang cerah serta daun memanjang dengan pinggiran yang bergelombang.",
            "Tanaman dengan ukuran daun yang besar dan lebar ini, sering digunakan untuk dekorasi rumah atau bahkan properti foto karena tanaman ini memiliki nilai estetik pada bentuk daun yang menjadi ciri khas memiliki lubang-lubang membuat Monstera sangat unik dan kerap menjadi pilihan dekorasi. Diketahui tanaman jenis philodendron ini masuk dalam keluarga talas-talasan “Araceae”.",
            "Dikenal sebagai Chinese Money, tanaman UFO, tanaman kidal, atau tanaman misionaris. Spesies tanaman berbunga dalam keluarga jelatang Urticacaceae. Tanaman jenis ini tidak perlu banyak air, dan bisa diberikan asupan dalam rentang 3 hari sekali.",
            "Sansevieria yang lebih terkenal dengan nama Lidah Mertua ini memiliki pola daun memanjang keatas dengan aksen warna menguning pada bagian pinggirannya, tanaman hias daun ini juga digemari karena khasiatnya mengurangi radiasi dan juga polusi udara.",
            "Zamioculcas atau Zamioculcas zamiifolia, juga disebut zamia kulkas, dikenal juga dengan sebutan Zanzibar Gem merupakan tanaman berbunga dari suku talas-talasan “Araceae” yang hanya terdiri dari satu spesies saja yaitu Zamioculcas zamiifolia. Tanaman hijau dengan daun yang memiliki kemiripan dengan uang kertas tersebut justru dapat mempercantik rumah Anda."
    };

    private static int[] plantsImages = {
            R.drawable.aglaonema,
            R.drawable.anthurium_crystallinum,
            R.drawable.calathea_ornata,
            R.drawable.dieffenbachia_seguine,
            R.drawable.epipremnum_aureum,
            R.drawable.kadaka_osaka,
            R.drawable.monstera_deliciosa,
            R.drawable.pilea,
            R.drawable.sansevieria_trifasciata,
            R.drawable.zanzibar_gem
    };

    static ArrayList<Plant> getListData() {
        ArrayList<Plant> list = new ArrayList<>();
        for (int position = 0; position < plantNames.length; position++) {
            Plant plant = new Plant();
            plant.setPlantName(plantNames[position]);
            plant.setPlantAlias(plantNameAliases[position]);
            plant.setPlantDetail(plantDetails[position]);
            plant.setPlantPhoto(plantsImages[position]);
            list.add(plant);
        }
        return list;
    }
}
