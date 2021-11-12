class CommissionCalc {
    companion object {
        private const val COMMISSION_PERCENT = 0.75
        private const val MIN_COMMISSION_RUB = 35L
        private const val KOP_PER_RUB = 1000

        private fun rubToKop(amount: Long): Long {
            return amount * KOP_PER_RUB
        }

        private fun calc(amount: Long): Long {
            val c = (COMMISSION_PERCENT * amount / 100).toLong()
            val minCommissionKop = rubToKop(MIN_COMMISSION_RUB)
            return if (c > minCommissionKop) c else minCommissionKop
        }

        fun start() {
            println("Введите сумму перевода в коп.:")
            val c = readLine()?.let { calc(it.toLong()) }
            println("Комиссия = $c коп.")
        }
    }
}