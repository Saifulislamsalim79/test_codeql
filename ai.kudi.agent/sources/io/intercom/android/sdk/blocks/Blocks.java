package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.view.LayoutInflater;
import io.intercom.android.sdk.twig.Twig;
/* loaded from: classes.dex */
public class Blocks {
    private final LayoutInflater inflater;
    private final Twig twig;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Blocks(Context context, Twig twig) {
        LayoutInflater $r2 = LayoutInflater.from(context);
        this.inflater = $r2;
        this.twig = twig;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:6:0x001c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.LinearLayout createBlocks(java.util.List r25, io.intercom.android.sdk.blocks.BlocksViewHolder r26) {
        /*
            r24 = this;
            r0 = r24
            android.view.LayoutInflater r6 = r0.inflater
            r0 = r26
            int r7 = r0.getLayout()
            r9 = 0
            android.view.View r8 = r6.inflate(r7, r9)
            r11 = r8
            android.widget.LinearLayout r11 = (android.widget.LinearLayout) r11
            r10 = r11
            if (r25 == 0) goto L7e
            r7 = 0
        L16:
            r0 = r25
            int r12 = r0.size()
            if (r7 >= r12) goto L7e
            r0 = r25
            java.lang.Object r13 = r0.get(r7)
            r15 = r13
            io.intercom.android.sdk.blocks.models.Block r15 = (io.intercom.android.sdk.blocks.models.Block) r15
            r14 = r15
            if (r7 != 0) goto L2d
            r16 = 1
            goto L2f
        L2d:
            r16 = 0
        L2f:
            r0 = r25
            int r12 = r0.size()
            r17 = 1
            r0 = r17
            int r12 = r12 - r0
            if (r7 != r12) goto L3f
            r18 = 1
            goto L41
        L3f:
            r18 = 0
        L41:
            io.intercom.android.sdk.blocks.BlockType r19 = r14.getType()     // Catch: io.intercom.android.sdk.blocks.BlockTypeNotImplementedException -> L57
            r0 = r19
            r1 = r26
            r2 = r14
            r3 = r10
            r4 = r16
            r5 = r18
            android.view.View r8 = r0.getView(r1, r2, r3, r4, r5)     // Catch: io.intercom.android.sdk.blocks.BlockTypeNotImplementedException -> L57
            r10.addView(r8)     // Catch: io.intercom.android.sdk.blocks.BlockTypeNotImplementedException -> L57
            goto L7b
        L57:
            r20 = move-exception
            r0 = r24
            io.intercom.android.sdk.twig.Twig r0 = r0.twig
            r21 = r0
            r17 = 1
            r0 = r17
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r22 = r0
            io.intercom.android.sdk.blocks.BlockType r19 = r14.getType()
            r17 = 0
            r22[r17] = r19
            java.lang.String r23 = "Error creating view for block with type %s "
            r0 = r21
            r1 = r20
            r2 = r23
            r3 = r22
            r0.m13066e(r1, r2, r3)
        L7b:
            int r7 = r7 + 1
            goto L16
        L7e:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.intercom.android.sdk.blocks.Blocks.createBlocks(java.util.List, io.intercom.android.sdk.blocks.BlocksViewHolder):android.widget.LinearLayout");
    }
}
