class Rectangle(
  val height: Int,
  val width: Int) {

// Properti isSquare tidak memerlukan field untuk menyimpan nilainya.
   // Ia hanya memiliki pengambil khusus dengan implementasi yang disediakan.
   // Nilainya adalah computer setiap kali properti diakses

    val isSquare: Boolean
    get() {
      println("Computing isSquare property")
      return height == width
    }

}
