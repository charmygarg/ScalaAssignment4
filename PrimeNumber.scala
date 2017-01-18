

object PrimeNumber extends App{
  val x =List(2,3,4,5,6,7,8,11,13,14)

for(i<-x)
{
var count=0
for(t<-2 to i-1)
{
if((i%t)==0)
{
count=count+1

}

}
if(count==0)
{
println(i)
}

}
}