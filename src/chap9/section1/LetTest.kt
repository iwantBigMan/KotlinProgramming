package chap9.section1

fun main(){
    val score : Int? = 32
   // var score = null

    // 일반적인 null검사
    fun checkScore(){
        if (score != null){
            println("Score: $score")
        }
    }

    // let 함수를 사용해 null 검사를 제거
    fun checkScoreLet(){
        score?.let { println("Score : $it") } // 1
        val str = score.let { it.toString() } // 2
        println(str)
    }
    checkScore()
    checkScoreLet()
}