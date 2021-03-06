package sheenrox82.RioV.src.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.Direction;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import sheenrox82.RioV.src.api.util.RioVAPIUtil;
import sheenrox82.RioV.src.base.Config;
import sheenrox82.RioV.src.content.RioVBlocks;
import sheenrox82.RioV.src.content.Sounds;
import sheenrox82.RioV.src.util.Util;
import sheenrox82.RioV.src.world.teleporter.TeleporterVaeryn;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockVaerynPortal extends BlockPortal
{	
	public BlockVaerynPortal()
	{
		super();
		setBlockName(Util.MOD_ID + ":" + "vaerynPortal");
	}

	@Override
	public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
	{
		if ((par5Entity.ridingEntity == null) && (par5Entity.riddenByEntity == null) && ((par5Entity instanceof EntityPlayerMP)))
		{
			EntityPlayerMP player = (EntityPlayerMP) par5Entity;

			if (player.timeUntilPortal > 0)
			{
				player.timeUntilPortal = 300;
			}
			else if (player.dimension != Config.vaerynID)
			{
				player.timeUntilPortal = 300;
				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, Config.vaerynID, new TeleporterVaeryn(player.mcServer.worldServerForDimension(Config.vaerynID)));
			}
			else
			{
				player.timeUntilPortal = 300;
				player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new TeleporterVaeryn(player.mcServer.worldServerForDimension(0)));
			}
			
			player.setInPortal();
		}
	}

	public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
	{
		
	}

	@SideOnly(Side.CLIENT)
	public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
	{
		if (p_149734_5_.nextInt(100) == 0)
		{
			p_149734_1_.playSound((double)p_149734_2_ + 0.5D, (double)p_149734_3_ + 0.5D, (double)p_149734_4_ + 0.5D, Sounds.portal.getPrefixedName(), 0.5F, p_149734_5_.nextFloat() * 0.4F + 0.8F, false);
		}
	}

	public static class Size
	{
		private final World field_150867_a;
		private final int field_150865_b;
		private final int field_150866_c;
		private final int field_150863_d;
		private int field_150864_e = 0;
		private ChunkCoordinates field_150861_f;
		private int field_150862_g;
		private int field_150868_h;
		private static final String __OBFID = "CL_00000285";

		public Size(World p_i45415_1_, int p_i45415_2_, int p_i45415_3_, int p_i45415_4_, int p_i45415_5_)
		{
			this.field_150867_a = p_i45415_1_;
			this.field_150865_b = p_i45415_5_;
			this.field_150863_d = BlockVaerynPortal.field_150001_a[p_i45415_5_][0];
			this.field_150866_c = BlockVaerynPortal.field_150001_a[p_i45415_5_][1];

			for (int i1 = p_i45415_3_; p_i45415_3_ > i1 - 21 && p_i45415_3_ > 0 && this.func_150857_a(p_i45415_1_.getBlock(p_i45415_2_, p_i45415_3_ - 1, p_i45415_4_)); --p_i45415_3_)
			{
				;
			}

			int j1 = this.func_150853_a(p_i45415_2_, p_i45415_3_, p_i45415_4_, this.field_150863_d) - 1;

			if (j1 >= 0)
			{
				this.field_150861_f = new ChunkCoordinates(p_i45415_2_ + j1 * Direction.offsetX[this.field_150863_d], p_i45415_3_, p_i45415_4_ + j1 * Direction.offsetZ[this.field_150863_d]);
				this.field_150868_h = this.func_150853_a(this.field_150861_f.posX, this.field_150861_f.posY, this.field_150861_f.posZ, this.field_150866_c);

				if (this.field_150868_h < 2 || this.field_150868_h > 21)
				{
					this.field_150861_f = null;
					this.field_150868_h = 0;
				}
			}

			if (this.field_150861_f != null)
			{
				this.field_150862_g = this.func_150858_a();
			}
		}

		protected int func_150853_a(int p_150853_1_, int p_150853_2_, int p_150853_3_, int p_150853_4_)
		{
			int j1 = Direction.offsetX[p_150853_4_];
			int k1 = Direction.offsetZ[p_150853_4_];
			int i1;
			Block block;

			for (i1 = 0; i1 < 22; ++i1)
			{
				block = this.field_150867_a.getBlock(p_150853_1_ + j1 * i1, p_150853_2_, p_150853_3_ + k1 * i1);

				if (!this.func_150857_a(block))
				{
					break;
				}

				Block block1 = this.field_150867_a.getBlock(p_150853_1_ + j1 * i1, p_150853_2_ - 1, p_150853_3_ + k1 * i1);

				if (block1 != RioVBlocks.blindoniteBlock)
				{
					break;
				}
			}

			block = this.field_150867_a.getBlock(p_150853_1_ + j1 * i1, p_150853_2_, p_150853_3_ + k1 * i1);
			return block == RioVBlocks.blindoniteBlock ? i1 : 0;
		}

		protected int func_150858_a()
		{
			int i;
			int j;
			int k;
			int l;
			label56:

				for (this.field_150862_g = 0; this.field_150862_g < 21; ++this.field_150862_g)
				{
					i = this.field_150861_f.posY + this.field_150862_g;

					for (j = 0; j < this.field_150868_h; ++j)
					{
						k = this.field_150861_f.posX + j * Direction.offsetX[BlockVaerynPortal.field_150001_a[this.field_150865_b][1]];
						l = this.field_150861_f.posZ + j * Direction.offsetZ[BlockVaerynPortal.field_150001_a[this.field_150865_b][1]];
						Block block = this.field_150867_a.getBlock(k, i, l);

						if (!this.func_150857_a(block))
						{
							break label56;
						}

						if (block == RioVBlocks.vaerynPortal)
						{
							++this.field_150864_e;
						}

						if (j == 0)
						{
							block = this.field_150867_a.getBlock(k + Direction.offsetX[BlockVaerynPortal.field_150001_a[this.field_150865_b][0]], i, l + Direction.offsetZ[BlockVaerynPortal.field_150001_a[this.field_150865_b][0]]);

							if (block != RioVBlocks.blindoniteBlock)
							{
								break label56;
							}
						}
						else if (j == this.field_150868_h - 1)
						{
							block = this.field_150867_a.getBlock(k + Direction.offsetX[BlockVaerynPortal.field_150001_a[this.field_150865_b][1]], i, l + Direction.offsetZ[BlockVaerynPortal.field_150001_a[this.field_150865_b][1]]);

							if (block != RioVBlocks.blindoniteBlock)
							{
								break label56;
							}
						}
					}
				}

			for (i = 0; i < this.field_150868_h; ++i)
			{
				j = this.field_150861_f.posX + i * Direction.offsetX[BlockVaerynPortal.field_150001_a[this.field_150865_b][1]];
				k = this.field_150861_f.posY + this.field_150862_g;
				l = this.field_150861_f.posZ + i * Direction.offsetZ[BlockVaerynPortal.field_150001_a[this.field_150865_b][1]];

				if (this.field_150867_a.getBlock(j, k, l) != RioVBlocks.blindoniteBlock)
				{
					this.field_150862_g = 0;
					break;
				}
			}

			if (this.field_150862_g <= 21 && this.field_150862_g >= 3)
			{
				return this.field_150862_g;
			}
			else
			{
				this.field_150861_f = null;
				this.field_150868_h = 0;
				this.field_150862_g = 0;
				return 0;
			}
		}

		protected boolean func_150857_a(Block p_150857_1_)
		{
			return p_150857_1_.getMaterial() == Material.air || p_150857_1_ == RioVBlocks.whiteFire || p_150857_1_ == RioVBlocks.vaerynPortal;
		}

		public boolean func_150860_b()
		{
			return this.field_150861_f != null && this.field_150868_h >= 2 && this.field_150868_h <= 21 && this.field_150862_g >= 3 && this.field_150862_g <= 21;
		}

		public void func_150859_c()
		{
			for (int i = 0; i < this.field_150868_h; ++i)
			{
				int j = this.field_150861_f.posX + Direction.offsetX[this.field_150866_c] * i;
				int k = this.field_150861_f.posZ + Direction.offsetZ[this.field_150866_c] * i;

				for (int l = 0; l < this.field_150862_g; ++l)
				{
					int i1 = this.field_150861_f.posY + l;
					this.field_150867_a.setBlock(j, i1, k, RioVBlocks.vaerynPortal, this.field_150865_b, 2);
				}
			}
		}
	}

	@Override
	public IIcon getIcon(int par1, int par2)
	{
		return this.blockIcon;
	}

	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister par1IconRegister)
	{
		blockIcon = par1IconRegister.registerIcon(Util.MOD_ID + ":" + RioVAPIUtil.getName(this.getUnlocalizedName()));
	} 
}
