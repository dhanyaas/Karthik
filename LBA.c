#include<stdio.h>
void main()
{
int outgoing,buff_size,incoming,store=0,n;
printf("Number of packets");
scanf("%d",&n);
printf("Outgoing");
scanf("%d",&outgoing);
printf("Buff_size");
scanf("%d",&buff_size);
while(n!=0)
{
printf("Incoming packet");
scanf("%d",&incoming);
if(incoming<=(buff_size-store))
{
store+=incoming;
printf("Bucket buffer_size %d out of %d",store,buff_size);
}
else
{
printf("dropped %d",incoming-(buff_size-store));
store=buff_size;
}
store=store-outgoing;
printf("Stored value%d\n",store);
n--;
}
}
