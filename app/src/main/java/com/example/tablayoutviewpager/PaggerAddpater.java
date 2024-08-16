package com.example.tablayoutviewpager;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

//ba3mel addpater esmo pagger l addpter heda l addpter bekoun lal viewpager mesh lal tab   ana berbout l tab   bel viewpager
//heda l addpter bekoun extends ne7na a5dna kaza nou3 mn l addpter base addpter,arraylistaddpter,recycleaddpter a5dna kteer anwa3 nou3 l adpter le 5as bel viewpager esmo:
//FragmentStatePagerAdapter 2aw FragmentPagerAdapter
//FragmentStatePagerAdapter:m5asas la yet3emal ma3 pages ktera 2aw ma3 tabs ktera law 3ande tabs generic bteje mn database 20,30,100 m5asas heda l adpter yet3emal ma3ha lesh l2no fe3lyan kel ma 2edmet l tab btl2eha la7alo shela mn zekra ma bedal me7tefez feha
//FragmentPagerAdapter:m5asa5 bel pager le 3adada 2alel
//bas both depricated
//byejbrak ta3mel immplement lal methods wa7de esma getitem,getcount
//hala2 bado mene constructor le howe 3ebara 3am constructor byesta2bel l fragemnt manger
//hala2 heek l adpter sar jehez bas bado sho8l menak
//aye addpter mesh kena neb3tlo l arraylist l 3anser lezem ye3reda fe sa7
//b3ref arraylist mno3 sho category,string,... la2 meno3 My_Tab le 3mlneha  lesh mno3 My_Tab?
//l2no ana fe3lyan heda l addpter bade est5dmo lal tabet 7a ykoun mortabet ma3 tablayout ma3 l viewpager fa fe3lyan kel tab elha esm w ela fragemnt fa bade esta3mel l 5asa2es l mawjoude bel My_Tab class le feha esm tab w l fragment momken teb3ata 3an tare2 l constructor 2aw ta3mel method lal edafe 3al jehten sa7 fa ne7na badna nawe3 ba3mel intilize lal arraylist w ba3mel method public void addtab() w joweta ba3mel w beb3tla lal function My_tab rou7 defle yeha 3ala l arraylist tare2a tenye badel ma ersel l arryalist kemle ro7t method lal edafe w ba2laba kel mara bade deef feha w law badak teb3ata lal contsructor kamen sa7
//hala2 ba3d ma 3mlt heek ftered eno l masfofe 3ande jehze feha tabs w kolo tmm sho bade 2a3mel:
//3ande method moheme esma getitem nafs fekret l getview kel ma t7aded tab berou7 byestd3e l method l getitem btrje3lak fragemnt 3ashen te3reda jowa l viewpager
//tabet l mawjoude 3ande mafroud kol tab mertebta b fragemnt sa7 fa kel ma ekbous 3ala tab mn tabet bado ye3redle l fragemnt l 5asa feha fa fe3layn l get item btrje3le l fragemnt 7asab l postion le enta fe fa enta bekl basata bt2olo:
//l arraylist le esma tabs dot get(postion) byerj3lak tab kemle dpt getfragemnt btrj3lk fragemnt ta3et tab le enta feha fa btrjd3lk l fragemnt le enta fe3lyan we2ef 3anda bel postion heda law kenet bel tab 3 7a yraj3lk l fragemnt ta3et tab telte
//fe method a7la mena 5asa bel toolbar esma getpage title hayde btrj3lk l esm ta3et kel tab  tab.get(postion).getname
//fa heda l addpter 7a est5dmo ana ma3 l pager le howe assesan mortabet ma3 tab fa l getitem btrj3le l fragemnt le la7 tene3ered houn w l gettitlepager btrj3le l esm le 7a ne3ered fo2 bel tablayout bel tab fa kel esm 7a yen3ered bo2blo esm bel tablayout
//w e5er she size braje3  size taba3 l arraylist

//first in addpter bta3mel addpter w bta3te lal adpter l fragmnet mager getsupportfragemntmanager bta3mel return la fragemntmanager that responsible for manage fragment in the activity bte5oda l super consturctor la ya3mel tranaction w add w delete la fragemnt le b2alab l viewpager
//ba3den bta3mel call lal getcount return number of pages(Fragemnt) le bada ten3aml display 3ala l viewpager
//ba3den bta3mel call l getitem bta3mel return lal kel fragemnt 7asab l potion l enta bta3te yeha le bada yen3amala dispaly b kel screen 7asab l postion w bya3mela
//l adapter bte5od hay l fragemnt 3al fragmnet manger w btefta7 transaction w bedefa 3ala l screen
//w kel mara bta3mel feha swipe byen3amal call lal getitem 3ashen yen3amal return lal fragment w te5oda l framnent manager w ta3mela transaction
//hala2 bas ta3mel swipe iza kent 3am text3mel l fragemntstatepager addpter heye bta3mel manage la 3adad kbeer mn l pages so bel destroy item l fragemnt on pause on stop on destroy view on deetach btedamar l fragemnt   ama fragemntpageraddpter 7a yen3amal btetsyv bel back stack bas iza keen 7tej l user la memory momken ya3mel desrtoy lal fragemnt
//ba3den byen3amal call lala getpagetitle bta3mel return lal title for each page fa enta bas ta3mel method men manin activity   tableLayout.setupWithViewPager(viewPager); ka2nak 3am t2olo eno5alek ya table layout 5alek 3emel link ma3 l viewpager ma3 l adpter tablayout listen lal page change ta3et l viewpager w bya3mel update la selected tabtitle l viewpager bya3mel call lal gettitle berje3 title tablayout bas t7otolo link bayno w been l viewpager sa3eta bye5od heda ttitle w b7eto 3ala l itemtablayout ya3ne heda title byerja3 lal viewpager bas l viewpager ma byest3mlo bya3te lal tabayout b2este5dem tabalyout.setupwithviewpager(Viewpager) hay l method connect tablayout ma3 l viewpager tabalyout bya3mel quries 3al adpter for the title of each page calling getpagetitle internally ba3de  title set as label la kel tab bel atablayout w kel ma na3mel swipe tablayout bya3mel listen lala page change w automatically update the selected tab and display correct title from getpagetitle


public class PaggerAddpater extends FragmentPagerAdapter {

    ArrayList<My_Tab> tabs=new ArrayList<>();

    public PaggerAddpater(@NonNull FragmentManager fm) {
        super(fm);
    }

    public void AddTab(My_Tab tab){

        tabs.add(tab);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        return tabs.get(position).fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getCategory().getName();
    }

    @Override
    public int getCount() {
        return tabs.size();
    }
}
