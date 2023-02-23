package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
/* loaded from: classes2.dex */
public class Group extends AbstractC1261b {
    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC1261b
    /* renamed from: h */
    public void mo36568h(AttributeSet attributeSet) {
        super.mo36568h(attributeSet);
        this.f3854w = false;
    }

    @Override // androidx.constraintlayout.widget.AbstractC1261b
    /* renamed from: j */
    public void mo36621j(ConstraintLayout constraintLayout) {
        ConstraintLayout.C1255b c1255b = (ConstraintLayout.C1255b) getLayoutParams();
        c1255b.f3810m0.m18263U0(0);
        c1255b.f3810m0.m18221v0(0);
    }

    @Override // androidx.constraintlayout.widget.AbstractC1261b, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m36626d();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        m36626d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        m36626d();
    }
}
