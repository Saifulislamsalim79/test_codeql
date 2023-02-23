package io.intercom.android.sdk.views.decoration;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.commons.utilities.ScreenUtils;
import io.intercom.android.sdk.models.Part;
import java.util.List;
/* loaded from: classes3.dex */
public class ConversationItemDecoration extends RecyclerView.AbstractC1634o {
    private static final int CONCAT_SPACING = 2;
    private static final int DIVIDER_BOTTOM_SPACING = 10;
    private static final int DIVIDER_TOP_SPACING = 16;
    private static final int SPACING = 24;
    private final int concatSpacing;
    private final int headerBottomSpacing;
    private final int headerTopSpacing;
    private final List<Part> parts;
    private final int spacing;

    public ConversationItemDecoration(Context context, List<Part> list) {
        this.parts = list;
        this.spacing = ScreenUtils.dpToPx(24.0f, context);
        this.concatSpacing = ScreenUtils.dpToPx(2.0f, context);
        this.headerTopSpacing = ScreenUtils.dpToPx(16.0f, context);
        this.headerBottomSpacing = ScreenUtils.dpToPx(10.0f, context);
    }

    private boolean nextPartIsDivider(int i) {
        int i2 = i + 1;
        return i2 < this.parts.size() && Part.DAY_DIVIDER_STYLE.equals(this.parts.get(i2).getMessageStyle());
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
        if (m35299f0 == -1 || m35299f0 >= this.parts.size()) {
            return;
        }
        Part part = this.parts.get(m35299f0);
        if (Part.DAY_DIVIDER_STYLE.equals(part.getMessageStyle())) {
            rect.set(0, this.headerTopSpacing, 0, this.headerBottomSpacing);
        } else if (shouldConcatenate(part, m35299f0)) {
            rect.set(0, topSpacingForPartAtPosition(m35299f0), 0, this.concatSpacing);
        } else if (nextPartIsDivider(m35299f0)) {
            rect.set(0, topSpacingForPartAtPosition(m35299f0), 0, 0);
        } else {
            rect.set(0, topSpacingForPartAtPosition(m35299f0), 0, this.spacing);
        }
    }

    boolean shouldConcatenate(Part part, int i) {
        int i2 = i + 1;
        if (i2 < this.parts.size()) {
            return Part.shouldConcatenate(part, this.parts.get(i2));
        }
        return false;
    }
}
