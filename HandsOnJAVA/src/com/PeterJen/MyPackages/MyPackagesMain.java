package com.PeterJen.MyPackages;

public class MyPackagesMain {

	public static void main(String[] args) {
		MyPackageClass1 mp1 = new MyPackageClass1();
		mp1.x = "zzz";
		com.PeterJen.MyPackages.MyPackageClass1 mpcom = new com.PeterJen.MyPackages.MyPackageClass1();
		mpcom.x = "xxx";
		
		doSomething();
		
	}
	//public static void doSomething() {
	protected static void doSomething() {
	//private static void doSomething() {
		System.out.println("Do here");
	}
}
