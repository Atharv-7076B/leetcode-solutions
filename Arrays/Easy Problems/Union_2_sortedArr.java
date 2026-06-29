class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int[] res = new int[nums1.length + nums2.length];
        int idx = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (idx == 0 || res[idx - 1] != nums1[i]) {
                    res[idx++] = nums1[i];
                }
                i++;
            } else if (nums1[i] > nums2[j]) {
                if (idx == 0 || res[idx - 1] != nums2[j]) {
                    res[idx++] = nums2[j];
                }
                j++;
            } else {
                if (idx == 0 || res[idx - 1] != nums1[i]) {
                    res[idx++] = nums1[i];
                }
                i++;
                j++;
            }
        }
        while (i < nums1.length) {
            if (idx == 0 || res[idx - 1] != nums1[i]) {
                res[idx++] = nums1[i];
            }
            i++;
        }

        while (j < nums2.length) {
            if (idx == 0 || res[idx - 1] != nums2[j]) {
                res[idx++] = nums2[j];
            }
            j++;
        }

        int ans[] = new int[idx];
        for (int k = 0; k < idx; k++) {
            ans[k] = res[k];
        }
        return ans;
    }
}