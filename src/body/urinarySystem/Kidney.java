package body.urinarySystem;

public class Kidney 
{	//肾脏
	
	
	public Kidney()
	{
		CorticalNephron 皮质肾单位=new CorticalNephron();
		JuxtamedullaryNephron 近髓质肾单位=new JuxtamedullaryNephron();
		RenalTubulus 肾小管=new RenalTubulus();
		CollectingDuct 集合管=new CollectingDuct();
		JuxtaglomerularCell 球旁细胞=new JuxtaglomerularCell();
		ExtraglomerularMesangialCell 球外系膜细胞=new ExtraglomerularMesangialCell();
		MaculaDensa 致密斑=new MaculaDensa();
	}
	
	
	class CorticalNephron 
	{	//皮质肾单位
		
	}
	class JuxtamedullaryNephron 
	{	//近髓质肾单位
		
	}
	class RenalTubulus
	{	//肾小管
		
	}
	class CollectingDuct
	{	//集合管
		
	}
	class JuxtaglomerularCell
	{	//球旁细胞
		public void 分泌肾素(){
			
		}
	}
	class ExtraglomerularMesangialCell
	{	//球外系膜细胞
		
	}
	class MaculaDensa
	{	//致密斑
		public void 感受(){
			
		}
	}
}
