### Filter
Filter란 Web Application에서 관리되는 영역으로써 Client로 부터 오는 요청/응답에 대해서 최조/최종 단계의 위치에 존재하며 이를 통해서요청/응답의 정보를 변경하거나,
Spring에 의해서 데이터가 변환되기 전의 순수한 Client의 요청/응답 값을 확인할 수 있다.

### Interecptor

Interceptor란 Spring Context기능으로 임의의 URI를 호출시 DispatcherServlet에서 해당 Controller가 처리되기 전과후로 발생하는 이벤트이다.

주로 인증단계를 처리하거나, Logging(로깅)를 하는데에 사용한다.
이를 선/후처리 함으로써,  Service bussiness logic과 분리 시킨다.

### @Slf4j
롬복에서 제공해주는 어노테이션으로, 로깅 추상화 라이브러리이다.

로깅 추상화란, 로깅을 직접하지 않고 로깅 구현체를 찾아서 기능을 사용할 수있도록 해주는 것을 의미한다.