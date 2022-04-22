package com.latihan.ravysholihin.projectuts_baju

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<DataBaju>(
            DataBaju(
                R.drawable.baju_cewek,
                "Baju  Smokers",
                "baju  smokers ukuran xxl dan M dan L banyak lain juga ukuran baju , bahan baju dari catton dan lembut di gunakan  "
            ),
            DataBaju(
                R.drawable.baju_switer_wanita,
                "Baju Switer Wanita Lucu",
                "baju Switer Wanita Lucu ukuran xxl dan M dan L banyak lain juga ukuran baju , bahan baju dari catton dan lembut di gunakan  "
            ),
            DataBaju(
                R.drawable.baju_switer_wanita_remix,
                "Baju switer Wanita Remix",
                "baju Kaos Struggle ukuran xxl dan M dan L banyak lain juga ukuran baju , bahan baju dari catton dan lembut di gunakan  "
            ),DataBaju(
                R.drawable.baju_pria_danilo_lengan_panjang,
                "Baju pria danilo Lengan panjang",
                "Baju pria danilo Lengan panjang ukuran xxl dan M dan L banyak lain juga ukuran baju , bahan baju dari catton dan lembut di gunakan  "
            ),DataBaju(
                R.drawable.switer_wanita_korea_tampilan_bagus,
                "Baju pria danilo Lengan panjang",
                "Baju pria danilo Lengan panjang ukuran xxl dan M dan L banyak lain juga ukuran baju , bahan baju dari catton dan lembut di gunakan  "
            ),DataBaju(
                R.drawable.baju_pria_danilo_lengan_panjang,
                "Baju pria danilo Lengan panjang",
                "Baju pria danilo Lengan panjang ukuran xxl dan M dan L banyak lain juga ukuran baju , bahan baju dari catton dan lembut di gunakan  "
            ),DataBaju(
                R.drawable.paramitha_maxi_dress,
                "Baju wanita paramitha maxi dress Lengan panjang",
                "Baju wanita paramitha maxi dress Lengan panjang ukuran xxl dan M dan L banyak lain juga ukuran baju , bahan baju dari catton dan lembut di gunakan  "
            ),DataBaju(
                R.drawable.ethnic_tunic_print_blue_paisley_dress,
                "ethnic tunic print blue paisley dress danilo Lengan panjang",
                "baju wanita ethnic tunic print blue paisley dress Lengan panjang ukuran xxl dan M dan L banyak lain juga ukuran baju , bahan baju dari catton dan lembut di gunakan  "
            ),DataBaju(
                R.drawable.short_dress_with_tiered_details,
                "Baju wanita  Short Dress with Tiered Details Lengan panjang",
                "Baju wanita Short Dress with Tiered Details Lengan panjang ukuran xxl dan M dan L banyak lain juga ukuran baju , bahan baju dari catton dan lembut di gunakan  "
            ),DataBaju(
                R.drawable.overall_look_linen_aox,
                "Baju wanita  overall look linen aox Lengan panjang",
                "- Overall bergaya kasual\n" +
                        "- Warna purple\n" +
                        "- Unlined\n" +
                        "- Regular fit\n" +
                        "- Material katun tidak transparan, ringan, dan tidak"
            ),DataBaju(
                R.drawable.img,
                "baju wanita Addana Dress Dusty Pink\n",
                "Addana Dress Dusty Pink\n"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = DataBajuAdapter(this, imageList){
            val intent = Intent(this, DataBajuDetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}