![image](https://github.com/user-attachments/assets/cd60adfa-96cf-4fb2-a038-d5ff873c79c1)

# 주문-결제-배송 시스템

- 편의상 프로젝트는 단일 Repository에 모듈 구조로 되어있지만, 각 서버는 독립된 환경이라고 간주한다.

## 순서

- Store API에서 상품을 등록 및 구매를 하면
  - Payment API 서버로 결제 요청을 보낸다.
    - 결제가 완료 됐다면, Delivery API 서버에서 배송을 진행한다.

