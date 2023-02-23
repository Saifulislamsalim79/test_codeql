package io.intercom.android.sdk.blocks;

import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.blocks.blockInterfaces.ParagraphBlock;
import io.intercom.android.sdk.blocks.views.ParagraphView;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BlockUtils;
/* loaded from: classes.dex */
class Paragraph implements ParagraphBlock {
    private final Provider<AppConfig> appConfigProvider;
    private final StyleType style;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Paragraph(StyleType styleType, Provider provider) {
        this.style = styleType;
        this.appConfigProvider = provider;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // io.intercom.android.sdk.blocks.blockInterfaces.ParagraphBlock
    public View addParagraph(Spanned spanned, BlockAlignment blockAlignment, boolean z, boolean z2, ViewGroup viewGroup) {
        Context $r5 = viewGroup.getContext();
        StyleType $r6 = this.style;
        Provider $r7 = this.appConfigProvider;
        Object $r8 = $r7.get();
        AppConfig $r9 = (AppConfig) $r8;
        TextView r12 = new ParagraphView($r5, $r6, blockAlignment, $r9);
        StyleType $r62 = StyleType.PREVIEW;
        StyleType $r10 = this.style;
        if ($r62 == $r10) {
            CharSequence $r11 = spanned.toString();
            TextView r13 = r12;
            r13.setText($r11);
        } else {
            TextView r132 = r12;
            r132.setText(spanned);
        }
        int $i0 = blockAlignment.getGravity();
        TextView r14 = r12;
        BlockUtils.setLayoutMarginsAndGravity(r14, $i0, z2);
        TextView r142 = r12;
        return r142;
    }
}
