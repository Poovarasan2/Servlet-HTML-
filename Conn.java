class Conn
{
    
    public static void main(String args[])
    {
        int number=4;
        String table="tablename";
        //String n="INSERT INTO `registration`(`f_name`, `l-name`, `email`, `date`, `time`, `topic`, `location`) VALUES (?,?,?,?,?,?,?)"
        String name="INSERT INTO `"+table+"` VALUES (";
        //name=name+"arasan";
        for(int i=0;i<number;i++)
        {
            name+="?";
            if(i!=(number-1))
            {
                name+=",";
            }
        }
        name+=")";
        
        System.out.println(name);
    }
}