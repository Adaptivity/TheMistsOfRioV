package sheenrox82.RioV.src.render.tileentity.flag;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import org.lwjgl.opengl.GL11;

import sheenrox82.RioV.src.model.ModelFlag;
import sheenrox82.RioV.src.util.Util;

public class RenderTileEntityNoFactionFlag extends TileEntitySpecialRenderer 
{
	private final ModelFlag model;

	public RenderTileEntityNoFactionFlag() 
	{
		this.model = new ModelFlag();
	}

	private void adjustRotatePivotViaMeta(World world, int x, int y, int z) 
	{
		int meta = world.getBlockMetadata(x, y, z);
		GL11.glPushMatrix();
		GL11.glRotatef(meta * (-90), 0.0F, 0.0F, 1.0F);
		GL11.glPopMatrix();
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tileentity, double x, double y, double z, float par8) 
	{
		ResourceLocation textures = (new ResourceLocation(Util.MOD_ID + ":" + "textures/blocks/NoFactionFlag.png")); 
		int metadata = tileentity.getBlockMetadata();

		int rotationAngle = 0;
		
		if(metadata%4 == 2)
		{
			rotationAngle = 270;
		}
		
		if(metadata%4 == 3)
		{
			rotationAngle = 0;
		}
		
		if(metadata%4 == 0)
		{
			rotationAngle = 90;
		}
		
		if(metadata%4 == 1)
		{
			rotationAngle = 180;
		}

		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y + 3F, (float)z + 0.5F);
		GL11.glRotatef(180, 0.0F, 0.0F, 1.0F);
		GL11.glRotatef(rotationAngle, 0.0F, 1.0F, 0.0F);
		GL11.glScalef(2, 2, 2);
		GL11.glPushMatrix();
		this.bindTexture(textures);
		model.renderAll();
		GL11.glPopMatrix();
		GL11.glPopMatrix();
	}
}