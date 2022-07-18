object RunningTime extends App{
    def easyPace(n:Float ):Float = n * 8
    def Tempo(m:Float ):Float  = m * 7
    def Total(x:Float,y:Float):Float = easyPace(x) + Tempo(y)
    print("Enter the distance easy pace : ")
    val d1:Float = scala.io.StdIn.readFloat()
    print("Enter the distance tempo pace : ")
    val d2:Float = scala.io.StdIn.readFloat()
    print(" running time: " + Total(d1,d2)) 
}