package body.FemaleGenitalSystem;

public class Ovary 
{	//卵巢
	boolean ovulationStatus=false;	//排卵状态
	int age;
	boolean LH分泌高峰=false;
	PrimordialFollicles 原始卵泡;
	PrimaryOvarianFollicles 初级卵泡;
	SecondaryFollicles 次级卵泡;
	matureFollicle 成熟卵泡;
	CorporaLuteum 黄体;
	
	public Ovary(int age)
	{
		this.age=age;
		this.卵泡发育();
		if(ovulationStatus){
			this.排卵();
		}
	}
	
	public void 卵泡发育(){
		if(age>0 && age<16){
			原始卵泡=new PrimordialFollicles();
		}
		if(age>=17&&(age<45|age<55)){
			初级卵泡=new PrimaryOvarianFollicles();
			次级卵泡=new SecondaryFollicles();
			成熟卵泡=new matureFollicle();
		}
		if(age>45|age>55){
			原始卵泡=new PrimordialFollicles();
		}
	}
	public void 排卵(){
		LH分泌高峰=true;
		成熟卵泡.卵泡壁破裂=true;
		System.out.println("次级卵母细胞,透明带,放射冠,卵泡液排出，经输卵管伞部捡拾进入输卵管");
		黄体=new CorporaLuteum();
	}
	public void 生成黄体(){
		
	}
	
	class PrimordialFollicles 
	{	//原始卵泡
		
	}
	class PrimaryOvarianFollicles
	{	//初级卵泡
		
	}
	class SecondaryFollicles
	{	//次级卵泡
		
	}
	class matureFollicle
	{	//成熟卵泡
		boolean 卵泡壁破裂=false;
		public matureFollicle()
		{
			ovulationStatus=true;
			
		}
		public void 分泌雌激素(){
			
		}
	}
	class CorporaLuteum
	{	//黄体
		public CorporaLuteum()
		{
			
		}
		public void 分泌雌激素(){
			
		}
		public void 分泌孕激素(){
			
		}
	}
}
