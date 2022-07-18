object Area extends App{

    def AreaOfDisk(r:Double):Double = r * r * math.Pi

    print("Enter value of r: ")
    var r:Double = scala.io.StdIn.readDouble()

    print("Area of disk: " + AreaOfDisk(r))
}