package leetcodetest

import "strconv"

func FizzBuzz(n int) []string {
	strSlice := make([]string, n)

	for ; n > 0; n-- {
		if n%15 == 0 {
			strSlice[n] = "FizzBuzz"
		} else if n%3 == 0 {
			strSlice[n] = "Fizz"
		} else if n%5 == 0 {
			strSlice[n] = "Buzz"
		} else {
			strSlice[n] = strconv.Itoa(n)
		}
	}

	// for i := 1; i <= n; i++ {
	// 	if i%3 == 0 && i%5 == 0 {
	// 		strSlice = append(strSlice, "FizzBuzz")
	// 	} else if i%3 == 0 {
	// 		strSlice = append(strSlice, "Fizz")
	// 	} else if i%5 == 0 {
	// 		strSlice = append(strSlice, "Buzz")
	// 	} else {
	// 		strSlice = append(strSlice, strconv.Itoa(i))
	// 	}

	// }
	return strSlice
}
