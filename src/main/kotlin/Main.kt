import quest.Adventurer
import quest.GoblinCamp
import utils.CombatClass

fun main(){

    val name = getUserInputForName()
    val classChosen = getUserInputForClass()
    println("Olá aventureiro ${name}, o ${classChosen.heroClass} foi recrutado com sucesso")
    val adventurer = Adventurer(name, classChosen)

    val questEnemy = GoblinCamp()
    val missionSuccess = questEnemy.executeContract(adventurer)

    println("Resultado da Jornada:")
    adventurer.gainExperience(missionSuccess)

}

private fun getUserInputForName(): String{
    println("Digite um nome para seu personagem")
    return readlnOrNull().toString()
}

private fun getUserInputForClass(): CombatClass {
    var pickClass: String
    do {
        println("Escolha sua classe digitando o numero correspondente:")
        println("Guerreiro (1)")
        println("Mago (2)")
        println("Ladino (3)")
        pickClass = readlnOrNull().toString()
    } while (pickClass !in listOf("1", "2", "3"))

    return when (pickClass) {
        "1" -> CombatClass.WARRIOR
        "2" -> CombatClass.MAGE
        else -> CombatClass.ROGUE
    }
}