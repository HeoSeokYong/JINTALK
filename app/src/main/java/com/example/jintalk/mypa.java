package com.example.jintalk;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import static com.example.jintalk.person.c;
import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class mypa extends AppCompatActivity {

    public Button cancelBtn;
    private TextView tv_id, tv_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypa);

        tv_id = findViewById(R.id.tv_id);
        tv_pass = findViewById(R.id.tv_pass);
        cancelBtn = findViewById(R.id.cancelBtn);

        Intent intent = getIntent();
        String userID = intent.getStringExtra("userID");
        String userPass = intent.getStringExtra("userPass");

        tv_id.setText(userID);
        tv_pass.setText(userPass);
        int k=c;                //정수형 변수 k값 할당

        if(k == 1111){
            ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);       //k값에 따른 이미지 세팅
            imageView01.setImageResource(R.drawable.image_sample1);
            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText("INTJ 용의주도한 전략가”\n" +
                    "윗자리에 있는 사람은 고독한 법, 전략적 사고에 뛰어나며 매우 극소수인 건축가형 사람은 이를 누구보다 뼈저리게 이해합니다. 전체 인구의 2%에 해당하는 이들은 유독 여성에게서는 더욱 찾아보기 힘든 유형으로, 인구의 단 0.8%를 차지합니다. 체스를 두는 듯한 정확하고 계산된 움직임과 풍부한 지식을 소유하고 있는 이들은 그들과 견줄 만한 비슷한 부류의 사람을 찾는 데 종종 어려움을 겪습니다. 건축가형 사람은 상상력이 풍부하면서도 결단력이 있으며, 야망이 있지만 대외적으로 표현하지 않으며, 놀랄 만큼 호기심이 많지만 쓸데없는 데 에너지를 낭비하는 법이 없습니다.\n");

        }

        else if(k == 1112){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01)
                ;imageView01.setImageResource(R.drawable.image_sample2);

            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText("INTP “논리적인 사색가”\n" +
                    "과거에서 배우되, 현재에 살며, 미래에 대한 희망을 가지세요. 그리고 중요한 것은 질문하는 일을 멈추지 않는 것입니다.\n" +
                    "사색가형은 전체 인구의 3% 정도를 차지하는 꽤 흔치 않은 성격 유형으로, 이는 그들 자신도 매우 반기는 일입니다. 왜냐하면, 사색가형 사람보다 '평범함'을 거부하는 이들이 또 없기 때문입니다. 이 유형의 사람은 그들이 가진 독창성과 창의력, 그리고 그들만의 독특한 관점과 왕성한 지적 호기심에 나름의 자부심을 가지고 있습니다. 보통 철학자나 사색가, 혹은 몽상에 빠진 천재 교수로도 많이 알려진 이들은 역사적으로 수많은 과학적 발전을 이끌어 내기도 하였습니다.\n");

        }

        else if(k == 1121){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01)
                ;imageView01.setImageResource(R.drawable.image_sample3);
            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText(" INFJ “선의의 옹호자”\n" +
                    "선의의 옹호자형은 가장 흔치 않은 성격 유형으로 인구의 채 1%도 되지 않습니다. 그럼에도 불구하고 나름의 고유 성향으로 세상에서 그들만의 입지를 확고히 다집니다. 이들 안에는 깊이 내재한 이상향이나 도덕적 관념이 자리하고 있는데, 다른 외교형 사람과 다른 점은 이들은 단호함과 결단력이 있다는 것입니다. 바라는 이상향을 꿈꾸는데 절대 게으름 피우는 법이 없으며, 목적을 달성하고 지속적으로 긍정적인 영향을 미치고자 구체적으로 계획을 세워 이행해 나갑니다.\n");

        }

        else if(k == 1122){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01)
                ;imageView01.setImageResource(R.drawable.image_sample4);
            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText("INFP “열정적인 중재자”\n" +
                    "중재자형 사람은 최악의 상황이나 악한 사람에게서도 좋은 면만을 바라보며 긍정적이고 더 나은 상황을 만들고자 노력하는 진정한 이상주의자입니다. 간혹 침착하고 내성적이며 심지어는 수줍음이 많은 사람처럼 비추어지기도 하지만, 이들 안에는 불만 지피면 활활 타오를 수 있는 열정의 불꽃이 숨어있습니다. 인구의 대략 4%를 차지하는 이들은 간혹 사람들의 오해를 사기도 하지만, 일단 마음이 맞는 사람을 만나면 이들 안에 내재한 충만한 즐거움과 넘치는 영감을 경험할 수 있을 것입니다.\n");

        }

        else if(k == 1211){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01)
                ; imageView01.setImageResource(R.drawable.image_sample5);
            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText("ISTJ “청렴결백한 논리주의자”\n" +
                    "내가 본 바에 의하면 임무를 수행함에 있어 한 명이면 족한 일을 둘이서 수행하면 될 일도 안되거니와, 셋 이상이 하는 경우에는 일이 전혀 성사되지 않더군. -GEORGE WASHINGTON \n" +
                    "논리주의자형은 가장 다수의 사람이 속하는 성격 유형으로 인구의 대략 13%를 차지합니다. 청렴결백하면서도 실용적인 논리력과 헌신적으로 임무를 수행하는 성격으로 묘사되기도 하는 이들은, 가정 내에서뿐 아니라 법률 회사나 법 규제 기관 혹은 군대와 같이 전통이나 질서를 중시하는 조직에서 핵심 구성원 역할을 합니다. 이 유형의 사람은 자신이 맡은 바 책임을 다하며 그들이 하는 일에 큰 자부심을 가지고 있습니다. 또한, 목표를 달성하기 위해 시간과 에너지를 허투루 쓰지 않으며, 이에 필요한 업무를 정확하고 신중하게 처리합니다.\n");

        }

        else if(k == 1212){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
            imageView01.setImageResource(R.drawable.image_sample6);

            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText(" ISTP “만능 재주꾼”\n" +
                    "저는 그런 삶을 살고 싶었습니다. 무언가 다른 삶 말이지요. 매일 같은 곳을 가고, 같은 사람을 만나고, 매번 같은 일을 하며 살고 싶지 않았습니다. 전 흥미로운 도전을 원했습니다.\n" +
                    "\n" +
                    "HARRISON FORD\n" +
                    "냉철한 이성주의적 성향과 왕성한 호기심을 가진 만능재주꾼형 사람은 직접 손으로 만지고 눈으로 보면서 주변 세상을 탐색하는 것을 좋아합니다. 무엇을 만드는 데 타고난 재능을 가진 이들은 하나가 완성되면 또 다른 과제로 옮겨 다니는 등 실생활에 유용하면서도 자질구레한 것들을 취미 삼아 만드는 것을 좋아하는데, 그러면서 새로운 기술을 하나하나 터득해 나갑니다. 종종 기술자나 엔지니어이기도 한 이들에게 있어 소매를 걷어붙이고 작업에 뛰어들어 직접 분해하고 조립할 때보다 세상에 즐거운 일이 또 없을 것입니다. 전보다 조금은 더 향상된 모습으로요.\n");

        }

        else if(k == 1221){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
            imageView01.setImageResource(R.drawable.image_sample7);

            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText("ISFJ “용감한 수호자”\n" +
                    "사랑은 나눌수록 커집니다. 다른 이에게 나누어 주면 줄수록 당신에게 돌아오는 사랑 또한 더욱 커집니다.\n\n" +
                    "BRIAN TRACY\n" +
                    "수호자형 사람은 꽤 독특한 특징을 가지고 있는데, 이 유형에 속하는 사람은 이들을 정의하는 성격 특성에 꼭 들어맞지 않는다는 점입니다. 타인을 향한 연민이나 동정심이 있으면서도 가족이나 친구를 보호해야 할 때는 가차 없는 모습을 보이기도 합니다. 조용하고 내성적인 반면 관계술에 뛰어나 인간관계를 잘 만들어갑니다. 안정적인 삶을 지향하지만 이들이 이해받고 존경받는다고 생각되는 한에서는 변화를 잘 수용합니다. 이처럼 수호자형 사람은 한마디로 정의 내리기 힘든 다양한 성향을 내포하고 있는데, 이는 오히려 그들의 장점을 승화시켜 그들 자신을 더욱 돋보이게 합니다.\n");

        }

        else if(k == 1222){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
            imageView01.setImageResource(R.drawable.image_sample8);
            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText("ISFP “호기심 많은 예술가”\n" +
                    "저는 하루 동안에도 변화를 거듭합니다. 아침에 눈을 뜨면 한 사람이 있습니다. 그리고 잠을 청하러 갈 때면 저는 확신합니다. 거기엔 또 다른 제 자신이 있다는 것을 말이죠.\n" +
                    "\n" +
                    "BOB DYLAN\n" +
                    "모험가형 사람은 일반적으로 사람들이 생각하듯 야외에서 앙증맞은 나무 그림을 그리고 있는 그런 유형의 예술가는 아니지만, 진정한 예술가라고 할 수 있습니다. 실상 상당수 많은 이들이 그러한 능력을 충분히 갖추고 있기도 합니다. 이들은 그들의 심미안이나 디자인 감각, 심지어는 그들의 선택이나 행위를 통하여 사회적 관습이라는 한계를 뛰어넘고자 합니다. 실험적인 아름다움이나 행위를 통해 전통적으로 기대되는 행동양식이나 관습에 도전장을 내미는 이들은 \"저를 가두어두려 하지 마세요!\"라고 수없이 외칩니다.\n");

        }

        else if(k == 2111){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
            imageView01.setImageResource(R.drawable.image_sample9);
            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText("ENTJ “대담한 통솔자”\n" +
                    "당신에게 주어진 시간은 한정되어 있습니다. 그러니 다른 이의 삶을 사느라 시간을 낭비하지 마세요. 다른 사람의 생각에서 빚어진 삶에 방식에 맞추는 함정에 빠지지 마세요. 다른 사람들이 내는 의견이나 생각이 당신의 목소리에 귀 기울이는 것을 방해하는 소음이 되지 않게 하세요. 그리고 무엇보다 중요한 것은, 당신의 마음과 직관을 굳건히 믿고 따라갈 수 있는 용기를 가지는 것입니다. 이야말로 당신이 진정으로 원하는 것이 무엇인지 정확히 알고 있기 때문입니다. 그 외 다른 것은 모두 부차적일 뿐입니다.\n" +
                    "\n" +
                    "STEVE JOBS\n" +
                    "통솔자형 사람은 천성적으로 타고난 리더입니다. 이 유형에 속하는 사람은 넘치는 카리스마와 자신감으로 공통의 목표 실현을 위해 다른 이들을 이끌고 진두지휘합니다. 예민한 성격의 사회운동가형 사람과 달리 이들은 진취적인 생각과 결정력, 그리고 냉철한 판단력으로 그들이 세운 목표 달성을 위해 가끔은 무모하리만치 이성적 사고를 하는 것이 특징입니다. 이들이 인구의 단 3%에 지나지 않는 것이 어쩌면 다행일 수도 있습니다. 그렇지 않으면 인구 대다수를 차지하는 소심하고 섬세한 성향의 사람들이 모두 주눅 들어 살지도 모르니까요. 단, 평소 잊고 살기는 하나 우리 삶을 윤택하게 해주는 위대한 사업가나 기관을 이끄는 통솔자형 사람들이 있음에 다행이기도 합니다.\n");

        }

        else if(k == 2112){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
            imageView01.setImageResource(R.drawable.image_sample10);
            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText("ENTP “뜨거운 논쟁을 즐기는 변론가”\n" +
                    "가시밭길이더라도 자주적 사고를 하는 이의 길을 가십시오. 비판과 논란에 맞서서 당신의 생각을 당당히 밝히십시오. 당신의 마음이 시키는 대로 하십시오. '별난 사람'이라고 낙인찍히는 것보다 순종이라는 오명에 무릎 꿇는 것을 더 두려워하십시오. 당신이 중요하다고 생각하는 이념을 위해서라면 온 힘을 다해 싸우십시오.\n" +
                    "\n" +
                    "THOMAS J. WATSON\n" +
                    "변론가형 사람은 타인이 믿는 이념이나 논쟁에 반향을 일으킴으로써 군중을 선동하는 일명 선의의 비판자입니다. 결단력 있는 성격 유형이 논쟁 안에 깊이 내재한 숨은 의미나 상대의 전략적 목표를 꼬집기 위해 논쟁을 벌인다고 한다면, 변론가형 사람은 단순히 재미를 이유로 비판을 일삼습니다. 아마도 이들보다 논쟁이나 정신적 고문을 즐기는 성격 유형은 없을 것입니다. 이는 천부적으로 재치 있는 입담과 풍부한 지식을 통해 논쟁의 중심에 있는 사안과 관련한 그들의 이념을 증명해 보일 수 있기 때문입니다.\n");

        }

        else if(k == 2121){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
            imageView01.setImageResource(R.drawable.image_sample11);
            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText("2121: ENFJ “정의로운 사회운동가”\n" +
                    "당신이 현재하는 사소한 행위는 잔잔한 물결처럼 서서히 퍼져나가 모든 이에게 영향을 줍니다. 당신의 마음가짐이 다른 이의 가슴에 불을 지필 수도, 근심을 초래할 수도 있습니다. 당신의 숨소리가 사랑의 빛을 뿜어낼 수도, 우울함으로 온 방안을 어둡게 만들 수도 있습니다. 당신의 시선이 즐거움을 선사할 수도 있으며, 당신의 언어가 자유를 향한 열망을 독려할 수도 있습니다. 당신의 행동 하나하나가 다른 이들의 생각과 마음을 열 수 있습니다.\n" +
                    "\n" +
                    "DAVID DEIDA\n" +
                    "사회운동가형 사람은 카리스마와 충만한 열정을 지닌 타고난 리더형입니다. 인구의 대략 2%가 이 유형에 속하며, 정치가나 코치 혹은 교사와 같은 직군에서 흔히 볼 수 있습니다. 이들은 다른 이들로 하여금 그들의 꿈을 이루며, 선한 일을 통하여 세상에 빛과 소금이 될 수 있도록 사람들을 독려합니다. 또한, 자신뿐 아니라 더 나아가 살기 좋은 공동체를 만들기 위해 사람들을 동참시키고 이끄는 데에서 큰 자부심과 행복을 느낍니다.\n");

        }

        else if(k == 2122){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
            imageView01.setImageResource(R.drawable.image_sample12);
            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText(" ENFP “재기발랄한 활동가”\n" +
                    "당신이 생계를 위해 무슨 일을 하는지, 저는 관심 없습니다. 다만 제가 알고 싶은 건 당신이 가슴 저리게 동경하는 것이 있는지, 당신 마음속 깊은 바람을 감히 충족시키고자 하는 열망이 있는지입니다. 당신의 나이가 얼마인지는 중요하지 않습니다. 당신이 사랑을 위해, 당신의 꿈을 위해, 그리고 삶이라는 모험을 위해 기꺼이 바보가 될 준비가 되어 있는지, 그것이 궁금할 뿐입니다.\n" +
                    "\n" +
                    "ORIAH MOUNTAIN DREAMER\n" +
                    "활동가형 사람은 자유로운 사고의 소유자입니다. 종종 분위기 메이커 역할을 하기도 하는 이들은 단순한 인생의 즐거움이나 그때그때 상황에서 주는 일시적인 만족이 아닌 타인과 사회적, 정서적으로 깊은 유대 관계를 맺음으로써 행복을 느낍니다. 매력적이며 독립적인 성격으로 활발하면서도 인정이 많은 이들은 인구의 대략 7%에 속하며, 어느 모임을 가든 어렵지 않게 만날 수 있습니다.\n");

        }

        else if(k == 2211){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
            imageView01.setImageResource(R.drawable.image_sample13);
            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText("ESTJ “엄격한 관리자”\n" +
                    "훌륭한 질서는 모든 것의 기초이다.\n" +
                    "\n" +
                    "EDMUND BURKE\n" +
                    "관리자형 사람은 그들 생각에 반추하여 무엇이 옳고 그른지를 따져 사회나 가족을 하나로 단결시키기 위해 사회적으로 받아들여지는 통념이나 전통 등 필요한 질서를 정립하는 데 이바지하는 대표적인 유형입니다. 정직하고 헌신적이며 위풍당당한 이들은 비록 험난한 가시밭길이라도 조언을 통하여 그들이 옳다고 생각하는 길로 사람들을 인도합니다. 군중을 단결시키는 데에 일가견이 있기도 한 이들은 종종 사회에서 지역사회조직가와 같은 임무를 수행하며, 지역 사회 발전을 위한 축제나 행사에서부터 가족이나 사회를 하나로 결집하기 위한 사회 운동을 펼치는 데 사람들을 모으는 역할을 하기도 합니다.\n");

        }

        else if(k == 2212){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
            imageView01.setImageResource(R.drawable.image_sample14);
            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText(" ESTP “모험을 즐기는 사업가”\n" +
                    "인생은 과감한 모험이거나, 아니면 아무것도 아니다.\n" +
                    "\n" +
                    "HELEN KELLER\n" +
                    "주변에 지대한 영향을 주는 사업가형 사람은 여러 사람이 모인 행사에서 이 자리 저 자리 휙휙 옮겨 다니는 무리 중에서 어렵지 않게 찾아볼 수 있습니다. 직설적이면서도 친근한 농담으로 주변 사람을 웃게 만드는 이들은 주변의 이목을 끄는 것을 좋아합니다. 만일 관객 중 무대에 올라올 사람을 호명하는 경우, 이들은 제일 먼저 자발적으로 손을 들거나 아니면 쑥스러워하는 친구를 대신하여 망설임 없이 무대에 올라서기도 합니다.\n" +
                    "\n" +
                    "국제사회 이슈나 이와 관련한 복잡하고 난해한 이론과 관련한 담화는 이들의 관심을 오래 붙잡아 두지 못합니다. 사업가형 사람은 넘치는 에너지와 어느 정도의 지식으로 대화에 무리 없이 참여하기는 하나, 이들이 더 역점을 두는 것은 앉아서 말로만 하는 논의가 아닌 직접 나가 몸으로 부딪히는 것입니다. 행동이 먼저 앞서기도 하는 이들은 이로 인해 가끔 실수를 범하기도 하지만 이들은 단순히 턱 괴고 앉아 지켜만 보고 있느니 만약의 사태를 대비해 만반의 준비를 한 뒤라면 직접 나가 몸으로 부딪혀 문제를 해결해 나가는 것을 선호합니다.\n");

        }

        else if(k == 2221){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
            imageView01.setImageResource(R.drawable.image_sample15);
            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText("ESFJ “사교적인 외교관”\n" +
                    "서로 용기를 북돋아 주고 치켜세우며 힘이 돼주세요. 한 사람이 받은 긍정의 에너지가 곧 모든 이에게 전달될 테니까요.\n" +
                    "\n" +
                    "DEBORAH DAY\n" +
                    "사교형 사람을 한마디로 정의 내리기는 어렵지만, 간단히 표현하자면 이들은 '인기쟁이'입니다. 인구의 대략 12%를 차지하는 꽤 보편적인 성격 유형으로, 이를 미루어 보면 왜 이 유형의 사람이 인기가 많은지 이해가 갑니다. 종종 고등학교에서 치어리더나 풋볼의 쿼터백으로 활동하기도 하는 이들은 분위기를 좌지우지하며 여러 사람의 스포트라이트를 받거나 학교에 승리와 명예를 불러오도록 팀을 이끄는 역할을 하기도 합니다. 이들은 또한 훗날 다양한 사교 모임이나 어울림을 통해 주위 사람들에게 끊임없는 관심과 애정을 보임으로써 다른 이들을 행복하고 즐겁게 해주고자 노력합니다.\n");

        }

        else if(k == 2222){ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
            imageView01.setImageResource(R.drawable.image_sample16);
            TextView textView_01=(TextView) findViewById(R.id.textView_01);
            textView_01.setText(" ESFP “자유로운 영혼의 연예인”\n" +
                    "저는 이기적이고 참을성도 없을 뿐 아니라, 약간의 열등감도 가지고 있어요. 실수투성이에 천방지축이고, 때때로 통제가 안되기도 하지요. 만일 이런 제가 감당이 안 되는 당신이라면 완벽한 모습일 때의 저와 함께할 자격 또한 없어요.\n" +
                    "\n" +
                    "MARILYN MONROE\n" +
                    "갑자기 흥얼거리며 즉흥적으로 춤을 추기 시작하는 누군가가 있다면 이는 연예인형의 사람일 가능성이 큽니다. 이들은 순간의 흥분되는 감정이나 상황에 쉽게 빠져들며, 주위 사람들 역시 그런 느낌을 만끽하기를 원합니다. 다른 이들을 위로하고 용기를 북돋아 주는 데 이들보다 더 많은 시간과 에너지를 소비하는 사람 없을 겁니다. 더욱이나 다른 유형의 사람과는 비교도 안 될 만큼 거부할 수 없는 매력으로 말이죠.\n");

        }
        else {
            ImageView imageView01 = (ImageView) findViewById(R.id.imageView01);
            imageView01.setImageResource(R.drawable.image_sample1);
        }
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outIntent = getIntent();
                setResult(RESULT_CANCELED, outIntent);
                finish();
            }
        });


    }

}
