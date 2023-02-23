package io.intercom.android.sdk.inbox;

import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.C10110R;
/* loaded from: classes3.dex */
class LoadingViewHolder extends RecyclerView.AbstractC1620e0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public LoadingViewHolder(View view) {
        super(view);
        Resources resources = view.getResources();
        view.getLayoutParams().height = resources.getDimensionPixelSize(C10110R.dimen.intercom_inbox_row_height);
    }
}
