class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;

    }

    private void backtrack(List<String> result, StringBuilder curr, int open, int close, int max) {

        // base
        if (open == max && close == max) {
            result.add(curr.toString());
            return;
        }

        // for (
        if (open < max) {
            curr.append("(");
            backtrack(result, curr, open + 1, close, max);
            curr.deleteCharAt(curr.length() - 1);

        }
        // for )
        if (close < open) {
            curr.append(")");
            backtrack(result, curr, open, close + 1, max);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
}