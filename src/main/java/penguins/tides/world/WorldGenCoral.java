package penguins.tides.world;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import penguins.tides.blocks.BlockCoral.Coral;
import penguins.tides.init.TBlocks;

import java.util.Random;

public class WorldGenCoral extends WorldGenerator {
    private static final IBlockState SAND = Blocks.SAND.getDefaultState();
    private static final IBlockState REEF = TBlocks.rock.getDefaultState();
    private static final int numberOfBlocks = 8;

    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {
            int i = rand.nextInt(2) + 2;
            for (int k = position.getX() - i; k <= position.getX() + i; ++k) {
                for (int l = position.getZ() - i; l <= position.getZ() + i; ++l) {
                    int i1 = k - position.getX();
                    int j1 = l - position.getZ();

                    if (i1 * i1 + j1 * j1 <= i * i) {
                        int y = worldIn.getTopSolidOrLiquidBlock(new BlockPos(k, 0, l)).getY();
                        for (int k1 = y - 1; k1 <= y + 1; ++k1) {
                            BlockPos blockpos = new BlockPos(k, k1, l);
                            Block block = worldIn.getBlockState(blockpos).getBlock();
                            Block above1 = worldIn.getBlockState(blockpos.up(1)).getBlock();
                            Block above2 = worldIn.getBlockState(blockpos.up(2)).getBlock();
                            if (above1 == Blocks.WATER && above2 == Blocks.WATER) {
                                if (block == Blocks.DIRT || block == TBlocks.rock || block == Blocks.SAND || block == Blocks.SANDSTONE || block == Blocks.GRAVEL) {
                                    worldIn.setBlockState(blockpos, REEF, 2);
                                }
                            }
                        }

                        BlockPos top = worldIn.getTopSolidOrLiquidBlock(new BlockPos(k, 0, l));
                        if (worldIn.getBlockState(top.down()).getBlock() == TBlocks.rock && worldIn.getBlockState(top.up()).getBlock() == Blocks.WATER) {
                            worldIn.setBlockState(top, TBlocks.coral.getStateFromMeta(rand.nextInt(Coral.values().length)), 2);
                        }
                    }
                }
            }

            return true;
    }
}
