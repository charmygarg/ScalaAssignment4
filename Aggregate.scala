class AggregateList
{
	
  	var lst3 : List[Any] = List()
	def singleList(lst1:List[Int], lst2:List[String])={
		var l1 = for{
			index <- 0 to lst1.length - 1
			val tuple = (lst1(index), lst2(index))
			lst3 = (tuple._index).toList
		}yield lst3
		println(l1)
	}
}
object Aggregate extends App
{
	val lst1 = List(1,2)
	val lst2 = List("Charmy","Shubham")
	val lst = new AggregateList
	lst.singleList(lst1,lst2)
}
