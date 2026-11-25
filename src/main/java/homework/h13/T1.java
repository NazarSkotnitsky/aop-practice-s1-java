// https://leetcode.com/problems/first-bad-version/
class VersionControl {
    private int badVersion;

    public void setBadVersion(int badVersion) {
        this.badVersion = badVersion;
    }

    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.setBadVersion(4);
        System.out.println(solution.firstBadVersion(5));

        solution.setBadVersion(1);
        System.out.println(solution.firstBadVersion(1));
    }
}
