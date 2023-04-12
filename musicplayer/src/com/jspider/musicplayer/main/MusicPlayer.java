package com.jspider.musicplayer.main;
import java.util.Scanner;

import com.jspider.musicplayer.operation.SongsOperation;
public class MusicPlayer {
	private static Scanner scanner =new Scanner (System.in);
	private static int choice;
	public static void main(String[] args) {
		
		SongsOperation.MusicPlayerMenu();
		int choice=scanner.nextInt();
		switch (choice) {
		case 1:
			switch(choice) {
			case  1:
				return ;
			}
			
		}
	}
}
