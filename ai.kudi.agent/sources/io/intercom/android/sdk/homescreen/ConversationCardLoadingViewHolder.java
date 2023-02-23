package io.intercom.android.sdk.homescreen;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.ColorUtils;
/* loaded from: classes.dex */
class ConversationCardLoadingViewHolder extends RecyclerView.AbstractC1620e0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ConversationCardLoadingViewHolder(View view, Provider provider) {
        super(view);
        int $i0 = C10110R.C10112id.loading_layout;
        View $r1 = view.findViewById($i0);
        FrameLayout $r3 = (FrameLayout) $r1;
        Object $r4 = provider.get();
        AppConfig $r5 = (AppConfig) $r4;
        ColorUtils.updateInnerBorderColor($r5, $r3);
    }
}
