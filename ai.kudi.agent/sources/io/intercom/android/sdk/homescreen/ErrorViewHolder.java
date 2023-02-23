package io.intercom.android.sdk.homescreen;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.Provider;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BackgroundUtils;
import io.intercom.android.sdk.utilities.ColorUtils;
import io.intercom.android.sdk.utilities.FontUtils;
/* loaded from: classes.dex */
public class ErrorViewHolder extends RecyclerView.AbstractC1620e0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ErrorViewHolder(View view, Provider provider, final HomeClickListener homeClickListener) {
        super(view);
        int $i0 = C10110R.C10112id.reload_button;
        View $r2 = view.findViewById($i0);
        TextView $r4 = (TextView) $r2;
        $r4.setOnClickListener(new View.OnClickListener() { // from class: io.intercom.android.sdk.homescreen.ErrorViewHolder.1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                HomeClickListener $r22 = homeClickListener;
                $r22.onReloadClicked();
            }
        });
        Object $r6 = provider.get();
        AppConfig $r7 = (AppConfig) $r6;
        applyRetryButtonStyle($r4, $r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private void applyRetryButtonStyle(TextView textView, AppConfig appConfig) {
        Context $r3 = textView.getContext();
        int $i1 = ColorUtils.primaryOrDarkColor($r3, appConfig);
        FontUtils.setRobotoMediumTypeface(textView);
        Drawable $r4 = textView.getBackground();
        int $i0 = C10110R.C10112id.background;
        BackgroundUtils.setRippleButtonStroke($r3, $r4, $i0, $i1);
        textView.setTextColor($i1);
    }
}
