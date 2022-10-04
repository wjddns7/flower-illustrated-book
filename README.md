# 꽃 도감

## 1. 제작 시간
* 약 2시간
<br/>

## 2. 사용 기술
* Android Studio
<br/>

## 3. 핵심 기능
* 꽃 사진 클릭 시 정보 제공
* scroll 기능
<br/>

## 4. 주요 코드
### 꽃 선택
```
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    public void cosmos(View view){
        Intent intent = new Intent(getApplicationContext(),cosmos.class);
        startActivity(intent);
        finish();
    }
    public void daisy(View view){
        Intent intent = new Intent(getApplicationContext(),daisy.class);
        startActivity(intent);
        finish();
    }
    public void sunflower(View view){
        Intent intent = new Intent(getApplicationContext(),sunflower.class);
        startActivity(intent);
        finish();
    }
    public void mistflower(View view){
        Intent intent = new Intent(getApplicationContext(),mistflower.class);
        startActivity(intent);
        finish();
    }
}
```
### scroll창 정보 표시
```
<TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="@dimen/text_margin"
        android:text="1. 개요\n
안개꽃은 석죽과에 속하는 한해살이풀이다.

원산지는 캅카스 등 아시아 등지이고 약 30~40cm까지 자란다.

많은 잔가지에 피어있는 작은 송이의 꽃들이 안개가 내려앉은 듯 하다 하여 안개꽃이라는 이름이 붙여졌다.

멀리서 보면 눈이 내려앉은 것 같아보이고 가까이서 보면 송이송이의 꽃들이 꽤 귀여워 주로 관상용으로 자주 쓰이고 빼어난 비주얼으로 선물용으로도 쓰인다.

꽃말은 흰색 안개꽃은 죽음, 맑은 마음, 깨끗한 마음, 사랑의 성공, 간절한 기쁨, 밝은 마음, 약속, 슬픔(기사), 자주색 안개꽃은 깨끗한 마음, 빨간색 안개꽃은 기쁨의 순간, 분홍색 안개꽃은 하얀색 안개꽃과 빨간 장미의 조합과 비슷하게 죽을 만큼 사랑합니다, 파란색 안개꽃은 영원한 사랑, 노란색 안개꽃은 성공, 성취이다. 흰색 안개꽃의 꽃말 중 죽음과 슬픔이 조금 섬뜩하게 느껴질 수도 있는데 흰색 안개꽃과 장미를 같이 선물하면 '죽을 때까지 사랑해'라는 꽤 로맨틱한 꽃말이 탄생한다.

안개꽃에 대한 전설이 하나 있는데 한 해군 장교와 제니라는 여자 사이의 사랑 이야기이다. 한 해군 장교와 제니는 서로 사랑하는 사이였다. 하지만 전쟁이 나서 해군 장교는 전쟁에 나가게 됐는데 제니가 아무리 기다려도 그 해군 장교는 돌아오지 않았다. 점점 해군 장교가 죽었다는 소문이 퍼지게 되자 평소 제니를 눈여겨 보던 한 부잣집 아들이 제니에게 청혼을 하지만 제니는 거절한다. 이에 앙심을 품은 부잣집 아들은 제니가 자기와 결혼한다는 헛소문을 퍼뜨리는데 그때 죽은 줄만 알았던 해군 장교가 돌아온다. 부잣집 아들은 병사들을 고용해 해군 장교를 죽이려하고 제니는 해군 장교를 죽이지 말아달라며 부잣집 아들에게 애원한다. 부잣집 아들은 해군 장교를 집에 보내주겠다고 했지만 이내 다시 죽이려고 했고 제니는 이를 막기위해 신께 기도를 드린다. 제니가 열심히 기도하자 안개가 나타나 부잣집 아들을 감싸는데 부잣집 아들은 안개를 벗어나려고 하다가 자기 칼에 찔려 죽고 만다. 그리고 안개가 없어지자 해군 장교와 제니 주변에 안개꽃이 피어있었다고 한다.\n\n
2. 언어별 명칭\n
한국어:안개꽃\n
러시아어:качим(카침), гипсолюбка, гипсофила\n
스페인어:gipsófila\n
영어:babies' breath, babe's breath, gypsophila\n
이탈리아어:fiori di nebbia, Elegans Gypsophila\n
일본어:霞草かすみそう\n
중국어:霞草xiácǎo, 丝石竹sīshízhú, 满天星măntiānxīng\n
포르투갈어:mosquitinhos\n
프랑스어:gypsophile élégant, gypsophila elegans\n
학명 중 Gypsophila(깁소필라)의 어원은 그리스어의 gypsos(석회)와 philein(좋아한다)의 합성어로 석회질 토양에서 잘 자라기 때문에 이렇게 이름이 붙여졌다."\
/>
```
## 5.실행 화면
* 시작 화면<br/>![image](https://user-images.githubusercontent.com/108790183/193715522-2c0e5236-f85f-4bd4-9d75-a9309347da67.png)
* 꽃 종류<br/>![image](https://user-images.githubusercontent.com/108790183/193715550-baf9430f-9643-44c1-9b39-25685e511e2a.png)
* 설명 화면<br/>![image](https://user-images.githubusercontent.com/108790183/193715615-a0bb40d9-1ce5-42d9-9766-16eeef314f50.png)

