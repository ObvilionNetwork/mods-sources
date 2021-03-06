package net.divinerpg.dimensions.twilight.skythern;

import com.gamerforea.divinerpg.EventConfig;
import net.divinerpg.utils.DimensionHelper;
import net.divinerpg.utils.config.ConfigurationHelper;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderSkythern extends WorldProvider
{

	@Override
	public void registerWorldChunkManager()
	{
		this.worldChunkMgr = new WorldChunkManagerHell(DimensionHelper.skythernBiome, 0.5F);
		this.dimensionId = ConfigurationHelper.skythern;
		this.isHellWorld = false;
		this.hasNoSky = true;
	}

	@Override
	protected void generateLightBrightnessTable()
	{
		float var1 = 0.1F;

		for (int var2 = 0; var2 <= 15; ++var2)
		{
			float var3 = 1.0F - var2 / 15.0F;
			this.lightBrightnessTable[var2] = (1.0F - var3) / (var3 * 3.0F + 1.0F) * (1.0F - var1) + var1;
		}
	}

	@Override
	public float getCloudHeight()
	{
		return 128.0F;
	}

	@Override
	public IChunkProvider createChunkGenerator()
	{
		return new ChunkProviderSkythern(this.worldObj, this.worldObj.getSeed());
	}

	@Override
	public boolean isSurfaceWorld()
	{
		return false;
	}

	@Override
	public float calculateCelestialAngle(long var1, float var3)
	{
		return 0.5F;
	}

	@Override
	public boolean canRespawnHere()
	{
		return false;
	}

	@Override
	public String getSaveFolder()
	{
		// TODO gamerforEA code start
		if (EventConfig.safeWorldSave)
			return super.getSaveFolder();
		// TODO gamerforEA code end

		return "Skythern";
	}

	@Override
	public String getDimensionName()
	{
		return "Skythern";
	}
}
