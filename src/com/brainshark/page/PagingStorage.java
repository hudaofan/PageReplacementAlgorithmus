package com.brainshark.page;

import java.util.Scanner;

import com.brainshark.page.algorithms.FIFO;
import com.brainshark.page.algorithms.LRU;
import com.brainshark.page.algorithms.Optimal;

public class PagingStorage {

	public static final int page[] = { 2, 3, 2, 1, 5, 2, 4, 5, 3, 2, 5, 2 };

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		while (true) {
			System.out.print("(1):Optimal (2):FIFO (3):LRU 请输入算法编号:");
			Scanner scanner = new Scanner(System.in);
			int nextInt = scanner.nextInt();
			if (nextInt == 1) {
				while (true) {
					System.out.print("请输入物理内存块数:");
					Optimal optimal = new Optimal();
					optimal.algorithms(new Scanner(System.in).nextInt());
				}
			}
			if (nextInt == 2) {
				while (true) {
					System.out.print("请输入物理内存块数:");
					FIFO fifo = new FIFO();
					fifo.algorithms(new Scanner(System.in).nextInt());
				}

			}
			if (nextInt == 3) {
				while (true) {
					System.out.print("请输入物理内存块数:");
					LRU lru = new LRU();
					lru.algorithms(new Scanner(System.in).nextInt());
				}
			}
		}
	}

}
