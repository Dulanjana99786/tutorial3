object Sphere extends App{
    def volumeSphere(r:Double):Double = 4/3 * math.Pi * r*r*r

    print("Enter value of r: ")
    var r:Double = scala.io.StdIn.readDouble()

    print("Volume of sphere: " + volumeSphere(r))
}