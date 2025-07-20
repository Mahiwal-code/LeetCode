## ⚙️ Step-by-step Logic:

Iterate Through All Possible "Start" Points:

You use an outer loop to select every possible starting position for a subarray or a buy day. This loop goes from the beginning of the array up to nearly the end.

Iterate Through All Possible "End" Points (Relative to the Start):

Inside the first loop, you use a second, nested loop (j) to select every possible ending position for the subarray or a sell day. This loop typically starts from or after the current start point (i) to ensure you're considering valid ranges (selling after buying).

Calculate/Evaluate for Each Combination:

For each pair of "start" (i) and "end" (j) points, we perform the necessary calculation.


For "Best Time to Buy and Sell Stock" (O(n^2) brute force), you directly calculate the profit prices[j] - prices[i].

You then compare this calculated value  with a max variable  that keeps track of the best result found so far.

- Return the result:

  After the loop ends, max_profit will hold the maximum price .

## My Optimized Approach

  Tracking minPrice (Buy Point):

We initialize a variable, let's call it minPrice, to a very large value (e.g., Integer.MAX_VALUE). This minPrice will always store the lowest price encountered so far as we iterate through the prices array from left to right.

For each day's price prices[i], we compare it with the current minPrice. If prices[i] is lower, we update minPrice to prices[i]. This ensures minPrice always holds the best (lowest) buy price up to the current day.

Tracking maxPrice Maximum Profit So Far:

we also initialize a variable, let's call it maxPrice (or maxProfit), to 0 (since profit cannot be negative for this problem, as we can choose not to buy/sell). This maxPrice will store the largest profit found so far.

For each day's price (prices[i]), we calculate a potential profit: prices[i] - minPrice. This represents the profit we would make if we bought at the minPrice seen before or at the current day and sold on the current day.

we then compare this potential profit with the current maxPrice. If the potential profit is higher, we update maxPrice.
