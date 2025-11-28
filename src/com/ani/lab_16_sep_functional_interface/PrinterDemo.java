package com.ani.lab_16_sep_functional_interface;

public class PrinterDemo 
{
	public Printer getPrinter()
	{
		return new Printer() {

			@Override
			public void print() {
				System.out.println("Override print mathod in anonymous inner class");
			}
		};
	}
}
