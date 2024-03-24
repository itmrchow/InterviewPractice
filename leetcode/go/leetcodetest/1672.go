package leetcodetest

func MaximumWealth(accounts [][]int) int {
	max := 0

	for _, ary := range accounts {
		sum := 0

		for _, element := range ary {
			sum += element
		}

		if sum > max {
			max = sum
		}
	}

	return max
}
