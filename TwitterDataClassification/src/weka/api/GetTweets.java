package weka.api;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author RAKESH RAY
 */
public class GetTweets
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws TwitterException, FileNotFoundException 
    {
        // TODO code application logic here
        ConfigurationBuilder cb = new ConfigurationBuilder();
        
        cb.setDebugEnabled(true)
                .setOAuthConsumerKey("mVYxzZXgQj0EK1Nmi6oDvQBeA")
                .setOAuthConsumerSecret("JnfkDQ92WFf6f7tilmk8Si7xNAg6asDxG2GTkpdoTjvWKu3tTs")
                .setOAuthAccessToken("3260598354-pfr6n7PH8uHm9JryQalQuDbLUWLmOBSUZaib0de")
                .setOAuthAccessTokenSecret("pogTycxgDCNSboZChUUwElE4Oj37pr7x7QmoZDtJLv0eA");
        System.out.println("Fetching Tweets.............");
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter twitter =(Twitter) tf.getInstance();
        
        File file = new File("Tweet.txt"); //Your file
        FileOutputStream fos = new FileOutputStream(file);
        PrintStream ps = new PrintStream(fos);
        System.setOut(ps);

         try {
            Query query = new Query("EngineeringProblems");
            QueryResult result;
            
            do {
            	result = twitter.search(query);
                
                List<Status> tweets = result.getTweets();
                for (Status tweet : tweets) {
                    System.out.println(tweet.getText());
                }
            } while ((query = result.nextQuery()) != null);
            System.exit(0);
        } catch (TwitterException te) {
            te.printStackTrace();
            System.out.println("Failed to search tweets: " + te.getMessage());
            System.exit(-1);
        }
    }
  }
