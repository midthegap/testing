object HelloWorld extends App {
	println(s"-- start program v${Version.v}")
	println("Ciao mondo")

	println("Il numero segreto e' : " + scala.util.Random.nextInt(10))
	println("Bob e' un grande programmatore")

	println("Il risultato della feature x e' " + featureX)

	def featureX(): Double = {
		val num = scala.util.Random.nextDouble()
		val den = scala.util.Random.nextDouble()
		num / den
	}
}