fun main() {
    val rate = 0.0075
    val amount = 5000_00
    val fixTax = 35_00
    val result: Int = (if (amount * rate < fixTax) fixTax else amount * rate).toInt()
    println("Комиссия за перевод составит: $result копеек")
}