// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    val deliveredOrders = orders.filter { it.isDelivered }
    return deliveredOrders.flatMap { it.products }.maxBy { it.price }
}

// Return how many times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    val orderedProducts = customers.flatMap { it.orders.flatMap { it.products } }
//    return orderedProducts.filter { it.name == product.name }.size
    return orderedProducts.count { it == product }
}
