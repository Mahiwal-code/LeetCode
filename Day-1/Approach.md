## ⚙️ Step-by-step Logic:

- Initialize two variables:

  max_sum: to keep track of the maximum subarray sum found so far.

  It is initialized to Integer.MIN_VALUE to ensure any sum will be larger initially.

  current_max: to store the sum of the current subarray we are checking.

  Initialized to 0.

- Iterate through the array:

  For each element in the array:

- Add it to current_max.

- Compare current_max with max_sum. If current_max is greater, update max_sum.

- If current_max becomes negative, it means the subarray so far is reducing our total sum — so we reset current_max to 0 (start fresh from the next element).

- Return the result:

  After the loop ends, max_sum will hold the maximum sum of any contiguous subarray.
