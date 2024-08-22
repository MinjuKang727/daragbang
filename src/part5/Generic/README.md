# GarretGeneric
스파르타 다락방 제네릭

## STEP 1
> Generic에 익숙해집시다<br>
> Type Safety를 생각해봅시다<br>
- 주어진 코드를 보고 Generic을 이용하여 수정합니다
  - 제공된 코드는 컴파일 타임에는 오류가 확인되지 않습니다.
  - 런 타임에서 형변환(casting) 문제가 발생하지 않도록 코드를 변경합니다.
  - generic을 이용하여 오류를 극복합니다.

## STEP 2
> 편의상 class를 한 파일내에 모두 작성하였습니다.<br>
> - extends 의 의미를 이해 합니다. <br>
- 주어진 코드는 컴파일 오류가 발생합니다.
- NotBoundGeneric class는 generic을 사용하지만 원하는 기능을 다른 개발자에게 제공하기엔 많은 정보가 부족합나다.
- Bounded Type (매개변수의 제한) 을 추가하여 다른 개발자가 기능을 더 쉽게 이해할 수 있도록 합니다.
- sum method 는 주어진 값을 합산하는 기능을 의도하고 있습니다.
- 정상 작동 할 수 있도록 17, 21 라인을 수정 합니다.


## STEP 3
> 편의상 class를 한 파일내에 모두 작성하였습니다.
> - 공변 (covariant) : 상속받은 부모 객체로 타입을 변화시킬 수 있다
> - 불공변 (invariant) : 상속받은 부모 객체로 타입을 변화시킬 수 없다.<br>
> 
> 불공변 해결을 위한 와일드카드 를 이해 합니다.<br><br>
> oracle 공식 사이트
> *  https://docs.oracle.com/javase/tutorial/extra/generics/wildcards.html

- Common class 의 print method 를 이용하여 collection의 item을 출력하려고 합니다.
- 제네릭은 불공변 이기 때문에 컴파일 시 오류가 발생합니다. (라인 28)
- 와일드 카드 (?) 를 이용하여 해결해 봅시다.

## STEP 4
> 편의상 class를 한 파일내에 모두 작성하였습니다. <br>
> - 주석 "읽어 봅시다" 를 확인해 주세요.
> - extends, super 의 다른 점을 이해 합시다.
- 해당 코드는 컴파일 오류가 있습니다. (라인 49)
- 여러분은 물류 시스템의 개발자로 일하고 있습니다.
- 창고 (Warehouse class) 에 라면들(ramenList) 을 입고 (store method) 하면 입고 확인 목록 (checkList) 에 추가하고 출력하는 기능을 만들고자 합니다.
- 라면 종류 (컵라면 CupRamen class, 봉지라면 BagRamen) 와 무관하게 처리될 수 있도록 합니다.
- 아침까지 작성한 코드는 완전하지 않아 컵라면 입고시 오류가 발생합니다.
- extends, super 모두를 사용하여 해당 오류를 극복해 봅시다.
- 오류 해결 후 List<BagRamen> 도 추가해 봅시다. 
