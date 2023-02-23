package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import p201g.p219f.p223b.p224k.C7555a;
import p201g.p219f.p223b.p224k.C7561e;
/* loaded from: classes2.dex */
public class Barrier extends AbstractC1261b {

    /* renamed from: A */
    private int f3755A;

    /* renamed from: B */
    private int f3756B;

    /* renamed from: C */
    private C7555a f3757C;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: p */
    private void m36637p(C7561e c7561e, int i, boolean z) {
        this.f3756B = i;
        if (Build.VERSION.SDK_INT < 17) {
            int i2 = this.f3755A;
            if (i2 == 5) {
                this.f3756B = 0;
            } else if (i2 == 6) {
                this.f3756B = 1;
            }
        } else if (z) {
            int i3 = this.f3755A;
            if (i3 == 5) {
                this.f3756B = 1;
            } else if (i3 == 6) {
                this.f3756B = 0;
            }
        } else {
            int i4 = this.f3755A;
            if (i4 == 5) {
                this.f3756B = 0;
            } else if (i4 == 6) {
                this.f3756B = 1;
            }
        }
        if (c7561e instanceof C7555a) {
            ((C7555a) c7561e).m18330j1(this.f3756B);
        }
    }

    public int getMargin() {
        return this.f3757C.m18334f1();
    }

    public int getType() {
        return this.f3755A;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.AbstractC1261b
    /* renamed from: h */
    public void mo36568h(AttributeSet attributeSet) {
        super.mo36568h(attributeSet);
        this.f3757C = new C7555a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C1276i.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C1276i.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C1276i.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f3757C.m18331i1(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C1276i.ConstraintLayout_Layout_barrierMargin) {
                    this.f3757C.m18329k1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3853f = this.f3757C;
        m36617n();
    }

    @Override // androidx.constraintlayout.widget.AbstractC1261b
    /* renamed from: i */
    public void mo36622i(C7561e c7561e, boolean z) {
        m36637p(c7561e, this.f3755A, z);
    }

    /* renamed from: o */
    public boolean m36638o() {
        return this.f3757C.m18336d1();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f3757C.m18331i1(z);
    }

    public void setDpMargin(int i) {
        C7555a c7555a = this.f3757C;
        c7555a.m18329k1((int) ((i * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f3757C.m18329k1(i);
    }

    public void setType(int i) {
        this.f3755A = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
