import java.lang.Math


fun addBinary(a: String, b: String): String {
        val bin1 = a.reversed()
        val bin2 = b.reversed()
        val max = Math.max(bin1.length, bin2.length)

        var carry = 0
        var res = ""

        for (i in 0 until max) {
            val digit1 = if(i < bin1.length) bin1[i].toString().toInt() else 0
            val digit2 = if(i < bin2.length) bin2[i].toString().toInt() else 0

            val total = digit1 + digit2 + carry
            val char  = total % 2

            carry = total / 2

            res += char
        }

        return if (carry == 1) '1' + res.reversed() else res.reversed()
    }
