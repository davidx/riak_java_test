import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.bucket.Bucket;
import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.RiakFactory;
import com.basho.riak.client.RiakException;


public class RiakJavaTest
 {
     public static void main(String[] args) throws RiakException
     {

     	 System.out.println ("beginning test");
         String myData = "This is my data";
         IRiakClient riakClient = RiakFactory.httpClient();
         Bucket myBucket = riakClient.fetchBucket("TestBucket").execute();
         myBucket.store("TestKey", myData).execute();
         riakClient.shutdown();
     }
 }

