package quest

abstract class Contract(val targetMonster: String) {
    abstract fun executeContract(adventurer: Adventurer): Boolean

}
