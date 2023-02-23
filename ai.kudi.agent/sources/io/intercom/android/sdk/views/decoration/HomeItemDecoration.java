package io.intercom.android.sdk.views.decoration;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import java.util.List;
/* loaded from: classes3.dex */
public class HomeItemDecoration extends RecyclerView.AbstractC1634o {
    private static final int SPACING_DP = 8;
    private final List<Object> cards;
    private final int spacing;

    public HomeItemDecoration(Context context, List<Object> list) {
        this.cards = list;
        this.spacing = ScreenUtils.dpToPx(8.0f, context);
    }

    private int topSpacingForPartAtPosition(int i) {
        if (i == 0) {
            return this.spacing;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1634o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1614b0 c1614b0) {
        int m35299f0 = recyclerView.m35299f0(view);
        if (m35299f0 == -1 || m35299f0 >= this.cards.size()) {
            return;
        }
        rect.set(0, topSpacingForPartAtPosition(m35299f0), 0, this.spacing);
    }
}
