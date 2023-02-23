package io.intercom.android.sdk.blocks;

import io.intercom.android.sdk.blocks.logic.TextSplittingStrategy;
import io.intercom.android.sdk.blocks.models.Block;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class BlockFactory {
    private final TextSplittingStrategy textSplittingStrategy;

    public BlockFactory(TextSplittingStrategy textSplittingStrategy) {
        this.textSplittingStrategy = textSplittingStrategy;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public List getBlocksForText(String str) {
        TextSplittingStrategy $r3 = this.textSplittingStrategy;
        List $r4 = $r3.apply(str);
        int $i0 = $r4.size();
        ArrayList $r1 = new ArrayList($i0);
        for (int $i1 = 0; $i1 < $i0; $i1++) {
            Block.Builder $r5 = new Block.Builder();
            BlockType $r6 = BlockType.PARAGRAPH;
            String $r2 = $r6.name();
            Block.Builder $r52 = $r5.withType($r2.toLowerCase());
            Object $r7 = $r4.get($i1);
            String $r22 = (String) $r7;
            $r1.add($r52.withText($r22));
        }
        return $r1;
    }
}
