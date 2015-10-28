package com.java.sort;

import java.util.Arrays;

/**
 * 时间复杂度：最好O(n),平均O(n2),最坏O(n2)
 * 空间复杂度：O(1)
 * 稳定
 * 内部排序
 *
 */

public class Insert {
	public static void sort(int[] src) {
		System.out.println("insert src:" + Arrays.toString(src));
		
		for (int i = 0; i < src.length; i++) {
			int currentValue = src[i];
			int position = i;
			for (int j = i-1; j >= 0; j--) {
				if (src[j] > currentValue) {
					src[j+1] = src[j];
					position = position -1;
				} else {
					break;
				}
			}
			src[position] = currentValue;
			System.out.println("insert step:" + Arrays.toString(src));
		}
		
		System.out.println("insert sort:" + Arrays.toString(src));
	}	
}
