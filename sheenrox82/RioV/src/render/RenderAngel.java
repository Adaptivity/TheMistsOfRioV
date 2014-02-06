package sheenrox82.RioV.src.render;

import static net.minecraftforge.client.IItemRenderer.ItemRenderType.EQUIPPED;
import static net.minecraftforge.client.IItemRenderer.ItemRendererHelper.BLOCK_3D;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;

import sheenrox82.RioV.src.entity.mob.passive.EntityAngel;
import sheenrox82.RioV.src.lib.EntityResourceLocation;
import sheenrox82.RioV.src.model.ModelDemonAngel;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderAngel extends RenderLiving
{
	public ModelDemonAngel modelBipedMain;

	public RenderAngel()
	{
		super(new ModelDemonAngel(), 0.0F);
		this.modelBipedMain = new ModelDemonAngel();
	}

	public void renderAdv(EntityAngel var1, double var2, double var4, double var6, float var8, float var9)
	{
		super.doRender(var1, var2, var4, var6, var8, var9);
	}

	public void doRender(EntityLiving var1, double var2, double var4, double var6, float var8, float var9)
	{
		renderAdv((EntityAngel)var1, var2, var4, var6, var8, var9);
	}

	public void doRenderLiving(Entity var1, double var2, double var4, double var6, float var8, float var9)
	{
		renderAdv((EntityAngel)var1, var2, var4, var6, var8, var9);
	}

	protected void preRenderScale(EntityAngel par1EntityGiantZombie, float par2)
	{
		GL11.glScalef(0.6F, 0.6F, 0.6F);
	}

	protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
	{
		this.preRenderScale((EntityAngel)par1EntityLivingBase, par2);
	}

	@Override
	protected void renderEquippedItems(EntityLivingBase var1, float var2)
	{
		super.renderEquippedItems(var1, var2);
		ItemStack var3 = var1.getHeldItem();

		if (var3 != null)
		{
			GL11.glPushMatrix();
			this.modelBipedMain.rightarm.postRender(0.0625F);
			GL11.glTranslatef(-0.0625F, 0.4375F, 0.0625F);
			IItemRenderer var5 = MinecraftForgeClient.getItemRenderer(var3, IItemRenderer.ItemRenderType.EQUIPPED);
            boolean is3D = (var5 != null && var5.shouldUseRenderHelper(EQUIPPED, var3, BLOCK_3D));
			float var4;

			if (var3.getItem() instanceof ItemBlock)
			{
				if (is3D || RenderBlocks.renderItemIn3d(Block.getBlockFromItem(var3.getItem()).getRenderType()))
				{
					var4 = 0.5F;
					GL11.glTranslatef(0.0F, 0.1875F, -0.3125F);
					var4 *= 0.75F;
					GL11.glRotatef(20.0F, 1.0F, 0.0F, 0.0F);
					GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
					GL11.glScalef(var4, -var4, var4);
				}
				else if (var3.getItem() == Items.bow)
				{
					var4 = 0.625F;
					GL11.glTranslatef(0.0F, 0.125F, 0.3125F);
					GL11.glRotatef(-20.0F, 0.0F, 1.0F, 0.0F);
					GL11.glScalef(var4, -var4, var4);
					GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
					GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
				}
				else if (var3.getItem().isFull3D())
	            {
	                float f1 = 0.625F;

	                if (var3.getItem().shouldRotateAroundWhenRendering())
	                {
	                    GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
	                    GL11.glTranslatef(0.0F, -0.125F, 0.0F);
	                }

	                this.func_82422_c();
	                GL11.glScalef(f1, -f1, f1);
	                GL11.glRotatef(-100.0F, 1.0F, 0.0F, 0.0F);
	                GL11.glRotatef(45.0F, 0.0F, 1.0F, 0.0F);
	            }
				else
				{
					var4 = 0.375F;
					GL11.glTranslatef(0.25F, 0.1875F, -0.1875F);
					GL11.glScalef(var4, var4, var4);
					GL11.glRotatef(60.0F, 0.0F, 0.0F, 1.0F);
					GL11.glRotatef(-90.0F, 1.0F, 0.0F, 0.0F);
					GL11.glRotatef(20.0F, 0.0F, 0.0F, 1.0F);
				}

				this.renderManager.itemRenderer.renderItem(var1, var3, 0);

				if (var3.getItem().requiresMultipleRenderPasses())
				{
					for (int var7 = 1; var7 < var3.getItem().getRenderPasses(var3.getItemDamage()); ++var7)
					{
						this.renderManager.itemRenderer.renderItem(var1, var3, var7);
					}
				}

				GL11.glPopMatrix();
			}
		}
	}

	protected void func_82422_c()
    {
        GL11.glTranslatef(0.0F, 0.1875F, 0.0F);
    }
	
	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return EntityResourceLocation.angel;
	}
}
