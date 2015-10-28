package com.java.sort;

import java.util.Arrays;

/**
 * 时间复杂度：最好O(n2),平均O(n2),最坏O(n2)
 * 空间复杂度：O(1)
 * 不稳定
 * 内部排序
 *
 */

public class Select {
	public static void sort(int[] src) {
		System.out.println("select src:" + Arrays.toString(src));
		for (int i = 0; i < src.length-1; i++) {
			int min = i;
			for (int j = i+1; j < src.length; j++) {
				if (src[j] < src[min]) {
					min = j;
				}
			}
			if (i != min) {
				src[i] = src[i]^src[min];
				src[min] = src[i]^src[min];
				src[i] = src[i]^src[min];
				System.out.println("select swap:" + Arrays.toString(src));
			}
		}
		System.out.println("select sort:" + Arrays.toString(src));
	}	
}
