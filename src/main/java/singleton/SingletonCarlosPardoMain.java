package singleton;



public class SingletonCarlosPardoMain {
    public static void main(String[] args){
        MySqlClientCarlosPardo mySqlClient = MySqlClientCarlosPardo.getClient();
        mySqlClient.getData();
        MySqlClientCarlosPardo mySqlClient2 = MySqlClientCarlosPardo.getClient();
        mySqlClient2.getData();



    }
}
