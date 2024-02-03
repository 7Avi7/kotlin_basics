fun main() {

   val nums = mutableListOf(1,2,3,4,5)

   println(nums)
   println(nums.indexOf(4))
   println(nums.contains(4))

   nums[1] = 3
   println(nums)

   nums.add(6)
   println(nums)


   nums.remove(3)
   nums.remove(3)
   println(nums)


   val list2 = listOf(11,12)

   nums.addAll(list2)

   println(nums)


}