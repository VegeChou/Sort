package com.java.sort;

import java.util.Arrays;

/**
 * 时间复杂度：最好O(n),平均O(n2),最坏O(n2)
 * 空间复杂度：O(1)
 * 稳定
 * 内部排序
 *
 */

public class Bubble {
	public static void sort(int[] src) {
		boolean isSwap = false;
		System.out.println("bubble src:" + Arrays.toString(src));
		for (int i = 0; i < src.length; i++) {
			isSwap = false;
			for (int j = src.length-1; j >i; j--) {
				if (src[j] < src[j-1]) {
					src[j]=src[j]^src[j-1];
					src[j-1]=src[j]^src[j-1];
					src[j]=src[j]^src[j-1];
					isSwap = true;
					System.out.println("bubble swap:" + Arrays.toString(src));
				}
			}
			System.out.println("bubble unsort:" + Arrays.toString(src));
			if (isSwap == false) {
				System.out.println("bubble sort:" + Arrays.toString(src));
				return;
			}
		}
	}	
}
