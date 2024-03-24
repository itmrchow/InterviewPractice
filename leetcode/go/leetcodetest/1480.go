package leetcodetest

// 1480. Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/description/

func RunningSum(nums []int) []int {
	// numslice := make([]int, len(nums))

	// for i, element := range nums {
	// 	if i == 0 {
	// 		numslice[i] = element
	// 	} else {
	// 		numslice[i] = numslice[i-1] + element
	// 	}
	// }

	prefix := []int{nums[0]}

	for i := 1; i < len(nums); i++ {
		prefix = append(prefix, prefix[i-1]+nums[i])
	}

	return prefix
}
