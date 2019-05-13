package examples.bugdetective;
public class ClassCast
{
    void callingMethod()
    {
        String sValue = "value";
        executeOperation(sValue);
    }
    
    void executeOperation(Object obj)
    {
        long value = 0;
        if (obj instanceof Integer) {
            value = ((Integer)obj).intValue();   
        } else {
            value = ((Long)obj).longValue();
        }
    }
}
