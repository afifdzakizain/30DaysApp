package trpl.nim234311029.a30daysapp


import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Deskripsi(
    @DrawableRes val imageResourceId: Int,
    @StringRes val title: Int,
    val day: Int,
    @StringRes val description: Int
)



val tips = listOf(
    Deskripsi(R.drawable.air, R.string.picdesc1, 1, R.string.description_1),
    Deskripsi(R.drawable.pic1, R.string.picdesc2, 2, R.string.description_2),
    Deskripsi(R.drawable.pic2, R.string.picdesc3, 3, R.string.description_3),
    Deskripsi(R.drawable.pic3, R.string.picdesc4, 4, R.string.description_4),
    Deskripsi(R.drawable.pic4, R.string.picdesc5, 5, R.string.description_5),
    Deskripsi(R.drawable.pic5, R.string.picdesc6, 6, R.string.description_6),
    Deskripsi(R.drawable.pic6, R.string.picdesc7, 7, R.string.description_7),
    Deskripsi(R.drawable.pic7, R.string.picdesc8, 8, R.string.description_8),
    Deskripsi(R.drawable.pic8, R.string.picdesc9, 9, R.string.description_9),
    Deskripsi(R.drawable.pic9, R.string.picdesc10, 10, R.string.description_10),
    Deskripsi(R.drawable.pic10, R.string.picdesc11, 11, R.string.description_11),
    Deskripsi(R.drawable.pic11, R.string.picdesc11, 12, R.string.description_11),



    )
