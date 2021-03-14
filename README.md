# JAVA 다운 및 설치

[오라클] [https://www.oracle.com/kr/index.html]



제품-소프트웨어-java-java 다운로드

(최신버전15는 사용하지 않음-호환성 떨어짐)

11버전은 10을 포함 (아직은 호환성 떨어짐)

8버전 JDK Download 클릭>281=280번 업데이트 됨>윈도우64비트로 다운

\>윈도우키>cmd 입력>java 엔터>java -version 엔터



c드라이브>프로그램파일 >java >jdk

(jdk - 자바 개발&실행 / jre - 자바 실행 프로그램)

\>C:\Program Files\Java\jdk1.8.0_281 경로 복사 >우클릭 속성 >고급시스템 설정 >환경변수 >시스템변수 >새로만들기 >변수 이름: JAVA_HOME/변수 값: 복사한 경로 입력 >확인 >시스템 변수-Path >더블클릭 >텍스트 편집 >변수 값 제일 앞부분 클릭 >%JAVA_HOME%\bin; 추가

cmd 실행 >javac 엔터 (알수 없는 명령어는 잘못된 세팅)



### *java만 사용하여 완성하는 경우는 환경설정 할 필요 없음

JDK 설치 후, java개발은 매모장만으로도 가능

-텍스트에디터 프로그램 ex)editplus

-IDE(개발전용 프로그램) ex)eclipse



editplus.com/kr/>문서편집기다운로드



eclipse.org>download packages>eclipse IDE for Enterprise Java Developers>윈도우용 다운>압축풀기>eclipse 실행>workspace 설정



## eclipse

outline, task list 다 X > 우측 상단 창 추가 아이콘 > JAVA 오픈>outline, task list X >좌측 create a java project >project name 설정, JRE 두 번째 Use a project specific JRE >next >finish >create

src(소스폴더) >우클릭 >new >package(폴더) >name:test.java>finish

-->D:app 안에 java01 폴더 안에 src폴더 안에 test폴더 안에 java 폴더 생성 (.을 기준으로 안에 폴더 생성)



**[점 .] : 가지고 있다, 포함하고 있다는 의미, 알고 있다**



test.java >우클릭new >class(개발단위) >name:Main >method stub 부분 1번 public static 체크 >finish

### main method 생성 : main + shift + space bar + enter

초록 글씨아래 엔터 >System.out.println("hello world"); >저장>ctrl+F11(실행)



자주색 : 명령어(이미 java가 사용하고 있는 것)

java는 class 단위로 구별됨(한 폴더에 있어도 class가 여러가지면 다 다른 내용인 것임)



> ### ***class 이름 정하는 규칙**
>
> -첫 글자로 숫자 사용 X (ex. class 5Main, class 0Test)
>
> -특수문자 _ $ 2가지만 사용 가능, 첫 글자로 사용 가능 (ex. class _5Main)
>
> -첫 글자는 되도록이면 대문자로 사용
>
> -클래스 이름을 정할 땐, 구조를 보며 가장 적합한 이름으로 단어를 조합해서 만듦(단어별 첫 글자는 대문자로)
>
> -길게 만들어도 상관없음(파일명이 길어질 뿐)