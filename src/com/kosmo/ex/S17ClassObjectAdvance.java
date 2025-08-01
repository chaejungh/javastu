package com.kosmo.ex;

public class S17ClassObjectAdvance {
    /*
---

### 1. **학생 성적 관리 클래스 구현**

* `Student` 클래스
class Student2 {
    String name;
    String id;
    int kor;
    int eng;
    int math;

    Student2(String name, String id, int kor, int eng, int math) {
        this.name = name;
        this.id = id;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    int getTotal(){
        return kor+eng+math;
    }
    double getAverage(){
        return getTotal()/3.0;
    }
    String getGrade(){
        if(getAverage()>=90){
            return "A";
        } else if (getAverage()>=80) {
            return "B";
        } else if (getAverage()>=70) {
            return "C";
        } else if (getAverage()>=70) {
            return "D";
        }else return "F";
    }
    void showInfo(){
        System.out.println("이름:"+name);
        System.out.println("학번:"+id);
        System.out.println("총점:"+getTotal());
        System.out.println("평균:"+getAverage());
        System.out.println("등급:"+getGrade());
    }
}

public static void main(String[]args){
    Student2 stu = new Student2("chae","2023",89,90,66);
    stu.showInfo();
}

  * 필드: 이름(String), 학번(String), 국어(int), 영어(int), 수학(int)
  * 생성자: 모든 필드 초기화
  * 메서드:

    * `getTotal()`: 세 과목 점수 합 반환
    * `getAverage()`: 세 과목 점수 평균(double) 반환
    * `getGrade()`: 평균 점수 기준으로 학점(A\~F) 반환

      * 90 이상 A, 80 이상 B, 70 이상 C, 60 이상 D, 그 외 F
    * `showInfo()`: 이름, 학번, 총점, 평균, 학점 출력

---

### 2. **도서관 도서 관리 시스템의 `Book` 클래스**

* 필드:



class Book{
    String title;
    String author;
    int price;
    boolean borrowed;

    Book(String title, String author, int price, boolean borrowed){
        this.title = title;
        this.author = author;
        this.price = price;
        this.borrowed = borrowed;
    }
    void borrowBook(){
        if(!borrowed){borrowed=true;System.out.println("대출 성공");}
        else System.out.println("대출 불가");
    }
    void returnBook(){
        borrowed = false;
    }
    void showInfo(){
        System.out.println("제목:"+title);
        System.out.println("저자:"+author);
        System.out.println("가격:"+price);
        System.out.println("대출 여부:"+borrowed);
    }
}


 public static void main(String[]args){
    Book book = new Book("Harry Potter","J.K롤링",20000,true);
        book.borrowBook();
        book.returnBook();
        book.showInfo();

    }


  * `title` (String)
  * `author` (String)
  * `price` (int)
  * `borrowed` (boolean) : 대출 여부
* 생성자: 모든 필드 초기화 (`borrowed`는 기본 false)
* 메서드:

  * `borrowBook()`: 대출 상태가 아니면 `borrowed`를 true로 바꾸고 대출 성공 메시지 출력, 이미 대출 중이면 대출 불가 메시지 출력
  * `returnBook()`: 반납 처리 (`borrowed`를 false로 바꿈)
  * `showInfo()`: 책 정보와 대출 여부 출력

---

### 3. **간단한 은행 거래 내역 관리**

* `Transaction` 클래스

  * 필드: 거래 종류(String, "입금" 또는 "출금"), 거래 금액(int), 거래 시간(String)
  * 생성자: 모든 필드 초기화
  * 메서드: `showTransaction()`으로 거래 내역 출력

* `BankAccount` 클래스

  * 필드: 계좌번호(String), 예금주(String), 잔액(int), 거래내역 리스트(ArrayList<Transaction>)
  * 생성자: 계좌번호, 예금주 초기화, 잔액은 0, 거래내역 리스트 생성
  * 메서드:

    * `deposit(int amount)`: 잔액 증가, 거래내역 추가
    * `withdraw(int amount)`: 잔액이 충분하면 출금, 거래내역 추가, 아니면 “잔액 부족” 출력
    * `showAccountInfo()`: 계좌 정보 출력
    * `showTransactionHistory()`: 모든 거래내역 출력

---

class Transaction{
    String transfer;
    int money;
    String time;
    Transaction(String transfer, int money, String time){
        this.transfer = transfer;
        this.money = money;
        this.time = time;
    }
    void showTransaction(){
        System.out.println("시간:"+time+"시:");
        System.out.print(transfer);
        System.out.println(","+money);
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transfer='" + transfer + '\'' +
                ", money=" + money +
                ", time='" + time + '\'' +
                '}';
    }
}
class BankAccount{
    String account;
    String name;
    int remainMoney;
    int count;
    ArrayList<Transaction> li;
    BankAccount(String account, String name, int remainMoney, ArrayList<Transaction> li){
        this.account = account;
        this.name = name;
        this.remainMoney = 0;
        this.li = new ArrayList<>();
    }
    void deposit(int amount){
        remainMoney+=amount;

        li.add(count++,new Transaction("입금",amount,""));
    }
    void withdraw(int amount){
        if(remainMoney>=amount){
            remainMoney-=amount;
            li.add(count++,new Transaction("출금",amount,""));
        }
    }
    void showAccountInfo(){
        System.out.println("계좌번호:"+account);
        System.out.println("이름:"+name);
        System.out.println("잔액:"+remainMoney);
    }
    void showTransactionHistory(){
        for (int i = 0; i < li.size(); i++) {
            System.out.println(li.get(i));
        }

    }
}


public static void main(String[]args){

        Transaction tran = new Transaction("입금",20000,"10");
        BankAccount acc = new BankAccount("110","chae",0,new ArrayList<>());
        acc.deposit(200);
        acc.withdraw(100);
        acc.showAccountInfo();
        acc.showTransactionHistory();
    }



### 4. **택배 주문 관리 클래스 `Order`**

class Order{
    String id;
    String name;
    String address;
    int orderMoney;
    String status;

    Order(String id, String name, String address, int orderMoney, String status){
        this.id=id;
        this.name=name;
        this.address=address;
        this.orderMoney=orderMoney;
        this.status=status;
    }
    void updateStatus(String newStatus){
       switch (newStatus){
           case "접수", "배송중", "완료": status = newStatus;
                System.out.println(status+"상태로 업데이트 됨");break;
           default:
               System.out.println("가능한 상태가 아닙니다");
       }


    }

    void showInfo(){
        System.out.print("주문번호:"+id);
        System.out.print(" 수취인:"+name);
        System.out.print(" 배송지:"+address);
        System.out.print(" 주문 금액:"+orderMoney);
        System.out.print(" 배송 상태:"+status);
    }
}



public static void main(String[]args){
Order order = new Order("0105","chae","Seoul",20000,"접수");
order.updateStatus("완료");
order.showInfo();

}

* 필드: 주문번호(String), 수취인(String), 배송지(String), 주문금액(int), 배송상태(String, "접수", "배송중", "완료")
* 생성자: 모든 필드 초기화
* 메서드:

  * `updateStatus(String newStatus)`: 배송상태 변경 (가능한 상태만 변경하도록 검증)
  * `showOrderInfo()`: 주문 정보를 출력

---

### 5. **간단한 가계부 클래스 `Expense`**

* 필드: 날짜(String, "YYYY-MM-DD"), 항목(String), 금액(int), 카테고리(String)

* 생성자: 모든 필드 초기화

* 메서드: `showExpense()`로 지출 내역 출력

* `ExpenseManager` 클래스

  * 필드: `ArrayList<Expense>`
  * 메서드:

    * `addExpense(Expense e)`
    * `getTotalByCategory(String category)`: 해당 카테고리 지출 합계 반환
    * `showAllExpenses()`: 모든 지출 출력


class Expense{
    String date;
    String type;
    int money;
    String category;
    Expense( String date, String type, int money, String category){
        this.date = date;
        this.type = type;
        this.money = money;
        this.category = category;
    }
    public void showExpense(){
        System.out.println("날짜:"+date);
        System.out.println("항목:"+type);
        System.out.println("금액:"+money);
        System.out.println("카테고리:"+category);
    }
    public String getCategory(){
        return category;
    }
    public int getMoney(){
        return money;
    }
}
class ExpenseManager{
    ArrayList<Expense> arr =new ArrayList<>();
    public void addExpense(Expense e ){
        arr.add(e);
    }
    public int getTotalByCategory(String category){
        int sum =0;
        for(Expense e:arr){
            if(e.getCategory().equals(category)){
                sum+= e.getMoney();
            }
        }
        return sum;
    }
    public void showAllExpenses(){

        for(Expense ex : arr){
            ex.showExpense();
        }
    }
}


---
아래는 각 문제별 모범답안입니다. 이해하기 쉽도록 기본적인 자바 문법과 객체지향 원칙에 맞춰 작성했습니다.

---

### 1. 학생 성적 관리 클래스 `Student`

```java
public class Student {
    private String name;
    private String id;
    private int korean;
    private int english;
    private int math;

    public Student(String name, String id, int korean, int english, int math) {
        this.name = name;
        this.id = id;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public int getTotal() {
        return korean + english + math;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    public char getGrade() {
        double avg = getAverage();
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }

    public void showInfo() {
        System.out.printf("이름: %s, 학번: %s, 총점: %d, 평균: %.2f, 학점: %c\n",
                name, id, getTotal(), getAverage(), getGrade());
    }
}
```

---

### 2. 도서관 도서 관리 클래스 `Book`

```java
public class Book {
    private String title;
    private String author;
    private int price;
    private boolean borrowed;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.borrowed = false;
    }

    public void borrowBook() {
        if (!borrowed) {
            borrowed = true;
            System.out.println(title + " 대출 성공");
        } else {
            System.out.println(title + "은 이미 대출 중입니다.");
        }
    }

    public void returnBook() {
        borrowed = false;
        System.out.println(title + " 반납 완료");
    }

    public void showInfo() {
        System.out.printf("책 제목: %s, 저자: %s, 가격: %d원, 대출 여부: %s\n",
                title, author, price, borrowed ? "대출중" : "가능");
    }
}
```

---

### 3. 은행 거래 내역 관리 `Transaction` & `BankAccount`

```java
import java.util.ArrayList;

public class Transaction {
    private String type; // 입금 or 출금
    private int amount;
    private String time;

    public Transaction(String type, int amount, String time) {
        this.type = type;
        this.amount = amount;
        this.time = time;
    }

    public void showTransaction() {
        System.out.printf("[%s] %s : %d원\n", time, type, amount);
    }
}

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;
    private ArrayList<Transaction> transactions;

    public BankAccount(String accountNumber, String owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(int amount, String time) {
        balance += amount;
        transactions.add(new Transaction("입금", amount, time));
    }

    public void withdraw(int amount, String time) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction("출금", amount, time));
        } else {
            System.out.println("잔액 부족");
        }
    }

    public void showAccountInfo() {
        System.out.printf("계좌번호: %s, 예금주: %s, 잔액: %d원\n", accountNumber, owner, balance);
    }

    public void showTransactionHistory() {
        System.out.println("거래 내역:");
        for (Transaction t : transactions) {
            t.showTransaction();
        }
    }
}
```

---

### 4. 택배 주문 관리 클래스 `Order`

```java
public class Order {
    private String orderNumber;
    private String recipient;
    private String address;
    private int amount;
    private String status; // 접수, 배송중, 완료

    public Order(String orderNumber, String recipient, String address, int amount, String status) {
        this.orderNumber = orderNumber;
        this.recipient = recipient;
        this.address = address;
        this.amount = amount;
        this.status = status;
    }

    public void updateStatus(String newStatus) {
        if (newStatus.equals("접수") || newStatus.equals("배송중") || newStatus.equals("완료")) {
            this.status = newStatus;
        } else {
            System.out.println("잘못된 배송 상태입니다.");
        }
    }

    public void showOrderInfo() {
        System.out.printf("주문번호: %s, 수취인: %s, 배송지: %s, 주문금액: %d원, 상태: %s\n",
                orderNumber, recipient, address, amount, status);
    }
}
```

---

### 5. 가계부 `Expense`와 `ExpenseManager`

```java
import java.util.ArrayList;

public class Expense {
    private String date;
    private String item;
    private int amount;
    private String category;

    public Expense(String date, String item, int amount, String category) {
        this.date = date;
        this.item = item;
        this.amount = amount;
        this.category = category;
    }

    public void showExpense() {
        System.out.printf("%s, %s, %d원, %s\n", date, item, amount, category);
    }

    public String getCategory() {
        return category;
    }

    public int getAmount() {
        return amount;
    }
}

public class ExpenseManager {
    private ArrayList<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense e) {
        expenses.add(e);
    }

    public int getTotalByCategory(String category) {
        int sum = 0;
        for (Expense e : expenses) {
            if (e.getCategory().equals(category)) {
                sum += e.getAmount();
            }
        }
        return sum;
    }

    public void showAllExpenses() {
        for (Expense e : expenses) {
            e.showExpense();
        }
    }
}
```

---


*/
}
