object HelloWorld extends App {
	println(s"-- start program v${Version.v}")
	println("Ciao mondo")

	println("Il numero segreto e' : " + scala.util.Random.nextInt(10));
}