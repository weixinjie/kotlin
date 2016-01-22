// Auto-generated by org.jetbrains.kotlin.generators.tests.GenerateRangesCodegenTestData. DO NOT EDIT!
import java.util.ArrayList

fun box(): String {
    val list1 = ArrayList<Int>()
    for (i in (3..9 step 2).reversed()) {
        list1.add(i)
        if (list1.size > 23) break
    }
    if (list1 != listOf<Int>(9, 7, 5, 3)) {
        return "Wrong elements for (3..9 step 2).reversed(): $list1"
    }

    val list2 = ArrayList<Int>()
    for (i in (3.toByte()..9.toByte() step 2).reversed()) {
        list2.add(i)
        if (list2.size > 23) break
    }
    if (list2 != listOf<Int>(9, 7, 5, 3)) {
        return "Wrong elements for (3.toByte()..9.toByte() step 2).reversed(): $list2"
    }

    val list3 = ArrayList<Int>()
    for (i in (3.toShort()..9.toShort() step 2).reversed()) {
        list3.add(i)
        if (list3.size > 23) break
    }
    if (list3 != listOf<Int>(9, 7, 5, 3)) {
        return "Wrong elements for (3.toShort()..9.toShort() step 2).reversed(): $list3"
    }

    val list4 = ArrayList<Long>()
    for (i in (3.toLong()..9.toLong() step 2.toLong()).reversed()) {
        list4.add(i)
        if (list4.size > 23) break
    }
    if (list4 != listOf<Long>(9, 7, 5, 3)) {
        return "Wrong elements for (3.toLong()..9.toLong() step 2.toLong()).reversed(): $list4"
    }

    val list5 = ArrayList<Char>()
    for (i in ('c'..'g' step 2).reversed()) {
        list5.add(i)
        if (list5.size > 23) break
    }
    if (list5 != listOf<Char>('g', 'e', 'c')) {
        return "Wrong elements for ('c'..'g' step 2).reversed(): $list5"
    }

    return "OK"
}
