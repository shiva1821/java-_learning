package Encaptsulation;

public class Book {
	private int pageNum;
	  void setPageNum(int pgNo) {
		if(pgNo==44) {
			System.out.println("correct page");
			pageNum=pgNo;
		}
		else {
			System.out.println("enter wrong num");
		}
	  }
	  
		int getPageNum() {
			return pageNum;
		}
}


		