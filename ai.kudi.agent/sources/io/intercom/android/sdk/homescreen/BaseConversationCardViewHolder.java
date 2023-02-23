package io.intercom.android.sdk.homescreen;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.ColorUtils;
import p201g.p227h.p238l.C7759x;
/* loaded from: classes.dex */
public abstract class BaseConversationCardViewHolder extends RecyclerView.AbstractC1620e0 {
    final Provider<AppConfig> appConfigProvider;
    private HomeClickListener clickListener;
    View.OnClickListener onNewConversationClicked;
    View.OnClickListener onSeePreviousClicked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public BaseConversationCardViewHolder(View view, Provider provider, HomeClickListener homeClickListener) {
        super(view);
        this.onNewConversationClicked = new View.OnClickListener() { // from class: io.intercom.android.sdk.homescreen.BaseConversationCardViewHolder.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BaseConversationCardViewHolder $r3 = BaseConversationCardViewHolder.this;
                HomeClickListener $r1 = $r3.clickListener;
                $r1.onNewConversationClicked();
            }
        };
        this.onSeePreviousClicked = new View.OnClickListener() { // from class: io.intercom.android.sdk.homescreen.BaseConversationCardViewHolder.2
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BaseConversationCardViewHolder $r3 = BaseConversationCardViewHolder.this;
                HomeClickListener $r1 = $r3.clickListener;
                $r1.onSeePreviousClicked();
            }
        };
        this.appConfigProvider = provider;
        this.clickListener = homeClickListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void applyAllConversationButtonStyle(TextView textView) {
        Provider $r3 = this.appConfigProvider;
        Object $r2 = $r3.get();
        AppConfig $r4 = (AppConfig) $r2;
        ColorUtils.setTextColorPrimaryOrBlack(textView, $r4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void applyCardBorderStyle(View view) {
        Provider $r3 = this.appConfigProvider;
        Object $r2 = $r3.get();
        AppConfig $r4 = (AppConfig) $r2;
        ColorUtils.updateInnerBorderColor($r4, view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateButtonBackgroundColor(TextView textView, int i) {
        ColorStateList $r2 = ColorStateList.valueOf(i);
        C7759x.m17490t0(textView, $r2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateLeftDrawableColor(TextView textView, int i) {
        Drawable[] $r3 = textView.getCompoundDrawables();
        for (Drawable $r1 : $r3) {
            if ($r1 != null) {
                PorterDuff.Mode $r2 = PorterDuff.Mode.SRC_IN;
                $r1.setColorFilter(i, $r2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public void updateOlderConversationUnreadState(TextView textView, boolean z) {
        if (!z) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        Context $r2 = textView.getContext();
        int $i0 = C10110R.C10111drawable.intercom_unread_dot;
        Drawable $r3 = C1335a.m36322f($r2, $i0);
        textView.setCompoundDrawablesWithIntrinsicBounds($r3, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
