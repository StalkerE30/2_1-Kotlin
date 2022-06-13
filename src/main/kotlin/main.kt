fun main() {
    val rate = 0.0075 //процент комиссии за перевод
    val amount = 5000_00 //сумма перевода
    val fixTax = 35_00 //значение минимальной комиссии за перевод
    val result: Int = (if (amount * rate < fixTax) fixTax else amount * rate).toInt()
    println("Комиссия за перевод составит: $result копеек")
}