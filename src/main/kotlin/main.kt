package ru.netology

fun main() {
    val itemPrice: Int = 10001
    val count: Int = 1

    val discount5Percent = 0.05 // скидка 5%, если сумма покупки от 10 001 рубля
    val discountStandart = 100 // скидка, если сумма покупки от 1 001 до 10 000 рублей
    val discountConstantClient = 0.01 // скидка 1% для постоянных клиентов
    val constantClient = true

    val totalPrice: Int = itemPrice * count // полная стоимость покупки
    var totalPriceWithDiscount: Int = 0 // стоимость с учетом скидок
    val totalDiscount: Int // итоговая скидка

    if (totalPrice in 1_001..10_000) {
        totalPriceWithDiscount = totalPrice - discountStandart
        println("Вы купили на сумму: $totalPrice руб, ваша скидка составила $discountStandart руб., Итого: $totalPriceWithDiscount")
    } else if (totalPrice > 10_000) {
        totalPriceWithDiscount = (totalPrice * discount5Percent).toInt()
        println("Вы купили на сумму: $totalPrice руб, ваша скидка составила $totalPriceWithDiscount руб., Итого: ${totalPrice - totalPriceWithDiscount} руб.")
    } else {
        println("Вы купили на сумму: $totalPrice")
    }
    if (constantClient) {
        totalDiscount = (totalPrice * discountConstantClient).toInt()
        println("Т.к. Вы постоянный клиент, для Вас предоставляется скидка $totalDiscount руб., Итого: ${(totalPrice - totalPriceWithDiscount) - totalDiscount}  руб.")
    } else println("Вы не постоянный клиент, Вам скидка 1% не предоставляется")
}
