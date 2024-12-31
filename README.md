# modular-lunch-order
삽질후 학습을 위한 레포지토리<br/>
주문-결제-배송 시스템<br/>
편의상 프로젝트는 단일 Repository에 모듈 구조로 되어있지만, 각 서버는 독립된 환경이라고 간주한다.<br/>
순서<br/>
Store API에서 상품을 등록 및 구매를 하면<br/>
Payment API 서버로 결제 요청을 보낸다.<br/>
결제가 완료 됐다면, Delivery API 서버에서 배송을 진행한다.<br/>
