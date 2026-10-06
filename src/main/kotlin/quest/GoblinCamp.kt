package quest

import utils.CombatClass

class GoblinCamp : Contract("Goblin"){
    override fun executeContract(adventurer: Adventurer): Boolean {
        var winQuestChance = 80
        if(adventurer.combatClass == CombatClass.ROGUE) {
            winQuestChance += 10
        }
        val winOrNot = (1..100).random()
        if(winOrNot <= winQuestChance){
            println("Vitória conquistada! Quest concluída")
            return true
        } else {
            println("Missão fracassada")
            return false
        }
    }
}