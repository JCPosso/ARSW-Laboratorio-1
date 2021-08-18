package edu.eci.arsw.blacklistvalidator;

import edu.eci.arsw.spamkeywordsdatasource.HostBlacklistsDataSourceFacade;

import java.util.LinkedList;

public class ThreadBlackList extends Thread {
    private static final int BLACK_LIST_ALARM_COUNT=5;
    private int a,b,ocurrences;
    private String Host;
    LinkedList<Integer> blackListOcurrences=new LinkedList<>();
    private int checkedListsCount;
    private int ocurrencesCount;
    HostBlacklistsDataSourceFacade skds=HostBlacklistsDataSourceFacade.getInstance();
    public ThreadBlackList(int a , int b, String Host){
        this.a=a;
        this.b=b;
        this.Host=Host;
        this.checkedListsCount=0;
        this.ocurrencesCount=0;
    }
    public void run() {
        for ( int i = a; i < b && ocurrencesCount < BLACK_LIST_ALARM_COUNT; i++ ) {
            checkedListsCount++;
            if ( skds.isInBlackListServer( i, Host ) ) {
                blackListOcurrences.add( i );
                ocurrencesCount++;
            }
        }
    }
    public LinkedList<Integer> getBlackListOcurrences(){
            return blackListOcurrences;
    }
    public  int getOcurrencesCount(){
            return ocurrencesCount;
    }
    public  int getCheckedListsCount(){
        return checkedListsCount;
    }
}