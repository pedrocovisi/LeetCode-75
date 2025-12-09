class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String result = "";
        int mdc = 0;

        if ((str1 + str2).equals(str2 + str1)) {
            mdc = mdc(str1.length(), str2.length());
            result = str1.substring(0, mdc);
        }

        return result;
    }

    private int mdc(int a, int b) {
    if (b == 0) {
    return a;
    }

    return mdc(b, a % b);

    }
}