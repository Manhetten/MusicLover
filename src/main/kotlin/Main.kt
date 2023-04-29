fun main() {
    val purchaseAmount = 12346
    val isConstant = true

    var finalCost = purchaseAmount

    if (purchaseAmount in 1001..10_000) {
       finalCost = purchaseAmount - 100
    } else if (purchaseAmount > 10_000) {
       finalCost = purchaseAmount * 95 / 100
    }

    if (isConstant) {
        finalCost = finalCost * 99 / 100
    }

    println(finalCost)
}