package com.java.sort;

public class Sort {
	public static final int[] buddle_src= {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
	public static final int[] select_src= {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
	public static final int[] insert_src= {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
	public static final int[] merge_src= {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
	public static final int[] quick_src= {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
	
	public static void main(String[] args) {
		Bubble.sort(buddle_src);
		Select.sort(select_src);
		Insert.sort(insert_src);
		Merge.sort(merge_src);
		Quick.sort(quick_src);
	}
}
