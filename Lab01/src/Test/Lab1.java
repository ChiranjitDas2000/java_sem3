package Test;
import java.util.*;
public class Lab1 {
public static void main(String[] args) {
// TODO Auto-generated method stub
String state,capital;
int flag=1;
Scanner sc=new Scanner(System.in);
System.out.println("enter your choice for \n1.HashMap \n2.tree Map ");
int n=sc.nextInt();
if(n==1)
{
TreeMap<String,String> cmap=new TreeMap<>();
while(flag==1) {
System.out.println("1.Create \n2.Display \n3.Search \n4.Remove \n5.update \n6.Sort \n7Size \n8.Clear \nEnter your choice ");
int ch=sc.nextInt();
if(ch==1) {
System.out.println("enter State");
state=sc.next();
System.out.println("enter Capital");
capital = sc.next();
cmap.put(state, capital);
}
else if(ch==2) {
for(Map.Entry<String, String> e:cmap.entrySet())
{
System.out.println(e.getKey()+" "+e.getValue());
}
// System.out.println("========================Other method=======================================");
//
// Iterator <String> it=cmap.keySet().iterator();
//
// while(it.hasNext()) {
//
// String key=(String)it.next();
//
// System.out.println("State "+key+"\tCapital "+cmap.get(key));
//
// }

}
else if(ch==3) {
System.out.println("enter State name to get capital");
state=sc.next();
if(cmap.containsKey(state)) {
System.out.println("State = "+state+"\tCapital = "+cmap.get(state)+"");
}
else {
System.out.println("State not present");
}
}
else if(ch==4) {
System.out.println("enter State to remove");
state = sc.next();
if(cmap.containsKey(state))
{
cmap.remove(state);
}
else
{
System.out.println("State Not Present");
}
}
else if(ch==5) {
System.out.println("Enter the State name to change Capital");
state=sc.next();
System.out.println("Enter the Capital name");
capital = sc.next();
cmap.replace(state, capital);
}
else if(ch==6) {
TreeMap<String, String> sorted = new TreeMap<>();
sorted.putAll(cmap);
//for (Map.Entry<String, String> entry : sorted.entrySet()) {
System.out.println(sorted);
}
else if(ch==7) {
System.out.println(cmap.size());
}
else if(ch==8) {
cmap.clear();
System.out.println("Hash Map is cleared");
System.out.println(cmap.size());
}
else
{
System.out.println("BYEEEEE");
flag=0;
}
}
}
else if(n==2)
{
TreeMap<String,String> tm=new TreeMap<String,String>();
while(flag==1)
{
System.out.println("1.Insert\n2.Display\n3.Sort\n4.Size\n5.Put If Absent"
+ "\n6.Remove\n7.clear\n 8.PollEntry\n9.exit");
int ch=sc.nextInt();
if(ch==1)
{
System.out.println("Enter state");
state=sc.next();
System.out.println("Enter Captial");
capital=sc.next();
tm.put(state,capital);
}
else if(ch==2)
{
Iterator<String> itr=tm.keySet().iterator();
while(itr.hasNext())
{
state=(String)itr.next();
System.out.println(""+state+"\t"+tm.get(state));
}
System.out.println("=================================================");
}
else if(ch==3)
{
TreeMap<String,String> sorted=new TreeMap<>();
sorted.putAll(tm);
for(Map.Entry<String, String> entry:sorted.entrySet()) {
System.out.println(""+entry.getKey()+"\t"+entry.getValue());
}
}
else if(ch==4)
{
System.out.println(tm.size());
}
else if(ch==5)
{
tm.putIfAbsent("Karnataka", "Bengaluru");
}
else if(ch==6)
{
System.out.println("Enter the state");
state=sc.next();
tm.remove("state");
}
else if(ch==7)
{
tm.clear();
}
else if(ch==8)
{
System.out.println(tm.pollLastEntry());
System.out.println(tm.pollFirstEntry());
}
else if(ch==9)
{
System.out.println("Byeeee");
flag=0;
}
}
}
else
{
System.out.println("Invalid");
}
}
}