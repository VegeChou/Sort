package com.java.sort;

import java.util.Arrays;

/**
 * 时间复杂度：最好O(nlogn),平均O(nlogn),最坏O(nlogn)
 * 空间复杂度：O(n)
 * 稳定
 * 内部排序
 *
 */
public class Merge {
	public static void sort(int[] src){
		System.out.println("merge src:" + Arrays.toString(src));
		_sort(src, 0, src.length-1);
		System.out.println("merge sorted:" + Arrays.toString(src));
	}
	
	private static void _sort(int[] src,int left,int right) {
		int middle = (left+right)/2;
		
		if (left < right) {
			// 先排序左边
			_sort(src, left, middle);
			// 再排序右边
			_sort(src, middle+1, right);
			// 左边和右边合并
			merge(src,left,middle,right);
		}
	}

	private static void merge(int[] src, int left, int middle, int right) {
		System.out.println("merge before:" + Arrays.toString(src));
		int[] temp = new int[right -left +1];
		
		int i = left;	// 左指针
		int j = middle+1;	// 右指针
		int k = 0;		// 新数组位置
		
		// 先从左右两边取较小的数放到新的数组中
		while (i<=middle&&j<=right) {
			if (src[i] < src[j]) {
				temp[k++] = src[i++];
			} else {
				temp[k++] = src[j++];
			}
		}
		
		// 如果左边有剩余数组，剩余的拷贝到新数组中
		while (i <= middle) {
			temp[k++] = src[i++];
		}
		
		// 如果右边有剩余数组，剩余的拷贝到新数组中
		while (j <= right) {
			temp[k++] = src[j++];
		}
		
		// 新数组拷贝回原数组中
		for (int k2 = 0; k2 < temp.length; k2++) {
			src[left+k2] = temp[k2];
		}
		
		System.out.println("merge after:" + Arrays.toString(src));
	}
}
