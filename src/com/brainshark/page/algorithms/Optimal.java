package com.brainshark.page.algorithms;

import java.text.NumberFormat;

import com.brainshark.page.PagingStorage;
import com.brainshark.page.entity.MemoryBlock3;
import com.brainshark.page.entity.MemoryBlock4;

public class Optimal {

	MemoryBlock3 memoryBlock3 = new MemoryBlock3();
	MemoryBlock4 memoryBlock4 = new MemoryBlock4();
	int memoryBlock3LackPageCount;
	int memoryBlock3ReplacePageCount;
	int memoryBlock4LackPageCount;
	int memoryBlock4ReplacePageCount;
	NumberFormat percentFormat = NumberFormat.getPercentInstance();

	@SuppressWarnings("static-access")
	public void algorithms(int block) {
		PagingStorage pagingStorage = new PagingStorage();
		int memory[] = new int[block];
		for (int i = 0; i < memory.length; i++) {
			memory[i] = -1;
		}
		System.out.println("OPT算法" + block + "内存");
		if (block == 3) {
			System.out.println("次数:\t\t" + "内存块A:\t\t" + "内存块B:\t\t" + "内存块C:\t\t" + "是否缺页:\t\t" + "是否置换:");
		}
		if (block == 4) {
			System.out.println(
					"次数:\t\t" + "内存块A:\t\t" + "内存块B:\t\t" + "内存块C:\t\t" + "内存块D:\t\t" + "是否缺页:\t\t" + "是否置换:\t");
		}
		for (int i = 0; i < pagingStorage.page.length; i++) {
			memoryBlock3.setLackPage(false);
			memoryBlock4.setLackPage(false);
			memoryBlock3.setReplacePage(false);
			memoryBlock4.setReplacePage(false);
			if (paramExist(memory, pagingStorage.page[i])) {
				if (block == 3) {
					System.out.print("第" + (i + 1) + "次");
					System.out.println(memoryBlock3.toString());
				}
				if (block == 4) {
					System.out.print("第" + (i + 1) + "次");
					System.out.println(memoryBlock4.toString());
				}
				continue;
			} else {
				if (block == 3) {
					memoryBlock3.setLackPage(true);
					memoryBlock3LackPageCount++;
				}
				if (block == 4) {
					memoryBlock4.setLackPage(true);
					memoryBlock4LackPageCount++;
				}
				int emptyIndex = existEmpty(memory);
				if (emptyIndex == -1) {
					int maxIndex = getMaxIndex(memory, pagingStorage.page, i);
					memory[maxIndex] = pagingStorage.page[i];
					memoryReplace(memory, maxIndex, block);
					if (block == 3) {
						memoryBlock3.setReplacePage(true);
						memoryBlock3ReplacePageCount++;
					}
					if (block == 4) {
						memoryBlock4.setReplacePage(true);
						memoryBlock4ReplacePageCount++;
					}
				} else {
					memory[emptyIndex] = pagingStorage.page[i];
					memoryReplace(memory, emptyIndex, block);
				}
				if (block == 3) {
					System.out.print("第" + (i + 1) + "次");
					System.out.println(memoryBlock3.toString());
				}
				if (block == 4) {
					System.out.print("第" + (i + 1) + "次");
					System.out.println(memoryBlock4.toString());
				}
			}
		}
		if (block == 3) {
			System.out.println("缺页次数:" + memoryBlock3LackPageCount + "\t置换次数:" + memoryBlock3ReplacePageCount + "\t缺页率:"
					+ percentFormat.format(memoryBlock3LackPageCount / (double) pagingStorage.page.length));
		}
		if (block == 4) {
			System.out.println("缺页次数:" + memoryBlock4LackPageCount + "\t置换次数:" + memoryBlock4ReplacePageCount + "\t缺页率:"
					+ percentFormat.format(memoryBlock4LackPageCount / (double) pagingStorage.page.length));
		}
	}

	public void memoryReplace(int[] memory, int i, int block) {
		if (block == 3) {
			if (i == 0) {
				memoryBlock3.setA(memory[i]);
			} else if (i == 1) {
				memoryBlock3.setB(memory[i]);
			} else if (i == 2) {
				memoryBlock3.setC(memory[i]);
			}
		}
		if (block == 4) {
			if (i == 0) {
				memoryBlock4.setA(memory[i]);
			} else if (i == 1) {
				memoryBlock4.setB(memory[i]);
			} else if (i == 2) {
				memoryBlock4.setC(memory[i]);
			} else if (i == 3) {
				memoryBlock4.setD(memory[i]);
			}
		}
	}

	public int existEmpty(int[] memory) {
		for (int i = 0; i < memory.length; i++) {
			if (memory[i] == -1)
				return i;
		}
		return -1;
	}

	public boolean paramExist(int[] memory, int param) {
		for (int i = 0; i < memory.length; i++) {
			if (memory[i] == param)
				return true;
		}
		return false;
	}

	public int getMaxIndex(int[] memory, int[] page, int i) {
		int minBlockIndex = -1;
		int minPlaceIndex = -1;
		for (int blockIndex = 0; blockIndex < memory.length; blockIndex++) {
			for (int placeIndex = i + 1; placeIndex < page.length; placeIndex++) {
				if (page[placeIndex] == memory[blockIndex]) {
					if (minPlaceIndex < placeIndex) {
						minPlaceIndex = placeIndex;
						minBlockIndex = blockIndex;
					}
					break;
				}
				if (placeIndex == page.length - 1 && page[placeIndex] != memory[blockIndex]) {
					return blockIndex;
				}
			}
		}
		return minBlockIndex;
	}

}