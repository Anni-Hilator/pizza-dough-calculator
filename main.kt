import java.util.Locale

const val recipeFlour =  450.00 //g
const val recipeWater = 230.00 //ml
const val  recipeYeast = 21.00 //g
const val  recipeSalt = 2.00 //TL
const val  recipeOil = 2.00 //EL

fun main() {
    val flourUsed = getFlourUsed() // Assuming this function retrieves the flour used from user input

    // Calculate the other ingredients based on the flour amount
    val factor = flourUsed / recipeFlour
    val waterUsed = recipeWater * factor
    val yeastUsed = recipeYeast * factor
    val saltUsed = recipeSalt * factor
    val oilUsed = recipeOil * factor

    // Print the calculated recipe
    printRecipe(flourUsed, waterUsed, yeastUsed, saltUsed, oilUsed)
}

fun getFlourUsed(): Double {
    while (true) {
        println("Please enter the amount of flour you want to use (in grams):")
        val flourInput = readlnOrNull()

        // Check if the input is a valid positive number
        val flourUsed = flourInput?.toDoubleOrNull()

        if (flourUsed != null && flourUsed > 0) {
            return flourUsed
        } else {
            println("Invalid amount of flour. Please enter a positive number.")
        }
    }
}


fun printRecipe(flourUsed: Double, waterUsed: Double, yeastUsed: Double, saltUsed: Double, oilUsed: Double) {
    println("\nIngredients for your pizza dough:")
    println("Flour: %.2fg".format(Locale.US, flourUsed))
    println("Water: %.2fml".format(Locale.US, waterUsed))
    println("Yeast: %.2fg".format(Locale.US, yeastUsed))
    println("Salt: %.2ftsp".format(Locale.US, saltUsed))
    println("Oil: %.2ftbsp".format(Locale.US, oilUsed))
}

