package quest

import utils.CombatClass

class Adventurer(val name: String, val combatClass: CombatClass) {
    var level = 1
        private set

    fun gainExperience(success: Boolean) {
        if (success) {
            level++
            println("Personagem subiu de nível! Agora você está no nível $level!")
        }
    }
}
