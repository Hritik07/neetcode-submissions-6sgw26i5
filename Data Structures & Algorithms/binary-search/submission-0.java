class Solution {
    public int search(int[] nums, int target) {
        return bn(nums, 0, nums.length-1, target);
    }
    public int bn(int[] arr, int left , int right, int target){
        if (left > right ) return -1;
        int mid = left + (right-left)/2;
        if (arr[mid] == target ) return mid;
        else if (arr[mid] < target){
            return bn(arr,mid+1, right, target);
        } 
        else return bn(arr, left, mid-1, target);
    }
}
