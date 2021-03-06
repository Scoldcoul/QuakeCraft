package madcreeper.quakecraft.ammo;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityRocket extends EntityThrowable 
{

	public EntityRocket(World par1World) 
	{
		super(par1World);

	}
	
	public EntityRocket (World par1World, EntityLivingBase par2EntityLivingBase) 
	{
		super(par1World, par2EntityLivingBase);
		
	}
    
    protected float getGravityVelocity()
    {
        return 0.005F;
    }
	
	@Override
	protected void onImpact(MovingObjectPosition var1) 
	{
		this.worldObj.newExplosion(this, this.posX, this.posY, this.posZ, 4.0F, false, true);
		this.setDead();
	}

	

}
 