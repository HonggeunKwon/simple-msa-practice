# simple-msa-practice
MSA, DDD 연습용 SAMPLE CODE

# Content
MSA, DDD 연습용 프로젝트 입니다.
- 대락적인 서버 아키텍쳐는 다음과 같습니다.
  - CRUD를 Command(CUD) + Query(R)로 분리함
  - 스프링 클라우드 기능을 활용, 서로 도메인 간의 제어를 활용
  - Kafka적용하여 SAGA 패턴 적용하여 분산 트랜잭션 관리 (to be continued.)

# Modules

#### - common-project : cqrs 베이스 모듈
#### - eureka-service : Eureka 서버
#### - gateway-service : 게이트웨이 서버 = 로드 밸런싱 및 동적 라우팅 추가 (예정 -> 서비스에 필터 적용하여 사용자 걸러내기)
#### - auth-service : 로그인 관련 서버, 혹은 클라이언트 endpoint의 개념의 서버도 될것이라 생각
#### - user-service : 유저 도메인 관련 서버
#### - event-service : 일정 관련 도메인 분리 서버 (미구현)
#### - config-service : Config Server (미구현)

# Skill Stack
- Eureka, Spring cloud : 서버 정보를 공유, 동적 라우팅 추가 가능 및 서로간의 엔드포인트 변화에 대처 가능
- OpenFeign : 손쉽게 다른 도메인 서버 API 호출
- Spring Gateway : 서버의 스케일링 제어 및 로드 밸런싱
