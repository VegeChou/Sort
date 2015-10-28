package com.java.sort;

import java.util.Arrays;

/**
 * 时间复杂度：最好O(nlogn),平均O(nlogn),最坏O(n2)
 * 空间复杂度：O(nlogn)
 * 不稳定
 * 内部排序
 *
 */
public class Quick {
	public static void sort(int[] src) {
		System.out.println("quick src:" + Arrays.toString(src));
		_sort(src,0,src.length-1);
		System.out.println("quick sorted:" + Arrays.toString(src));
	}

	private static void _sort(int[] src, int left, int right) {
		if (left < right) {
			int middle = partition(src,left,right);
			_sort(src, left, middle);
			_sort(src, middle+1,right);
		}
	}

	private static int partition(int[] src, int left, int right) {
		System.out.println("quick partition before:" + Arrays.toString(src));
		int tmp = src[left];
		while (left < right) {
			while (left<right&& src[right] > tmp) {
				right--;
			}
			src[left] = src[right];
			while (left<right&& src[left] < tmp) {
				left++;
			}
			src[right] = src[left];
			src[left] = tmp;
		}
		System.out.println("quick partition after:" + Arrays.toString(src));
		return left;
	}
}
