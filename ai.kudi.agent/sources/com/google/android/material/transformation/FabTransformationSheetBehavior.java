package com.google.android.material.transformation;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.Map;
import p201g.p227h.p238l.C7759x;
import p272h.p286c.p287a.p323c.C9228a;
import p272h.p286c.p287a.p323c.p328m.C9285h;
import p272h.p286c.p287a.p323c.p328m.C9287j;
@Deprecated
/* loaded from: classes2.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    private Map<View, Integer> f12246i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: g0 */
    private void m26176g0(View view, boolean z) {
        ViewParent parent = view.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                this.f12246i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z2 = (childAt.getLayoutParams() instanceof CoordinatorLayout.C1283f) && (((CoordinatorLayout.C1283f) childAt.getLayoutParams()).m36505f() instanceof FabTransformationScrimBehavior);
                if (childAt != view && !z2) {
                    if (!z) {
                        Map<View, Integer> map = this.f12246i;
                        if (map != null && map.containsKey(childAt)) {
                            C7759x.m17478z0(childAt, this.f12246i.get(childAt).intValue());
                        }
                    } else {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.f12246i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C7759x.m17478z0(childAt, 4);
                    }
                }
            }
            if (z) {
                return;
            }
            this.f12246i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    /* renamed from: H */
    public boolean mo26178H(View view, View view2, boolean z, boolean z2) {
        m26176g0(view2, z);
        return super.mo26178H(view, view2, z, z2);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    /* renamed from: e0 */
    protected FabTransformationBehavior.C4830e mo26177e0(Context context, boolean z) {
        int i;
        if (z) {
            i = C9228a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C9228a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C4830e c4830e = new FabTransformationBehavior.C4830e();
        c4830e.f12240a = C9285h.m15223c(context, i);
        c4830e.f12241b = new C9287j(17, 0.0f, 0.0f);
        return c4830e;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
