package body.FemaleGenitalSystem;

public class Ovary 
{	//�ѳ�
	boolean ovulationStatus=false;	//����״̬
	int age;
	boolean LH���ڸ߷�=false;
	PrimordialFollicles ԭʼ����;
	PrimaryOvarianFollicles ��������;
	SecondaryFollicles �μ�����;
	matureFollicle ��������;
	CorporaLuteum ����;
	
	public Ovary(int age)
	{
		this.age=age;
		this.���ݷ���();
		if(ovulationStatus){
			this.����();
		}
	}
	
	public void ���ݷ���(){
		if(age>0 && age<16){
			ԭʼ����=new PrimordialFollicles();
		}
		if(age>=17&&(age<45|age<55)){
			��������=new PrimaryOvarianFollicles();
			�μ�����=new SecondaryFollicles();
			��������=new matureFollicle();
		}
		if(age>45|age>55){
			ԭʼ����=new PrimordialFollicles();
		}
	}
	public void ����(){
		LH���ڸ߷�=true;
		��������.���ݱ�����=true;
		System.out.println("�μ���ĸϸ��,͸����,�����,����Һ�ų��������ѹ�ɡ����ʰ�������ѹ�");
		����=new CorporaLuteum();
	}
	public void ���ɻ���(){
		
	}
	
	class PrimordialFollicles 
	{	//ԭʼ����
		
	}
	class PrimaryOvarianFollicles
	{	//��������
		
	}
	class SecondaryFollicles
	{	//�μ�����
		
	}
	class matureFollicle
	{	//��������
		boolean ���ݱ�����=false;
		public matureFollicle()
		{
			ovulationStatus=true;
			
		}
		public void ���ڴƼ���(){
			
		}
	}
	class CorporaLuteum
	{	//����
		public CorporaLuteum()
		{
			
		}
		public void ���ڴƼ���(){
			
		}
		public void �����м���(){
			
		}
	}
}
