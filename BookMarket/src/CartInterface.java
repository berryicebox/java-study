// 장바구니 처리 인터페이스
public interface CartInterface {
	void printBookList(Book[] p); // 도서 목록 출력
	boolean isCartInBook(String id); // 장바구니에 같은 책 id가 있는지 확인 (있으면 수량 추가, 없으면 장바구니에 추가)
	void insertBook (Book p); // 책 정보 추가
	void removeCart(int numId); // 장바구니에서 책 제거
	void deleteBook(); // 책 정보 삭제
}
