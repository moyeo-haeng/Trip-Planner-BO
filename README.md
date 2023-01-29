# Trip-Planner-BO

whyyyyy

## 참고
나중에 지울 거임

### .GRADLE
1. 주석처리 된 거
 
나중에 회원에서 쓸거임. 지금 주석 해제하면 localhost 실행 때마다 로그인 해줘야돼서 우선 주석 처리

2. runtimeOnly 'com.h2database:h2'

JPA 그래들에 넣어놓으려면 이거 쓰거나 DB 연결 해야됨

DB 연결 안 한 사람 있을 거 같아서 넣어놓음

### yml
1. application-db.yml

DB 정보

DB명은 그대로 쓰고, 원한다면 아이디랑 패스워드만 변경해서 쓸 것

만약 아이디랑 패스워드 변경해서 쓸거면 `.gitignore` 에 `application-db.yml` 추가'해줘'
