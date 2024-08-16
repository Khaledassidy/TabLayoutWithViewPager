package com.example.tablayoutviewpager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TableLayout;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

/*

Application On Fragment metl sho metl Tab Layout,Dialog,Navigation Drawer List,Preferences heye mawjmo3a mn l 2adawet le enta bdefa bel application ta3elak w btest5dema ka code baramaje btnafezlk moheme mo3yane laken hay l sha8let btest5dam bshakl kberr b joz2eyet l fragemnt ya3ne aye sho8le mn haw l 5amse(navigation drawer,dialog,tab layout,list,preferances) le houne ba3d l amsele 3ala l fragemnt 3ashen enta ta3meloun l afdal eno enta testa5dem fehoun l fragement b ma3na tene 3ashen tefham ween badak bel zabt test5dem l fragemnt hay ba3d l joz2eyet le betbe2 mawdo3 l fragment b de5ela la7 nbalesh fehoun:

TabLayout:3ebara 3an toolbar feha navigation drawer le heye l icon le feha 3 sha7tat fo2 ba3d btl3lak ka2eme mn shemel feha button byeje ta7t l tool bar tab layout 3bara 3an majmo3a mn tabs kel tab ela esm bekoun ela icon a7yenan ela backgroud w ela indicator hay kola  mnsameha tablayout le heye tabs 3ala shakl layout bel 3ade aye este5dem la tab layout bekon ma3a she esmo viewpager
tablayout keef btesta5dam:lama ed8at 3ala tab bye3redle l mo7tawa l 5as bel tab heeda ta7to heda tab layout a7yenan ne7na mn 2aleb mna3mel paging bel mouse yamen w yasar bel 2osbo3 mn doun ma ned8at 3ala tab fa mnla7ezz eno nta2al mn tab 1 la tab 2 metl application watsap wa2t tens2ol mn chat la status bel 7a2e2a l tabs hawde 3eara 3an tablayout w le ta7to 3ebara 3an viewpager 2aw2at bekoun 3osnour 8eer tab layout l icons le fo2 bas l fekra le mn7ke 3ana heye nafs azeta eno ya btekbous be8erlak tab 2aw bta3mel swipe b8ayeralk tab

keeef bade est5dem tablayout bel android?
hala2 l activity l tabeed activity be2dar zeda btar2ten:
momken eje ensho2 activity new activity w 2e5tar tabbed activity fa howe law7do berou7 byenshe2le tab w bya3mele l viewpager w byenshe2le l addapter tab3a w yjahzle yeha kemel bas ne7na badna nefham keef mna3mel from scratch

3ana hala2 layout fadye tasmem feha constainet ana bade deef feha jeeb tablayout ne7na metl ma tafa2na 3ana tablayout tool bar tablayout w viewpager fa hala2 7a nrou7 3ala tasmem












 */




//hala2 ba3d ma 5alsna tasmem menro7 mna3mel inflate lal layout





public class MainActivity extends AppCompatActivity{
    TabLayout tableLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableLayout=findViewById(R.id.tablayout);
        viewPager=findViewById(R.id.ViewPager);

        //hala2 ba3d ma 3mlt inflate lal layout sort be2dar tablayout,viewpager be2dar et3emal ma3oun tabe3e tablayout ela 5asa2es fene 8ayeroun metl tabbackgroud fene 8ayer l background taba3 l tablayout fe 3ande tabindecator mo2sher taba3 tab fene 8ayro le beloun l puprple tab gravity fene 8ayera 5aleha 3ala left 2aw 3ala right bel ceneter le bade yeh,fe 3ande tabmode badak teh fixed 2aw scrollable sho ya3ne fixed ya3ne l 3anser le de5el tablayout 7a tkoun sebte w ma7soura bede5el 3ard shshe b ma3na eno a7yenan bekoun 3ande majmo3a mn tabs ktera 10 2aw 20 masln tabs hawde btetjewaz l 3ard taba3 shshe fa hal badak tablayout fixed wala scrollable  fixed ya3ne bado yo7serlak kol tabs b 3ard shshe k2no bya3mloun weight w be5elehoun b 3ard shshe w momken l 20 tab le 3andak fehoun kalemet kbere  fa lama yed8atoun ma3 ba3d ma ybyen kol l kelme 2aw bt5leha scrollable metl l scroll view horizntal fa fe ya3mel scroll yamen w shmel ya3ne yezhro bas 3 w yseer bas l user ya3mel scroll ybyen be2e l 3anser fe kamen 5aseye 3ana kamen esma tabtextcolor bt7adedlak loun nous taba3 l tab feek t8ayro metl ma badak,fe kamen tabselectedtextcolor ya3ne tab bas tkoun 3lyha sho ykoun lawn nous w feeee kteer 5asa2es kamen tabripplecolor l color lama enta ta3mel press 3ala tab m3yan


        //tablayout momken tet3emal ma3 listner le 5asa feha:

        //tablayout.addontabselectedlistner:howe lama l most5dem ya3mel select la tab mo3yan 2aw unselect la tab mo3yan sho badak yseer heek heda bya3mel listner


        //fe 3ande 3 methods:
        //ontabselected:lama l user y7aded tab mo3yan bestd3e onTabSelected  w byeb3tlk tab le tam ta7deda w  feek tef7as eno iza tab l t7adadet iza keen l id taba3a heek 2aw esm taba3a heek rou7 3mele heek
        //ontabunselected:lama ykoun l user m7aded tab w rje3 7adad tab tene fa howe fe3lyan bya3mel select la tenye w bya3mel unselect lal 2ola fa bas yen3aml unselect btestd3a l ontabunselected
        //ontabReselected:law l user da8at 3ala tab mara tenye
        //5alena njareba b toats
       tableLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
           @Override
           public void onTabSelected(TabLayout.Tab tab) {
               Toast.makeText(MainActivity.this, "Selected", Toast.LENGTH_SHORT).show();

           }

           @Override
           public void onTabUnselected(TabLayout.Tab tab) {
               Toast.makeText(MainActivity.this, "unSelected", Toast.LENGTH_SHORT).show();

           }

           @Override
           public void onTabReselected(TabLayout.Tab tab) {
               Toast.makeText(MainActivity.this, "Reselected", Toast.LENGTH_SHORT).show();

           }

       });

       //bel nesbe lal view pager feek ta3mel 3lee listner ta3mel addonpagerchangelistner


        //fa byetla3alak 3 methods bas hala2 mesh 7a yoda7 3ande ela ma 3abe data bel viewpager bade 3abe ba3d shway data b fragemnt w defeha 3ala l viewpager w la7 norbout l tnen ma3 ba3d l viewpager w l tablayout l2no 7aleyan houne 3onsouren menfesleen keef bade erbetoun ma3 ba3d  :
        //onpagescroll:3mel scroll 3ala hayde l page
        //onpageselected:3mel select 3ala hayde l page
        //onpagescrollstatechange:
        // onPageScrollStateChanged:

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                //enta w 3am ta3mel scroll la new page btestd3a 5elel ma enta bta3mel scroll
                Log.d("assidi","onPageScrolled");
            }

            @Override
            public void onPageSelected(int position) {
                //bta3tek l postion le enta 7adadto le enta w2eft 3ando ya3ne ba3d ma 3mlt select la page mo3yane bya3tek l postion ta3ela w btstd3e hay l method ya3ne 3mlt scroll ba3d w2eft 3en page bya3tek l postion ta3et l page le w2eft 3anda
                Log.d("assidi","onPageSelected");

            }

            @Override
            public void onPageScrollStateChanged(int state) {
                // bteshabh l 2ola hay lama tet8ayar l state taba3 l scroll 7alet l scroll fa 7a yraje3lk l 7ale taba3 l scroll
//                state: An integer representing the scroll state:
//                SCROLL_STATE_IDLE: The pager is not scrolling.
//                        SCROLL_STATE_DRAGGING: The user is actively dragging the pager.
//                        SCROLL_STATE_SETTLING: The pager is settling to a final position after being dragged.
                Log.d("assidi","onPageScrollStateChanged");

            }
        });


        //keef bade 2orbot l tablayout bel viewpager houne hala2 3onsouren mnfsleen:
        //tableLayout.setupWithViewPager(viewPager):bhay tare2a k2ne rabatoun ma3 ba3d keef ya3ne rabatoun ma3 ba3d eno ana lama 7adat tab m3yan ra7 7adale l viewpager l mo2eble elo w law ro7t 3mlt swipe 3ala page tenye be7dedle tab l mo2ble 2ela heda l kalem la7 nshofo bel tafsel lama ana 3abe baynet l2no 7aleyan ma fe 3ande bayanet fa hala2 ma fe baynet fa an bade deef fragmnets w bade deef masfoufe feha baynet w 3abe tab bene2an 3ala l masfofe mnla7ez l viewpager sefr ma feha 3anaser ma 7ada 7a yet7arak ma3e iza 3mlt swipe hala2 bade est5dem 3anser w deef adapter w zeed fe l bayanet w 5ale mortabet ma3 tablayout bshakl iza ana 3mlt  da8ta 3ala tab m3yan yrou7 yefta7le  viewpager mo2bel elo ya3ne l fragment l mo2bel elo

        //tableLayout.setupWithViewPager(viewPager);


        //hala2 la 2a3ml tabs dynamic mesh sebten 2awal she 5alene em7e kel tabitem le b2alb l tablayout

        //hala2 l application le 3ande le bade 2a3mlo 3ebra 3an categories drink,food,...etc w kel category befout 3lyha be3roud bl viewpager esm l category w l id fa ana bade 2a3ml hay fa ana le bade 23mlo tablayout badna net3emal ma3o bshakl barmaje
        //2awl sha8le bade 2a3mlo bade 2a3ml class be3ber 3an l category w kel category ela esm w id
        //bade 2a3ml tablayout ma3 viewpager l 3osnour le bel viewpager sho bado ykoun ma byenfa3 ykoun activity lesh l2no ma byenfa3 activity bde5el activity tyeb sho le momken n7oto jowa l viewpager 3ebara 3an fragemnt l viewpager l 3anaser le bede5lo bekoun 3ebara 3an fragments fa bta3ml fragment btene3ered bel moraba3 heda l abyad l viewpager jowet l fragmnet mna3mel tasmem le bade yeh ba3mlo bel fragemnt
        //hala2 ana 3mlt fragment w 5alsto hala2 mesh 3ande tab w kel tab ela viewpager mo2abel ela hala2 ana tablayout le bade 2a3mlha mafroud tkoun mawjoude b masfofe mesh kel 3osnour mawjoud bel masfofe elo fragemnt mo2ble elo sa7 heye fragemnt wa7de sa7e7 laken l baynet le feha mo5talafe ya3ne lama ed8at 3ala l 3osnour l 2awal la7 yeb3at l baynet l 2ola lal fragment,lama ed8at 3ala l 3osnour tene la7 eb3at bayent tab tene lal fragemnt..etc
        //bma 2no kel tab m3yane ela fragemnt bade 2a3ml class 5as feha 3ashen ykoun sho8le mratab bade sameh My_tab heda l class bkel basata bado ykoun fe sha8lten bado ykun fe l category 2aw momken ykoun l string esm l tab String tabName; w fragemnt le howe 3ebra 3an fragemnt le 3mlto ana ya3ne esm tab w l fragemnt le mortbta feha
        //hala2 badna na3mel ahm sha8le mawjoude 3ana w heye 3ebara 3an l addapter l mafroud ana law 3ande lista mn l 3anser l mafroud ana 3ande majmo3a mn tabs majmo3a mn l categories mafroud l majmo3a hay mawjoude b lista sa7 aye she feha lista mafroud esta3mel ma3a addpter law bade 2o3rouda 3ala 3onsour bel user interface
        //bade rou7 2a3ml addpter
        //hala2 5aslt l pager w 5alst l addpter taba3o
        //brou7 best5dmo keef?

        //bjeeb l addpter taba3e w ba3te l getsupportfragemntmanger l2no howe byotlob l fragemnt manager 3ashen ye3red l fragemnt
        PaggerAddpater paggerAddpater=new PaggerAddpater(getSupportFragmentManager());


        //hala2 b2olo adpter.addtab() w bdeef kam tab b7ot l esm l tab w l fragemnt taba3a CategoryFragemnt.newinstace w baa3teha ma3lometa l id w l esm fa hay l ma3lomet 7a ytem ersela lal fragemnt le 7a ten3ered bede5ela w tab name heda l esm le 7a yn3ered 3ala tablayout
        paggerAddpater.AddTab(new My_Tab(new Category(1,"Food"),CategoryFragment.newInstance(1,"Food")));
        paggerAddpater.AddTab(new My_Tab(new Category(2,"Drinks"),CategoryFragment.newInstance(2,"Drinks")));
        paggerAddpater.AddTab(new My_Tab(new Category(3,"Smoke"),CategoryFragment.newInstance(3,"Smoke")));
        paggerAddpater.AddTab(new My_Tab(new Category(4,"others"),CategoryFragment.newInstance(4,"others")));

        //w 2e5er she b2olo la heda l viewpager .set addpter w ba3te l addpter
        viewPager.setAdapter(paggerAddpater);
        //w bterbet tablayout ma3 l viewpager 3ashen ysero ma3 ba3d
        tableLayout.setupWithViewPager(viewPager);

        // fa haal2 7a ye5od l fragemnt w ye3reda ma7ala w ye5od l esm l title taba3 l pager w ye3rdo fo2 bel tablayout


        //bas hala2 ana houn ma st3mlt object l category abadan bas ana fe3lyan houn bel my_tab keen b2emkene esta5dmo badel ma ersel string tabname keen b2emkene est5dem object l category kemel bas ana ma st5dmto 3ashn ma 3a2ed l omor bas hala2 bade est5dmo
        //hala2 bade jareb est5dmo


        //haala2 b ma 2no l viewpager l addpter l tnen deprecated jarbt l newaddpter howe nafs she bas a7san
        //le btefre2 eno bel newaddpter bel viewpager 2 ma mneb3at Fragmnetmangment mneb3at l Activity w heye la7ala bte5od mn l activity la7ala l getsupportFragemntmanager 2aw feek teb3at l fragemnt m7adade bye5od l fragemntmanager taba3 l activity le ma7tot fe heda l fragemnt
        //le a7san l viewpager 2 l2no howe ma bsyev l fragemnt byame3la destroy fa howe a7san bel optimization w bel memory
//        ArrayList<My_Tab> arrayList=new ArrayList<>();
//        NewAddpter newAddpter=new NewAddpter(this,arrayList);
//        arrayList.add(new My_Tab(new Category(1,"Food"),CategoryFragment.newInstance(1,"Food")));
//        arrayList.add(new My_Tab(new Category(2,"shop"),CategoryFragment.newInstance(2,"shop")));
//
//        viewPager.setAdapter(newAddpter);
//        tableLayout.setupWithViewPager(viewPager);

    }


}