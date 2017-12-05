///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package neo4jPackage;
//
////import org.neo4j.driver.v1.AuthTokens;
////import org.neo4j.driver.v1.Driver;
////import org.neo4j.driver.v1.GraphDatabase;
////import org.neo4j.driver.v1.Session;
////import org.neo4j.driver.v1.StatementResult;
////import org.neo4j.driver.v1.Transaction;
//import org.neo4j.driver.v1.*;
////import org.neo4j.driver.v1.TransactionWork;
//
///**
// *
// * @author yemei
// */
//   public class HelloWorldExample implements AutoCloseable
//{
//    private final Driver driver;
//
//    public HelloWorldExample( String uri, String user, String password )
//    {
//        driver = GraphDatabase.driver( uri, AuthTokens.basic( user, password ) );
//    }
//
//    @Override
//    public void close() throws Exception
//    {
//        driver.close();
//    }
//
//public void printGreeting( final String message )
//    {
//        try ( Session session = driver.session() )
//        {
//            String greeting = session.writeTransaction(new TransactionWork<String>()
//            {
////                @Override
//                public String execute( Transaction tx )
//                {
//                    StatementResult result = tx.run( "CREATE (a:Greeting) " +
//                                                     "SET a.message = $message " +
//                                                     "RETURN a.message + ', from node ' + id(a)",
//                            parameters( "message", message ) );
//                    return result.single().get( 0 ).asString();
//                }
//            } );
//            System.out.println( greeting );
//        }
//    }
//
//    public static void main( String... args ) throws Exception
//    {
//        try ( HelloWorldExample greeter = new HelloWorldExample( "bolt://localhost:7687", "neo4j", "password" ) )
//        {
//            greeter.printGreeting( "hello, world" );
//        }
//    }
//}