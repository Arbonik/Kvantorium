import kotlin.math.abs
import kotlin.math.sin

var descs = arrayOf("ИТ КВАНТУМ САМЫЙ УМНЫЙ, ИТ КВАНТУМ САМЫЙ КРАСИВЫЙ", "БИО КВАНТУМ САМЫЙ ЖИВОЙ","АЭРО КВАНТУМ САМЫЙ ШУМНЫЙ")
var spaces = arrayOf(16,120, 15)
var kvantNames = arrayOf("IT","BIO","AERO")

class Kvantorium {
    fun make_Kvant(type : String) : Kvant{
        var k : Kvant = Kvant()
        when(type){
            "it"->{
                k.name = kvantNames[0]
                k.space = spaces[0]
                k.desc = descs[0]
            }
            "bio"->{
                k.name = kvantNames[1]
                k.space = spaces[1]
                k.desc = descs[1]
            }
            "aero"->{
                k.name = kvantNames[2]
                k.space = spaces[2]
                k.desc = descs[2]
            }
        }
        return k
    }

}
