package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.blocks.blockInterfaces.CodeBlock;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.utilities.BlockUtils;
/* loaded from: classes.dex */
class Code implements CodeBlock {
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    private TextView getCodeBlockView(Spanned spanned, Context context) {
        TextView $r1 = new TextView(context);
        int $i0 = C10110R.color.intercom_white;
        $r1.setTextColor(C1335a.m36324d(context, $i0));
        $r1.setTextSize(14.0f);
        $r1.setText(spanned);
        int $i02 = ScreenUtils.dpToPx(14.0f, context);
        int $i1 = ScreenUtils.dpToPx(12.0f, context);
        int $i2 = ScreenUtils.dpToPx(14.0f, context);
        int $i3 = ScreenUtils.dpToPx(14.0f, context);
        $r1.setPadding($i02, $i1, $i2, $i3);
        int $i03 = C10110R.color.intercom_slate_grey_two;
        $r1.setBackgroundResource($i03);
        Typeface $r4 = Typeface.MONOSPACE;
        $r1.setTypeface($r4);
        BlockUtils.createLayoutParams($r1, -2, -2);
        BlockUtils.setDefaultMarginBottom($r1);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.CodeBlock
    public View addCode(Spanned spanned, boolean z, boolean z2, ViewGroup viewGroup) {
        Context $r3 = viewGroup.getContext();
        TextView $r4 = getCodeBlockView(spanned, $r3);
        BlockUtils.setLayoutMarginsAndGravity($r4, 3, z2);
        return $r4;
    }
}
