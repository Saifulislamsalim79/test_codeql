package io.intercom.android.sdk.views;

import android.view.View;
import androidx.core.content.C1335a;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.identity.AppConfig;
import io.intercom.android.sdk.utilities.BackgroundUtils;
/* loaded from: classes3.dex */
public class ActiveStatePresenter {
    private static final String ENGLISH_LOCALE = "en";

    public void presentStateDot(boolean z, View view, AppConfig appConfig) {
        if (!ENGLISH_LOCALE.equals(appConfig.getLocale())) {
            view.setBackgroundResource(0);
        } else {
            BackgroundUtils.setBackground(view, new ActiveStateDrawable(C1335a.m36324d(view.getContext(), z ? C10110R.color.intercom_active_state : C10110R.color.intercom_away_state), C1335a.m36324d(view.getContext(), C10110R.color.intercom_white), view.getResources().getDisplayMetrics().density * 1.0f));
        }
    }
}
