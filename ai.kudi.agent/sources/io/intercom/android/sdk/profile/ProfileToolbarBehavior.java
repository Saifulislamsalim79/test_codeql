package io.intercom.android.sdk.profile;

import android.content.Context;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import io.intercom.android.sdk.C10110R;
import io.intercom.android.sdk.utilities.WindowUtils;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class ProfileToolbarBehavior implements AppBarLayout.InterfaceC4496e {
    float toolbarHeight;

    public ProfileToolbarBehavior(Context context) {
        float dimension = context.getResources().getDimension(C10110R.dimen.intercom_toolbar_height);
        this.toolbarHeight = dimension;
        this.toolbarHeight = dimension + WindowUtils.getStatusBarHeight(context.getResources());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public float getScrollPercentage(View view) {
        return ((view.getBottom() - this.toolbarHeight) / (view.getHeight() - this.toolbarHeight)) * 100.0f;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC4496e, com.google.android.material.appbar.AppBarLayout.InterfaceC4494c
    public abstract /* synthetic */ void onOffsetChanged(AppBarLayout appBarLayout, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAlphaAsPercentageOfScroll(View view, View view2, float f, boolean z) {
        float scrollPercentage = getScrollPercentage(view2);
        if (z) {
            scrollPercentage = 100.0f - scrollPercentage;
        }
        view.setAlpha((f / 100.0f) * scrollPercentage);
    }
}
